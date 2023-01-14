package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		//classname objname = new classname();
        //FirefoxDriver driver = new FirefoxDriver();  
		//interfacename (parentsclass) objname = new classname();

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.facebook.com/");

		//driver.findElement(By.id("usernameInput-input")).sendKeys("sdvhbjmvdsbvb$%");
		
		//driver.findElement(By.id("password-input")).sendKeys("1234$&");
		 
        driver.findElement(By.xpath("*[text() = 'Connect with friends and the world around you on Facebook.']")).click();
		driver.findElement(By.id("signIn")).click();
		
		driver.findElement(By.xpath("//a[@class='_97w4']")).click();
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).click();
        
        
        
    
        
		
		
		

	}

}
