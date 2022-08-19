package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	// To make the scope of WebDriver global 
	public WebDriver driver;
	public Properties prop;
	public WebDriver InitializeTest() throws IOException {
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Demo\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		String Url = prop.getProperty("Url");
		
	
	
     if(BrowserName.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get(Url);
		 driver.manage().window().maximize();
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
	
}}
