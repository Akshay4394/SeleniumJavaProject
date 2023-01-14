package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		//classname objname = new classname();
        //FirefoxDriver driver = new FirefoxDriver();  
		//interfacename (parentsclass) objname = new classname();

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.adidas.ca/en/account-login");
        
        Thread.sleep(3000);
		 
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Akshaypatel4394@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("cdwvcmnvwcdfhj");
        
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(Keys.ENTER);
        // generally, most user click enter without howering on log in for logg in perpuse so this key test for enter without clicking on log in
		
		
		
		
	}

}
