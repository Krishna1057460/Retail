package Steps;

import org.openqa.selenium.WebDriver;

import utils.BrowserFactory;

public class BaseStep {
	
	String URL="http://automationpractice.com/index.php";
	public static WebDriver driver = BrowserFactory.LaunchBrowser();

	
}