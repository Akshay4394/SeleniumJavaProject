package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTEst {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		//trading now list 'size and number
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://ca.yahoo.com/");
		
		Thread.sleep(3000);
		
		
		List<WebElement> tradingList = driver.findElements(By.xpath("//div[@class='bd']/div[1]//a"));
		
		int tsize = tradingList.size();
		
		System.out.println(tsize);
		
		
		for (WebElement trandingsize:tradingList) {
			
			System.out.println(trandingsize.getText());
		}
		
		
		
		
		
	}

}
