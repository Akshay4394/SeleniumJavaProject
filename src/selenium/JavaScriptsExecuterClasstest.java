package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptsExecuterClasstest {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.adidas.ca/en"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("gl-modal__close")).click();
		
	    JavascriptExecutor jse = (JavascriptExecutor)(driver);//casting in java use for when items not clickable
	   
	    WebElement careers =   driver.findElement(By.linkText("Careers"));
	    
	    
	    //using X && Y cordinate
	    
	   // System.out.println(careers.getLocation());
	    
		//jse.executeScript("window.scrollBy(0,5000)");
		
		//careers.click();
		
		// using Scroll until the element is in the view is true
		
		//jse.executeAsyncScript("arguments[0].scrollIntoView(true);", careers);
		
		//careers.click();
		
		//Direct click using javascript executer
		
		jse.executeScript("arguments[0].click();",careers);
		
	}

}
