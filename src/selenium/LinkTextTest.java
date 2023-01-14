package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.google.ca/?client=safari&channel=iphone_bm"); 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //other than web element
		
		driver.findElement(By.linkText("About")).click();// we can use both for link test and always use "text" in between tabs for linktest
		
		driver.findElement(By.partialLinkText("About")).click();
		
        wait.until(ExpectedConditions.titleContains("Google - About Google, Our Culture & Company News"));
         
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		
        String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		
		String actualUrl = driver.getCurrentUrl();
		
		wait.until(ExpectedConditions.urlToBe(expectedUrl)); //not sure whether its right or wrong
		
		System.out.println(actualUrl);
		
		if (expectedTitle.equals(actualTitle) & (expectedUrl.equals(actualUrl)) ) {
			
			System.out.println("pass");}  
		else {
			
			System.out.println("fail");
		}
		

	}

}
