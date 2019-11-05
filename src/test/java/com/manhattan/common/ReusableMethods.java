package com.manhattan.common;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	private static Logger log = LogManager.getLogger(ReusableMethods.class.getName());
	static Properties prop = new Properties();
	
	public static XmlPath rawToXML(Response r) {
		String raw_resp = r.asString();
		XmlPath xml = new XmlPath(raw_resp);
		
		return xml;
	}
	
	public static JsonPath rawToJSON(Response r) {
		String raw_resp = r.asString();
		JsonPath json = new JsonPath(raw_resp);
		
		return json;
	}
	
	public static String dateTime() {
		LocalDateTime myDateObj = LocalDateTime.now(); 
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 	    
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    return formattedDate;
	}
	
	public static String dateTime_PubSub_Revision() {
		LocalDateTime myDateObj = LocalDateTime.now(); 
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 	    
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    return formattedDate;
	}
	
	public static String dateTime_STEP_UPDT() {
		LocalDateTime myDateObj = LocalDateTime.now(); 
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy"); 	    
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    return formattedDate;
	}
	
	public static Long syncId() {
		Date d = new Date();
	    Long sync_id = d.getTime();
	    System.out.println(sync_id);
	    
	    return sync_id;
	}
	
	public static String masterProductNo() {
		Date d = new Date();
	    String masterProd = new Long(d.getTime()).toString();
	    
	    return masterProd;
	}
	
	public static String mongo_un() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "writer.properties");
		prop.load(fis);
		
		String u_name = prop.getProperty("MONGO_UN");
		byte[] decode = Base64.decodeBase64(u_name);
		
		return new String(decode);
	}
	
	public static String mongo_pwd() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "writer.properties");
		prop.load(fis);
		
		String pwd = prop.getProperty("MONGO_PWD");
		byte[] decode = Base64.decodeBase64(pwd);
		
		return new String(decode);
	}
	
	@SuppressWarnings("deprecation")
	public static void verifyMongoData(String coll, String key, String value) throws IOException {
		// code to create the connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://"+mongo_un()+":"+mongo_pwd()+"@fei-dev-rti-001-wio8i.azure.mongodb.net");
		@SuppressWarnings("resource")
		MongoClient mongoClient = new MongoClient(uri);
		// code to connect to database
		MongoDatabase mongoDB = mongoClient.getDatabase("eventMessages");
		MongoCollection<Document> collection = mongoDB.getCollection(coll);
		Block<Document> printBlock = new Block<Document>() {
			public void apply(final Document document) {
				String jsonData = document.toJson();
				System.out.println(jsonData);
				log.info(jsonData + "\n");
				
//				String eventMeta_type = JsonPath.with(jsonData).get("eventMeta.type");
//				System.out.println(eventMeta_type);
//				
//				String eventMeta_syncid = JsonPath.with(jsonData).get("eventMeta.syncid.$numberLong");
//				System.out.println(eventMeta_syncid);
//
//				Assert.assertEquals("UPDATE", eventMeta_type);
//				Assert.assertEquals(value, eventMeta_syncid);
//				
//				Assert.assertTrue(eventMeta_syncid, true);
			}
		};
		
		if (coll.equalsIgnoreCase("product")) {
		collection.find(eq(key, value))
			.projection(fields(include(
					"eventMeta.type",
					"eventMeta.syncid"),
					excludeId()))
			.forEach(printBlock);
		} else if (coll.equalsIgnoreCase("hash")) {
			collection.find(eq(key, value))
			.projection(fields(include(
					"hashCode"),
					excludeId()))
			.forEach(printBlock);
		}
	}
}
