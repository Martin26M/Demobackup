package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
 
		// TODO Auto-generated method stub

	
	
	    WebDriver driver;
		By firstname = By.id("customer_firstname");
		By lastname = By.id("customer_lastname");
		By password = By.id("passwd");
		By gender = By.name("id_gender");
		By days= By.id("days");
		By month = By.id("months");
		By year =By.id("years");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver= driver;
		}

		public WebElement  name() {
			
			
			return driver.findElement(gender);
			
		}
		
		public WebElement firstname() {
			
			
			return driver.findElement(firstname);
		}

		
	  public WebElement lastname() {
			
			
			return driver.findElement(lastname);
		}

	  public WebElement password () {
			
			
			return driver.findElement(password);
		}
		
	  
	  public WebElement selectdate() {
		  
		return     driver.findElement(days);
		   
		  
		  
	  }
	  
	  public WebElement selectmonth() {
		  
		  
		  return driver.findElement(month);
	  }
	  
 public WebElement selectyear() {
		  
		  
		  return driver.findElement(year);
	  }

}
