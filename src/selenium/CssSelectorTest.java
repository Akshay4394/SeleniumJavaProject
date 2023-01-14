package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.facebook.com/"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.cssSelector("#email")).sendKeys("dvbhhjvdbv");
		
		driver.findElement(By.cssSelector("._9npi")).sendKeys("1234dvjjdj");
		
		driver.findElement(By.cssSelector("*[id='u_0_d_yD']")).click();
		
	}

}
