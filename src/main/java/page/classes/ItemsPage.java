package page.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemsPage {
	
public static Logger log = LogManager.getLogger(ItemsPage.class.getName());
	
	public static WebElement element = null;
	public static String string = null;
	
	/** ELEMENTS **/
	public static WebElement menu(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath(
					"/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]"));
			log.info("Menu located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement itemIdTextField(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='Item Id']"));
			log.info("'Item Id' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement shortDescriptionTextField(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='Short Description']"));
			log.info("'Short Description' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement styleTextField(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='Style']"));
			log.info("'Style' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement colorTextField(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='Color']"));
			log.info("'Color' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement sizeTextField(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='Size']"));
			log.info("'Size' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement brandTextField(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='Brand']"));
			log.info("'Brand' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement greenCheckMark(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		try {
			element = driver.findElement(By.xpath("//mat-icon[contains(text(), 'done')]"));
			log.info("Green check mark located.");
		} catch (ElementNotVisibleException e) {
			log.error(e);
		}
		return element;
	}
	
	/** ACTIONS 
	 * @throws InterruptedException **/
	public static void clickItemIdTextField(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		try {
			itemIdTextField(driver).click();
			log.info("'Item Id' text field was clicked.");
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void enterItemId(WebDriver driver, String item) throws InterruptedException {
		Thread.sleep(2000);
		try {
			itemIdTextField(driver).sendKeys(item);
			log.info("Keys sent to UI: " + item);
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void clickGreenCheckMark(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		try {
			greenCheckMark(driver).click();
			log.info("Green Check Mark clicked.");
		} catch (ElementNotVisibleException e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//mat-card[1]"))));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void searchByItemId(WebDriver driver, String itemId) throws InterruptedException {
		clickItemIdTextField(driver);
		enterItemId(driver, itemId);
		clickGreenCheckMark(driver);
	}

}
