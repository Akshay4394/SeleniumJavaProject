package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.ebay.ca/");
		
		
		driver.manage().window().maximize(); // to maximize the window when its open 
		

}
}