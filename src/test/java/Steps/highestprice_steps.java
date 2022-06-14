package Steps; 

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class highestprice_steps extends  BaseStep { 
	
	 

@Given("^I open home page$")
public void i_open_home_page() throws Throwable {
	
	  driver.get(URL);
	
}

	 
@Given("Click on the {string} Menu")
public void click_on_the_menu(String menu) throws InterruptedException {
	
	driver.findElement(By.linkText(menu)).click();


}

@When("I select Highest Price Item")
public void i_select_highest_price_item() {
	
	List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='right-block']//div[@itemtype='http://schema.org/Offer']//span[@class='price product-price']")); /////*[@id="center_column"]/ul/li[1]/div/div[2]/div[1]/span
		
	TreeSet<Float> prices = new TreeSet<Float> ();
	for(WebElement price:list_of_products_price) 
		
	{
		prices.add( Float.parseFloat(price.getText().replace("$", "")));     
	
	}
	
	float high_price = prices.last();
    System.out.println("High Product Price is: " + prices.last());
	WebElement ele= driver.findElement(By.xpath("//div[@class='right-block']//span[@itemprop='price' and contains(text(),'"+high_price+"')]//ancestor::div[@class='product-container']//img"));
	ele.click();
	
}
   

@Then("I add highest priced item to Cart")
public void i_add_highest_priced_item_to_cart() throws Throwable {
	
	WebElement cart= driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(cart);
	driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	Thread.sleep(1000);
	
	
	}

@Then("I close the browser")
public void i_close_the_browser() throws InterruptedException {
	driver.quit();
}


}



