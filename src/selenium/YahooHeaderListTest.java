package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderListTest {

	public static void main(String[] args) throws InterruptedException {
		
		// text and size for header list
		
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		//classname objname = new classname();
        //FirefoxDriver driver = new FirefoxDriver();  
		//interfacename (parentsclass) objname = new classname();

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://ca.yahoo.com/");
        
        Thread.sleep(3000);
        
        List<WebElement>TrendingList = 
        		driver.findElements(By.xpath("//ul[@role='presentation']/li/a"));
      //div[contains(@class,'srch-m trendingNoextList')]/div/div/div/div
        int Tsize = TrendingList.size();
        
        System.out.println(Tsize);
        
        
        for(WebElement webelement:TrendingList) {
        	
        	
        	System.out.println(webelement.getText());
        	
        	
        }
        
		
		
		
	}

}
