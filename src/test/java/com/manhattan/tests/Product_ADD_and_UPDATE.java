package com.manhattan.tests;

import static io.restassured.RestAssured.given;

import java.io.IOException;
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

import com.manhattan.common.RestUtilities;
import com.manhattan.common.ReusableMethods;
import com.manhattan.constants.Paths;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import page.classes.HomePage;
import page.classes.ItemsPage;
import page.classes.LoginPage;
import page.classes.MenuPage;
import payloads.Product_XML;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Product_ADD_and_UPDATE {
	
	private static Logger log = LogManager.getLogger(Product_ADD_and_UPDATE.class.getName());
	
	static String masterProdNumber;
	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	
	WebDriver driver;
	String url = "https://fergs.omni.manh.com/omnifacade/index.html";
	
	@BeforeClass
	public static void init() {
		log.info("********** BEGIN TEST **********");
		
		masterProdNumber = ReusableMethods.masterProductNo();		
	}
	
	@Before
	public void setUp() throws IOException, Exception {
		reqSpec = RestUtilities.getRequestSpecification_BACKUP();
		reqSpec.body(Product_XML.productData(
				masterProdNumber,
				ReusableMethods.dateTime_STEP_UPDT(),
				"KJT-" + ReusableMethods.dateTime(),
				ReusableMethods.dateTime_PubSub_Revision()));
		
		resSpec = RestUtilities.getResponseSpecification();
	}
	
	@Test
	public void testA_addProduct() throws IOException {
		
		log.info("Master Product Number entered: " + masterProdNumber);
		
		given()
			.spec(reqSpec)
		.when()
			.post(Paths.BASE_PATH)
		.then()
			.spec(resSpec);
		
		ReusableMethods.verifyMongoData("product", "_id", masterProdNumber);
		
	}
	
	@Test
	public void testB_updateProduct() throws IOException {
		log.info("Master Product Number entered: " + masterProdNumber);
		
		given()
			.spec(reqSpec)
		.when()
			.post(Paths.BASE_PATH)
		.then()
			.spec(resSpec);
		
		ReusableMethods.verifyMongoData("product", "_id", masterProdNumber);
	}
	
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
