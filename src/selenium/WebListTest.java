package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver(); 
        
        Thread.sleep(3000);
        
        driver.get("https://www.google.com/");
        
        
      // WebElement first = driver.findElement(By.tagName("a")); // frist webelement provides
        
        WebElement footer = driver.findElement(By.xpath(""));
        
       // List<WebElement> allLinks = footer.findElements(By.tagName("a")); /// its gives you list of  webelement
        
        
        
        List<WebElement> allLinks = driver.findElements(By.tagName("a")); /// its gives you list of  webelement
        
        System.out.println(allLinks.size());
       
        
        for (int i = 0; i<allLinks.size(); i++) {
        	
        	
        	System.out.println(allLinks.get(i).getText());
      	
        }
      	
		
		
		
	}

}
