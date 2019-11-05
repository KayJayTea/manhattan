package OLD_Scripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.manhattan.common.ReusableMethods;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import page.classes.HomePage;
import page.classes.ItemsPage;
import page.classes.LoginPage;
import page.classes.MenuPage;
import payloads.Product_XML;
import resources.Resources;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Product_ADD_and_UPDATE2 {
	
	private static Logger log = LogManager.getLogger(Product_ADD_and_UPDATE2.class.getName());
	
	Properties prop = new Properties();
	WebDriver driver;
	String url = "https://fergs.omni.manh.com/omnifacade/index.html";
	static String masterProdNumber;
	RequestSpecBuilder requestBuilder;
	RequestSpecification requestSpec;
	ResponseSpecBuilder responseBuilder;
	ResponseSpecification responseSpec;
	
	@BeforeClass
	public static void init() {
		log.info("********** BEGIN TEST **********");
		
		masterProdNumber = ReusableMethods.masterProductNo();
	}
	
	@Before
	public void setUp() throws IOException, Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "writer.properties");
		prop.load(fis);
		// RestAssured.baseURI = prop.getProperty("HOST_MDM_PRODUCT");
		RestAssured.baseURI = prop.getProperty("HOST_MDM_PRODUCT2");
		
		/** Build the REQUEST Specifications **/
		requestBuilder = new RequestSpecBuilder();
		requestBuilder.setBody(Product_XML.productData(
				masterProdNumber,
				ReusableMethods.dateTime_STEP_UPDT(),
				"KJT-" + ReusableMethods.dateTime(),
				ReusableMethods.dateTime_PubSub_Revision()));
		
		requestSpec = requestBuilder.build();
		
		/** Build the RESPONSE specifications **/
		responseBuilder = new ResponseSpecBuilder();
		
		responseBuilder.expectStatusCode(200);
		responseBuilder.expectHeader("Server", "Apache-Coyote/1.1");
		responseBuilder.expectHeader("Content-Type", "application/xml");
		responseBuilder.expectHeader("Transfer-Encoding", "chunked");
		
		responseBuilder.expectBody("response.isError", equalTo("false"));
		responseBuilder.expectBody("response.respMsg", equalTo("Success"));
		responseBuilder.expectBody("response.respCode", equalTo("200"));
		
		responseSpec = responseBuilder.build();
	}
	
	@Test
	public void testA_addProduct() throws IOException {
		
		log.info("Master Product Number entered: " + masterProdNumber);
		
		given()
			.spec(requestSpec).log().all()
			.when()
			.post(Resources.resource_product())
			.then()
			.log().all()
			.spec(responseSpec);
		
		ReusableMethods.verifyMongoData("product", "_id", masterProdNumber);
		
	}
	
//	@Test
//	public void testB_updateProduct() throws IOException {
//		log.info("Master Product Number entered: " + masterProdNumber);
//		
//		given()
//			.spec(requestSpec)
//			.when()
//			.post(Resources.resource_product())
//			.then()
//			.spec(responseSpec);
//		
//		ReusableMethods.verifyMongoData("product", "_id", masterProdNumber);
//	}
	
	@After
	public void verifyMongoDB() throws Exception {
		driver = utilities.DriverFactory.open("chrome");
		log.info("Chrome browser opened.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Browser window maximized.");
		driver.get(url);
		log.info("Manhattan UI webpage opened");
		
		LoginPage.logIntoManhattanUI(driver);
		HomePage.openMenu(driver);
		MenuPage.navigateToItemsPage(driver);
		ItemsPage.searchByItemId(driver, masterProdNumber);
		
		Thread.sleep(5000);
		
		ReusableMethods.verifyMongoData("hash", "recordId", masterProdNumber);
		driver.quit();
	}
	
	@AfterClass
	public static void tearDown() {
		log.info("********** END TEST **********");
	}
}
