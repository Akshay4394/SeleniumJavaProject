package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//for webelement finding
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //other than web element
		
		driver.findElement(By.linkText("About")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //About
		
		driver.navigate().back();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle()); //Google
		
		driver.navigate().forward();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //About
		

	}

}
