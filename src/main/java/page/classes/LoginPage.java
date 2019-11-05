package page.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private static Logger log = LogManager.getLogger(LoginPage.class.getName());
	static Properties prop = new Properties();
	
	public static WebElement element = null;
	public static String string = null;
	
	public static String pageTitle(WebDriver driver) {
		try {
			string = driver.getTitle();
			log.info("Web Page title:" + string);
		} catch (Exception e) {
			log.error(e);
		}
		return string;
	}
	
	public static WebElement username(WebDriver driver) {
		try {
			element = driver.findElement(By.id("login-username"));
			log.info("'Username' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement submitButton(WebDriver driver) {
		try {
			element = driver.findElement(By.id("discover-user-submit"));
			log.info("[Submit] button located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		try {
			element = driver.findElement(By.id("login-password"));
			log.info("'Password' text field located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;		
	}
	
	public static WebElement logInButton(WebDriver driver) {
		try {
			element = driver.findElement(By.id("login-submit"));
			log.info("[Log In] button located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static void enterUsername(WebDriver driver) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "writer.properties");
		prop.load(fis);
		try {
			String u_name = prop.getProperty("UN");
			username(driver).sendKeys(decodeStr(u_name));
			log.info("Username sent to UI");
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void clickSubmitUsernameButton(WebDriver driver) {
		try {
			submitButton(driver).click();
			log.info("[Submit] button was clicked.");
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void enterPassword(WebDriver driver) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "writer.properties");
		prop.load(fis);
		try {
			String encodedPassword = prop.getProperty("PSWD");
			password(driver).sendKeys(decodeStr(encodedPassword));
			log.info("Password sent to UI");
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static String decodeStr(String encodeStr) {
		byte[] decoded = Base64.decodeBase64(encodeStr);
		return new String(decoded);
	}
	
	public static void clickLogInButton(WebDriver driver) {		
		try {
			logInButton(driver).click();
			log.info("[Log In] button was clicked.");
		} catch (Exception e) {
			log.error(e);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'OMNI ENTERPRISE')]"));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (NoSuchElementException e) {
			log.error(e);
		}		
	}
	
	public static void logIntoManhattanUI(WebDriver driver) throws IOException {
		enterUsername(driver);
		clickSubmitUsernameButton(driver);
		enterPassword(driver);
		clickLogInButton(driver);
	}

}
