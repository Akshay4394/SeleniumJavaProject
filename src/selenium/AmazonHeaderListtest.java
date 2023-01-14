package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderListtest {

	public static void main(String[] args) throws InterruptedException {
		//size and text
		
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.amazon.ca/?tag=admpdesktopca-20&ref=pd_sl_a28E53917BF2132A67673F0A59");
		
		Thread.sleep(3000);
		
		//WebElement header = driver.findElement(By.xpath("//header[@id='navbar-main']"));
		
		List<WebElement>header = driver.findElements(By.xpath("//a[contains(@class,'nav-a  ') and contains(@tabindex,'0')]"));
	    
		Thread.sleep(3000);
		
		int size1 = header.size();
		
		System.out.println("size of the header" +" = "+ size1);
		
		for (WebElement webelement:header) {
			
		System.out.println(webelement.getText());
		}
		
	    String attributevalue = driver.findElement(By.id("nav-xshop")).getAttribute("class");
	    
	    System.out.println(attributevalue);
	
		
		
	}
		
		
		
		
	

}
