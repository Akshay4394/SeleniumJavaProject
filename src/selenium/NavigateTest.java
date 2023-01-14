package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {

		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        WebDriver driver = new FirefoxDriver();
        
       // driver.get("https://www.ebay.ca/");
        
		
		driver.navigate().to("https://www.ebay.ca/"); // driver.get && driver.navigate().to("url") are same (when you add to)

		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		
	}

}
