package test_framework;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.classes.HomePage;
import page.classes.ItemsPage;
import page.classes.LoginPage;
import page.classes.MenuPage;

public class Tests_ItemsPage {
	
	public static Logger log = LogManager.getLogger(Tests_ItemsPage.class.getName());
	
	WebDriver driver;
	String url = "https://fergs.omni.manh.com/omnifacade/index.html";
	
	@Before
	public void setUp() {
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
		
		MenuPage.navigateToItemsPage(driver);
		ItemsPage.searchByItemId(driver, "1570541852348");
		
		Thread.sleep(2000);
		
		/** PRACTICE CODE **/
		try {
			WebElement info_btn = driver.findElement(By.xpath("//button[@title='More']"));
			info_btn.click();
		} catch (Exception e) {
			log.error(e);
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//div[contains(@id, 'cdk-')]"))));
		
		WebElement el1 = driver.findElement(By.xpath("//div[contains(@id, 'mat-dialog-title-')]"));
		String text1 = el1.getText();
		System.out.println(text1);
		
		List<WebElement> elements = driver.findElements(By.xpath(
				"//mat-dialog-container//span[@class='label']"));
		
		for (int i = 1; i <= elements.size(); i++) {
			String element = driver.findElement(By.xpath(
					"//mat-dialog-container[contains(@id, 'mat-dialog-')]/div[2]/div["+ i +"]")).getText();
			System.out.println(element);
		}
		
		WebElement itemId = driver.findElement(By.xpath(
				"//mat-dialog-container[contains(@id, 'mat-dialog-')]/div[2]/div[1]"));
		String itemIdText = itemId.getText();
		
		assertEquals("Item Id entered equals the Item Id entered.", "Item Id 1570541852348", itemIdText);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("*** Test Complete ***");
		Thread.sleep(3000);
		driver.close();
	}

}
