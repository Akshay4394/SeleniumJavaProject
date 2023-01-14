package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.nike.com/ca/");
		
		WebElement NewRelease= driver.findElement(By.xpath("//a[@data-path='new releases']"));
		
		Actions NewRelease1 = new Actions(driver);
		
		NewRelease1.moveToElement(NewRelease).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> NewForMen = 
				driver.findElements(By.xpath("//a[contains(@data-type,'click_navShoppingMenu') and contains(@data-path,'new releases:new for men')]"));
	
	   System.out.println(NewForMen.size());
	   
	   for(WebElement newformen:NewForMen) {
		   
		   
		   System.out.println(newformen.getText()+"------"+newformen.isSelected());
	   }
	   
	     NewForMen.get(1).click();
	   
	   //driver.findElement(By.linkText("man")).click();
	   
	   driver.getTitle();
	   
	   System.out.println(driver.getTitle());
	   
	   
	   WebElement SearchBar = driver.findElement(By.id("VisualSearchInput"));
	   
	   SearchBar.click();
	   
	   Actions hower = new Actions(driver);
	   
	   hower.moveToElement(SearchBar).build().perform();
	   
	   Thread.sleep(4000);
	   
	   List<WebElement>SuggestionList = driver.findElements(By.xpath("//a[@class='pre-l-vs-popular-term ncss-cta-primary-dark ta-sm-l d-sm-b mb3-sm']"));
	 
	   SuggestionList.size();
	   
	   System.out.println(SuggestionList.size());
	   
	   for(WebElement  suggestionlist:SuggestionList) {
		   
		   System.out.println(suggestionlist.getText());  
		   
	   }
	   
	   System.out.println("______________space_______________");
	   
       driver.getTitle();
       
       System.out.println(driver.getTitle());
       
       
       
	   
	      
	      
	      
	     
	   
	   
	   
	   
	   
		

	}

}
