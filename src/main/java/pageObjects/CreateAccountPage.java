package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

	
	
	WebDriver driver;
	
	By createacct = By.id("SubmitCreate");
	By email = By.name("email_create");
	
	public CreateAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}

	
	public WebElement sendemail() {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(email)));
	return 	driver.findElement(email);
		
		
	}
	public WebElement createAccount() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(createacct)));
		
		
		return driver.findElement(createacct);
		
	}
	
	
	
}
