package SafariBrowserTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicTable1Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver(); 
        
        driver.get("https://www.entegris.com/en/home.html");
        
        Thread.sleep(3000);
        
        List<WebElement>popup1 = driver.findElements(By.id("ccc-notify-dismiss"));
        
        System.out.println(popup1.size());
        
        Thread.sleep(3000);
        
        if(popup1.size()>0) {
        	
        	System.out.println(popup1.get(0).getText());
        	
        	popup1.get(0).click();
        }
        
        driver.findElement(By.linkText("Currency")).click();
        
        Thread.sleep(3000);
         
        WebElement currancytype = driver.findElement(By.name("CNY"));
        
        Actions a = new Actions(driver);
        
        a.moveToElement(currancytype).build().perform();
        
        Thread.sleep(3000);
        
        List<WebElement> currency = driver.findElements(By.xpath("//ul[@id='currencyListing']//li"));
        
        System.out.println(currency.size());
        
        for(WebElement webelement:currency) {
        	
        	System.out.println(webelement.getText());
        	
        }
        
        
       System.out.println("driver name -----" +driver.getTitle());
       
	}

}
