package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

 WebDriver driver;

By checoutproceed = By.xpath("//p[@class='cart_navigation clearfix']//a[1]");
	
	
	
	public CheckoutPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		
		this.driver= driver;
}



	public WebElement checkoutbutton () {
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(checoutproceed)));
		return driver.findElement(checoutproceed);
		
		
	}
	
	
	
}
