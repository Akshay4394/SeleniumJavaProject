package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		 WebElement  email = driver.findElement(By.id("usernameInput-input"));
		 
		 email.sendKeys("sdvhbjmvdsbvb$%");
		  
		 
		 WebElement passward = driver.findElement(By.id("password-input"));
		 
		 passward.sendKeys("jfvbjhbhgbdfs");
		  
		 
		 WebElement login = driver.findElement(By.id("signIn"));
		 login.click();
		 
		//driver.findElement(By.id("usernameInput-input")).sendKeys("sdvhbjmvdsbvb$%");
		
		// driver.findElement(By.id("password-input")).sendKeys("1234$&");
		 
		//driver.findElement(By.id("signIn")).click();
	
		 
		 //x-path code
		 
	
		
		
		
		

	}

}
