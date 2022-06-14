package utils;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	static WebElement wait;
	
	//Open Browser
	public static WebDriver LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "\\Users\\shilp\\eclipse-workspace\\New folder\\Test\\src\\main\\java\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts()
		.scriptTimeout(Duration.ofSeconds(20))
		.implicitlyWait(Duration.ofSeconds(60));
		return driver;
		
	}
}