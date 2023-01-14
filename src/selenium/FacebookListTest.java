package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	// size and text for highlighted links
		

		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.facebook.com/"); 
		
		
		/* List<WebElement>HighlightedLinks = driver.findElements(By.tagName("a"));
		 
		 int Linksize = HighlightedLinks.size();
		 
		 System.out.println(Linksize);
		 
         for (WebElement  highlightedlinkd:HighlightedLinks) {
			 
			 
			 System.out.println(highlightedlinkd);
			 
		 }*/
		 
		
		 Thread.sleep(3000);
		 
		/* List<WebElement>Fbfootr = driver.findElements(By.xpath("//a[contains(@class,'_sv4') and contains(@dir,'ltr') or contains(@title,'Show more languages')] "));
		
		 int footersize =Fbfootr .size();
		 
		 System.out.println(footersize);
		 
         for (WebElement  Facebooklin:Fbfootr) {
			 
			 
			 System.out.println(Facebooklin.getText());
			 
		 }*/
         
         Thread.sleep(3000);
         
         List<WebElement>footer2 = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li"));
         
         int Footer2 = footer2.size();
         
         System.out.println(Footer2);
         
         
         for (WebElement Ffooter2:footer2) {
        	 
        	 System.out.println(Ffooter2.getText());
         }
		 
         WebElement name = driver.findElement(By.id("globalContainer"));
         
         name.getAttribute("class");
         
         System.out.println(name.getText());
         
        
		 
		 
		 
		
		

		
		
		
	}

}
