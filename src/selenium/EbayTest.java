package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayTest {

	public static void main(String[] args) throws InterruptedException {
		
		//classname objname = new classname();
        //FirefoxDriver driver = new FirefoxDriver();  
		//interfacename (parentsclass) objname = new classname();

		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.ebay.ca/");
        
        String Actual = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
        
        System.out.println(Actual);
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("gh-ac")).getAttribute("value");
    	   
       }
           
    	   
	}	   


