package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ViewsPage {
	
	public static WebElement element = null;
	public static String string = null;
	
	public static WebElement supplySearchButton(WebDriver driver) {
		WebElement element = driver.findElement(By.id("button-1166"));
		return element;
	}
	
	public static void hoverToRevealOptions (WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id='inv-commerceviewtile-1164-innerCt']"));
		
		action.moveToElement(element).perform();
	}
	
	public static void clickSupplySearchButton(WebDriver driver) {
		hoverToRevealOptions(driver);
		supplySearchButton(driver).click();
	}

}
