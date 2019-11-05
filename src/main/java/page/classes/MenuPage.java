package page.classes;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	
private static Logger log = LogManager.getLogger(MenuPage.class.getName());
	
	public static WebElement element = null;
	public static String string = null;
	
	public static WebElement home(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[text()='Home']"));
			log.info("'Home' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement availableToCommerce(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Available to Commerce')]"));
			log.info("'Avaialable to Commerce' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement inventorySupply(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Inventory Supply')]"));
			log.info("'Inventory Supply' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement applicationConfiguration(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Application Configuration')]"));
			log.info("'Application Configuration' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement manageInventoryConfiguration(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Manage Inventory Configuration')]"));
			log.info("'Manage Inventory Configuration' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement inventoryLocation(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Inventory Location')]"));
			log.info("'Inventory Location' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement inventoryLocationAttributes(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Inventory Location Attributes')]"));
			log.info("'Inventory Location Attributes' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement masterData(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Master Data')]"));
			log.info("'Master Data' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement manageLocations(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Manage Locations')]"));
			log.info("'Manage Locations' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement locations(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[text()='Locations']"));
			log.info("'Locations' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement manageItems(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Manage Items')]"));
			log.info("'Manage Items' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement items(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[text()='Items']"));
			log.info("'Items' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement developerResources(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Developer Resources')]"));
			log.info("'Developer Resources' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement inventory(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[text()='Inventory']"));
			log.info("'Inventory' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement inventoryAPIDocumentation(WebDriver driver) {
		try {
			element = driver.findElement(By.linkText("Inventory API Documentation"));
			log.info("'Inventory API Documentation' link located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement organization(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[text()='Organization']"));
			log.info("'Organization' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		
		return element;
	}
	
	public static WebElement organizationAPIDocumentation(WebDriver driver) {
		try {
			element = driver.findElement(By.linkText("Organization API Documentation"));
			log.info("'Organization API Documnetation' link located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement item(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//span[text()='Item']"));
			log.info("'Item' option located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static WebElement itemAPIDocumentation(WebDriver driver) {
		try {
			element = driver.findElement(By.linkText("Item API Documentation"));
			log.info("'Item API Documentation' link located.");
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
		return element;
	}
	
	public static void clickHome(WebDriver driver) {
		try {
			home(driver).click();
			log.info("'Home' option selected");
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void clickAvaialableToCommerceOption(WebDriver driver) {
		availableToCommerce(driver).click();
		// TODO
		/** complete code that shows new tab opening when 
		 * "Available to Commerce" option is selected
		**/
	}
	
	public static void clickInventorySupplyOption(WebDriver driver) {
		try {
			inventorySupply(driver).click();
			log.info("'Inventory Supply' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//span[text()='SUPPLY']"))));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickApplicationConfigurationOption(WebDriver driver) {
		try {
			applicationConfiguration(driver).click();
			log.info("'Application Configuration' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(manageInventoryConfiguration(driver)));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickManagaeInventoryConfigurationOption(WebDriver driver) {
		try {
			manageInventoryConfiguration(driver).click();
			log.info("'Manage Inventory Configuration' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(inventoryLocation(driver)));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickInventoryLocationOption(WebDriver driver) {
		try {
			inventoryLocation(driver).click();
			log.info("'Inventory Location' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//mat-card[1]"))));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickInventoryLocationAttributeOption(WebDriver driver) {
		try {
			inventoryLocationAttributes(driver).click();
			log.info("'Inventory Location Attributes' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//mat-card[1]"))));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickMasterDataOption(WebDriver driver) {
		try {
			masterData(driver).click();
			log.info("'Master Data' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(manageLocations(driver)));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickManageLocationsOption(WebDriver driver) {
		try {
			manageLocations(driver).click();
			log.info("'Manage Locations' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(locations(driver)));
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void clickManageItemsOption(WebDriver driver) {
		try {
			manageItems(driver).click();
			log.info("'Manage Items' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(items(driver)));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickLocationsOption(WebDriver driver) {
		try {
			locations(driver).click();
			log.info("'Locations' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//mat-card[1]"))));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickItemsOption(WebDriver driver) {
		try {
			items(driver).click();
			log.info("'Items' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//mat-card[1]"))));
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static void clickDeveloperResourcesOption(WebDriver driver) {
		try {
			developerResources(driver).click();
			log.info("'Developer Resources' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(inventory(driver)));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickInventoryOption(WebDriver driver) {
		try {
			inventory(driver).click();
			log.info("'Inventory' option selected");
		} catch (Exception e) {
			log.error(e);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(inventoryAPIDocumentation(driver)));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	public static void clickInventoryAPIDoumentationOption(WebDriver driver) {
		// String parentWindow = driver.getWindowHandle();
		
		try {
			inventoryAPIDocumentation(driver).click();
			log.info("'Inventory API Documentation' link clicked");
		} catch (Exception e) {
			log.error(e);
		}
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String curWindow : allWindows ) {
			driver.switchTo().window(curWindow);
		}
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains("Swagger UI"));
		} catch (StaleElementReferenceException e) {
			log.error(e);
		}
	}
	
	/** NAVIGATION FUNCTIONS **/
	public static void navigateToAvailableToCommercePage(WebDriver driver) {
		clickAvaialableToCommerceOption(driver);
	}
	
	public static void navigateToInventorySupplyPage(WebDriver driver) {
		clickInventorySupplyOption(driver);
	}
	
	public static void navigateToInventoryLocationPage(WebDriver driver) {
		clickApplicationConfigurationOption(driver);
		clickManagaeInventoryConfigurationOption(driver);
		clickInventoryLocationOption(driver);
	}
	
	public static void navigateToInventoryLocationAttributesPage(WebDriver driver) {
		clickApplicationConfigurationOption(driver);
		clickManagaeInventoryConfigurationOption(driver);
		clickInventoryLocationAttributeOption(driver);
	}
	
	public static void navigateToLocationsPage(WebDriver driver) {
		clickMasterDataOption(driver);
		clickManageLocationsOption(driver);
		clickLocationsOption(driver);
	}
	
	public static void navigateToItemsPage(WebDriver driver) {
		clickMasterDataOption(driver);
		clickManageItemsOption(driver);
		clickItemsOption(driver);
	}
	
	public static void navigateToInventoryAPIDocumentationPage(WebDriver driver) {
		clickDeveloperResourcesOption(driver);
		clickInventoryOption(driver);
		clickInventoryAPIDoumentationOption(driver);
		
	}

}
