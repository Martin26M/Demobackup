package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage   {

	
	WebDriver driver;

	By itemname = By.xpath("//ul[@id='homefeatured']//li[1]");
	By movingToElement= By.xpath("//ul[@id='homefeatured']//li[1]");
	By movingToElement2= By.xpath("//ul[@id='homefeatured']//li[2]");
	By addcart = By.xpath("//span[contains(text(),'Add to car')]");
	By switching = By.cssSelector(".icon-chevron-left.left");
	By shoppingcart= By.xpath("//div[@class='shopping_cart']//a");
	By buttonclick = By.id("button_order_cart");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver= driver;
	}

     public WebElement  movingtoItem() 
	
	{
		return driver.findElement(movingToElement);
	 
	}
     public WebElement  movingtoItem2() 
 	
 	{
 		return driver.findElement(movingToElement2);
 	 
 	}

	public WebElement  itemselection() 
	
	{
		
	return  driver.findElement(itemname);
	
	 
	}
	
	public WebElement AddCart() {
		
		return driver.findElement(addcart);
		
	}
	
	public WebElement switchwindow() {
		
		//String child = driver.getWindowHandle();
		return	driver.findElement(switching);
		 
	}
	
public WebElement ShoppingCart() {
		
		return driver.findElement(shoppingcart);
		
}
public WebElement ButtonClick() {
	
	return driver.findElement(buttonclick);
	
}
}
