package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.google.ca/?client=safari&channel=iphone_bm"); 
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//for webElement
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //other than web element
		 
		//Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("canada");
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']//li"), 10));
		List<WebElement>SearchList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println(SearchList.size());
		
		for(WebElement searchlist:SearchList) {
			
			
			System.out.println(searchlist.getText());
			
		}
		 
	}

}
