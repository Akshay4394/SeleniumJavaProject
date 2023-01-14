package SafariBrowserTe00st;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SafariTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.apple.com");
		
		Thread.sleep(3000);
		  
		driver.get("https://www.apple.com/iphone-13-pro/");
		
	
		
	
		
        
	}

	

}
