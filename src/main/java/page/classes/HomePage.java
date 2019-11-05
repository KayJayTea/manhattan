package page.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
public static Logger log = LogManager.getLogger(HomePage.class.getName()); 
	
	public static WebElement element = null;
	public static String string = null;
	
	public static WebElement menu(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath(
					"/html/body/my-app/md-sidenav-layout/div[2]/md-toolbar/div/md-toolbar-row/button[1]"));
			log.info("Menu located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static void openMenu(WebDriver driver) {
		try {
			menu(driver).click();
			log.info("Menu was clicked.");
		} catch (Exception e) {
			log.error(e);
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//span[text()='Master Data']"))));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}

}
