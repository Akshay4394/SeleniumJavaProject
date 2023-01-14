package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
			
	        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
	        
	        driver.get("https://www.bestbuy.ca/en-ca");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
		
            driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
            
           // Thread.sleep(3000);
            
            driver.findElement(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']//a[@class='menuLink_rudhP'][contains(text(),'Top Deals')]")).click();
            
            List<WebElement> topdeals = driver.findElements(By.xpath("//div[@class='menuInner_1a0QA menuInnerActive_2-Anf']//a"));
            
            System.out.println(topdeals.size());
            
            for(WebElement TopDeals:topdeals) {
            	
            	System.out.println(TopDeals.getText());
            	
            	//Thread.sleep(3000);
            	
                System.out.println(TopDeals.isSelected());
            }
            
            
	}

}
