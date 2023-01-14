package SafariBrowserTe00st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPracticeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
			
	        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
	        
	        Thread.sleep(3000);
	        
	        driver.get("https://www.nike.com/ca/?cp=64463035706_search_%7CNikke%7CGOOGLE%7C71700000086790392%7CGN_X_X_X_X-Device_X_Misspellings_Exact%7Ce%7Cc&gclsrc=aw.ds&&gclid=EAIaIQobChMI_5zm8oa39wIVCidMCh26MQp9EAAYASAAEgLGWfD_BwE&gclsrc=aw.ds");
			
		   WebElement Popup1 = driver.findElement(By.cssSelector("div[data-var='geomismatchConfirmContainer']>button"));
		    
		    Popup1.click();
		    
		   
		
		     
		       
		       
		      
		
		
	}

}
