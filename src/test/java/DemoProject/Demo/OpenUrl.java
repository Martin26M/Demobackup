package DemoProject.Demo;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelRead;
import pageObjects.CheckoutPage;
import pageObjects.CreateAccountPage;
import pageObjects.LandingPage;
import pageObjects.RegistrationPage;
import resources.Base;


public class OpenUrl extends Base {
	
	
	 
	@Test(dataProvider="getdata")
	
	public void HomePageNavigation(String Name, String Lastname,String Password ,String Email) throws IOException {
		
	
	driver = InitializeTest();// We have called the method by overloading 

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	LandingPage l = new LandingPage(driver);// Calling Landing Page 
	Actions a = new Actions(driver);
    a.moveToElement(l.movingtoItem()).build().perform();
	l.itemselection().click();
	l.AddCart().click();	
  l.switchwindow().click();
   a.moveToElement(l.movingtoItem2()).build().perform();
   l.itemselection().click();
	l.AddCart().click();	
  l.switchwindow().click();
   a.moveToElement(l.ShoppingCart()).build().perform();
  
  l.ButtonClick().click();
  
  
  
  CheckoutPage ck = new CheckoutPage(driver);// Calling CheckoutPage
  ck.checkoutbutton().click();

  CreateAccountPage act = new CreateAccountPage(driver);
		ExcelRead excelread= new ExcelRead();
		 Map<String, String > map = excelread.setdata("datadrivennew.xlsx", "testdata");
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
   // act.sendemail().sendKeys(map.get("Email"));
		 
    act.sendemail().sendKeys(Email); 
    System.out.println(map.get("Email"));
    act.createAccount().click();
    
    
    RegistrationPage rs = new RegistrationPage(driver);
   rs.name().click();
    rs.firstname().sendKeys(Name);
    rs.lastname().sendKeys(Lastname);
    rs.password().sendKeys(Password);
    
    
    
    Select s = new Select(rs.selectdate());
	  
	  s.selectByValue("26");
      Select s1 = new Select(rs.selectmonth());
	  s1.selectByValue("3");
	  
	  Select s2 = new Select(rs.selectyear());
	  s2.selectByValue("1988");
	  
	 // driver.close();
	  
	}  
	
	
    @DataProvider
  
      public Object[][] getdata() {
	  
	  Object[][] data = new Object[1][4];
	  
	  data[0][0] = "Test";
	  data[0][1] = "Test1";
	  data[0][2]= "Password123";
	  data[0][3]= "martmathew26@gmail.com";
	  
//	  data[1][0] = "Test2";
//	  data[1][1] = "Test3";
  
	  return data;
  }




}
