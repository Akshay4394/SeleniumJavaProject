package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowersTest1 {

	public static void main(String[] args) throws  InterruptedException, IOException {
		
		FileInputStream f = new FileInputStream("/Users/akshaypatel/Desktop/Testing/Prop.properties");
		
		Properties prop = new Properties();
		
		prop.load(f);
		
		String browsers = prop.getProperty("browser");
		
         System.out.println(browsers);
         
	//	String browsers ="Firefox";  //"safari","firefor"
		
	    WebDriver driver = null ;//At this point driver is empty
		
		if(browsers.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
			
	         driver = new FirefoxDriver();
	        
				
		} else if(browsers.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/Users/akshaypatel/Desktop/SeleniumJars/chromedriver");
			
	         driver = new ChromeDriver(); 
			
		} else if(browsers.equals("safari")) {
           
			System.setProperty("webdriver.safari.driver","/Users/akshaypatel/Desktop/SeleniumJars/safaridriver");
			
	        driver = new SafariDriver(); 
			
			
		}
	 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);  //provided by sir in lacture
		
		driver.findElement(By.name("lastname")).sendKeys("sdgsdrhsryr");
		
		driver.findElement(By.name("reg_email__")).sendKeys("6475688679");

		
		
	}

		
		
		
		
		

	}


