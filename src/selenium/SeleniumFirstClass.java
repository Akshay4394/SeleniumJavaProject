package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		//claassname obj = new classname();
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
		// for path need to use "//" or "\"
		
		FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.facebook.com/");  // it will open facebook
		
		driver.findElement(By.id("email")).sendKeys("dfsgjfawgafjgf"); // type wrong email into emailbox
		
		 driver.findElement(By.id("pass")).sendKeys("sfhfmhf"); //type wrong email password into box
		 
		  driver.findElement(By.name("login")).click(); // for opening of facebook and click on logoin button
		 
	}

	
	
	
	
}
