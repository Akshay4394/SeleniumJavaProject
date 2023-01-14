package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 seconds max time waiting for only each Webelement finding
		
		//Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(3000);  //provided by sir in lacture
		
		driver.findElement(By.name("lastname")).sendKeys("sdgsdrhsryr");
		
		driver.findElement(By.name("reg_email__")).sendKeys("6475688679");
		
		driver.findElement(By.id("password_step_input")).sendKeys("sgsrfhsthhtsegr");

		driver.findElement(By.name("websubmit")).click();
		

	}

}
