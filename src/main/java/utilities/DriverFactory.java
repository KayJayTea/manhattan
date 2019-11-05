package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	public static WebDriver open(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAO8676\\Documents\\Java-Training\\Software\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\AAO8676\\Documents\\Java-Training\\Software\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\AAO8676\\Documents\\Java-Training\\Software\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAO8676\\Documents\\Java-Training\\Software\\chromedriver.exe");
			return new ChromeDriver();
		}
	}

}
