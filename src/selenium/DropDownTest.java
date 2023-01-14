package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(3000);
		
		List<WebElement>EbayHeader = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		//div[@class='hl-cat-nav']/ul/li
		
		Thread.sleep(3000);
		
		int Droapdownsize = EbayHeader.size();
		
		System.out.println(Droapdownsize);
		
		for (WebElement droapdown:EbayHeader) {
			
			System.out.println(droapdown.getText()+"----"+ droapdown.isSelected());
		}
		
		/* for(int i =0; i<EbayHeader.size(); i++) {
		 
		  System.out.println(EbayHeader.get(i).getText()+"----"+ droapdown.isSelected());
		  
		 */
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(box);
		
		s.selectByIndex(2);//by index number
		
		Thread.sleep(3000);
		
		s.selectByValue("2984");// by its value
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Books");//by text
				
         System.out.println("----------------all Selected-------------------");
		
		for (WebElement droapdown:EbayHeader) {
			
			System.out.println(droapdown.getText()+"----"+ droapdown.isSelected());
		}
		
		
	}

}
