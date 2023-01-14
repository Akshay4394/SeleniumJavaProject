package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {

	    System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
			
	    FirefoxDriver driver = new FirefoxDriver();  
	    
	    driver.get("https://www.ebay.ca/");
	    
	    File ScreenshotFile = driver.getScreenshotAs(OutputType.FILE);//this for chromedriver.safari or any driver
	    
	    FileUtils.copyFile(ScreenshotFile, new File("/Users/akshaypatel/Desktop/Testing//Screenshort.png"));
	    
	    
	    


		
		
		
		
		
		
		
		
	}

}
