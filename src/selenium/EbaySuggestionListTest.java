package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// suggestion  list test

        System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.ebay.ca/"); 
		
		WebElement mobilesuggestion = driver.findElement(By.id("gh-ac"));
		
		mobilesuggestion.sendKeys("mobile");
		
		mobilesuggestion.click();
				
		Actions Mobile = new Actions(driver);
		
		Mobile.moveToElement(mobilesuggestion).build().perform();
		
			
		List<WebElement> suggestionList =  driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		
		System.out.println("11"+suggestionList.size());
		
        Thread.sleep(3000);
		
		for(WebElement listsize:suggestionList) {
			
			System.out.println(listsize.getText()+("---")+listsize.isSelected());}
		
	    Thread.sleep(3000);
		
        WebElement Mobilephones = driver.findElement(By.xpath("//a[@aria-label='mobile phones']"));
				
				Mobilephones.click();

		
		
}
		
		
}
