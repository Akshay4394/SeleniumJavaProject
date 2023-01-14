package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://ca.yahoo.com/");
		
		WebElement news = driver.findElement(By.id("ybar-sbq"));
		
		news.sendKeys("news");
		
		Actions News = new Actions(driver);
		
		News.moveToElement(news).build().perform();
		
		news.click();
		
		Thread.sleep(3000);
		
		List<WebElement>Newssuggestion = driver.findElements(By.xpath("//ul[@class='_yb_kc384']/li"));
		
		System.out.println(Newssuggestion.size());
	
		for(WebElement newssuggestion:Newssuggestion) {
			
			System.out.println(newssuggestion.getText());
		}
	

		
		
		
	}

}
