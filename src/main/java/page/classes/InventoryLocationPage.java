package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryLocationPage {
	
	public static WebElement element = null;
	public static String string = null;
	
	/** ELEMENTS **/
	public static WebElement menu(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//mat-toolbar/button[1]"));
		return element;
	}
	
	public static WebElement locationIdTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Location ID']"));
		return element;
	}
	
	public static WebElement displayIdTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Display ID']"));
		return element;
	}
	
	public static WebElement locationStatusIdTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Location Status ID']"));
		return element;
	}
	
	public static WebElement locationTypeIdTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Location Type ID']"));
		return element;
	}
	
	public static WebElement locationSubTypeIdTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Location Sub Type ID']"));
		return element;
	}
	
	public static WebElement locationNameTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Location Name']"));
		return element;
	}
	
	public static WebElement greenCheckMark(WebDriver driver) {
		element = driver.findElement(By.xpath("//mat-icon[contains(text(), 'done')]"));
		return element;
	}
	
	/** ACTIONS 
	 * @throws InterruptedException **/
	public static void searchForLocationId(WebDriver driver, String locId) throws InterruptedException {
		Thread.sleep(2000);
		locationIdTextField(driver).click();
		Thread.sleep(500);
		locationIdTextField(driver).sendKeys(locId);
		greenCheckMark(driver).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//mat-card[1]"))));
	}

}
