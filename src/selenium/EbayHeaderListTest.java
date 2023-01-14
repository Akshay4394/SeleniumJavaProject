package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderListTest {

	public static void main(String[] args) throws InterruptedException {
		// Header Size and Text

        System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(3000);
		
		List<WebElement>EbayHeader = driver.findElements(By.xpath("//div[@id='mainContent']/div[1]/ul/li"));
		//div[@class='hl-cat-nav']/ul/li
		Thread.sleep(3000);
		
		
		int headersize = EbayHeader.size();
		
		System.out.println(headersize);
		
		for(WebElement webelement:EbayHeader) {
			
			System.out.println(webelement.getText());
			
		}
		
		
		
		/*List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size(); i++) {
			if(allOptions.get(i).isSelected()) {
			System.out.println(allOptions.get(i).getText()+"-----"+allOptions.get(i).isSelected());
		}
		}
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(2); //select art
		Thread.sleep(3000);
		s.selectByValue("2984");//Baby
		Thread.sleep(3000);
		s.selectByVisibleText("Books");// Books
		
		System.out.println("----------------------------After Selections-----------------------");
		
		for(int i=0; i<allOptions.size(); i++) {
			if(allOptions.get(i).isSelected()) {
			System.out.println(allOptions.get(i).getText()+"-----"+allOptions.get(i).isSelected());
		}
		}*/
		
		
		
		
		
	}

}
