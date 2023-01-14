package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
			
	        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
	        
	        Thread.sleep(3000);
			
			driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin ");
		
		    driver.findElement(By.linkText("Help")).click();
		    
		    Thread.sleep(3000);
		    
		    Set<String>allWindows = driver.getWindowHandles();
		    
		    System.out.println(allWindows.size());
		    
		    Iterator<String> itr = allWindows.iterator();
		    
		    String ParentWindow = itr.next();
		    
		    String ChildWindow = itr.next();
		    
		    System.out.println(ParentWindow);
		    
		    System.out.println(ChildWindow);
		    
		    driver.switchTo().window(ChildWindow);
		    
		    System.out.println(driver.getTitle());//help page title
		    
		    driver.close();
		    
		    Thread.sleep(3000);
		    
		    driver.switchTo().window(ParentWindow);
		    
		    System.out.println(driver.getTitle());//Gmail page title
		    
		    driver.quit();//it close both window and after quitting
		    
		    
			
			
		
	}

}
