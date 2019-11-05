package test_framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.classes.HomePage;
import page.classes.LoginPage;
import page.classes.MenuPage;

public class PageObjectModel {
	
	static WebDriver driver;
	static String url = "https://fergs.omni.manh.com/omnifacade/index.html";
	
	@BeforeClass
	public static void setUp() {
		driver = utilities.DriverFactory.open("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		LoginPage.enterUsername(driver);
		LoginPage.clickSubmitUsernameButton(driver);
		
		LoginPage.enterPassword(driver);
		LoginPage.clickLogInButton(driver);
		
		HomePage.openMenu(driver);	
		
		// MenuPage.navigateToInventorySupplyPage(driver);
		// MenuPage.navigateToInventoryLocationPage(driver);
		// MenuPage.navigateToInventoryLocationAttributesPage(driver);
		// MenuPage.navigateToLocationsPage(driver);
		// MenuPage.navigateToItemsPage(driver);
		MenuPage.navigateToInventoryAPIDocumentationPage(driver);
		
		// ItemsPage.searchForItemId(driver, "4582200");
		// InventoryLocationPage.searchForLocationId(driver, "TR~DC~235ACH");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		System.out.println("*** Test Complete ***");
		driver.close();
	}

}
