package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest2 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
        
        driver.get("https://www.google.com/");
        
        
       // WebElement first = driver.findElement(By.tagName("a")); // frist webelement provides
        
        
        List <WebElement> allLinks = driver.findElements(By.tagName("a"));
        
        System.out.println(allLinks.size());
        
        
        for (int i = 0; i<allLinks.size(); i++) {
        	
        	System.out.println(allLinks.get(i).getText());
        	
        	
        }
	}

}