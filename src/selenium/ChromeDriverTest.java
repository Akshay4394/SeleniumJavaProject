package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/akshaypatel/Desktop/SeleniumJars/chromedriver");
		
        ChromeDriver driver = new ChromeDriver();  
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);  //provided by sir in lacture
		
		driver.findElement(By.name("lastname")).sendKeys("sdgsdrhsryr");
		
		driver.findElement(By.name("reg_email__")).sendKeys("6475688679");

		
		
		
		
	}

}
