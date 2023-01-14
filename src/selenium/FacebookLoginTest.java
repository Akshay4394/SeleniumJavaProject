package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.facebook.com/"); 
		
		// ClassName -Calassname attributes -not working
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("dsvgjfgf");
		
		//cssselector-need to learn syntex
		
		//driver.findElement(By.cssSelector(null));
		
		//Id = id attributes -working
		
		driver.findElement(By.id("email")).sendKeys("hdfsbhjbb");
		
		//linktext - not working
		
		//driver.findElement(By.linkText(null));
		
		//name working
		
		driver.findElement(By.name("email")).sendKeys("sdvhkdfghfgk");
		
		
		//ParrtiallinkText- only for link and not working
		
		//driver.findElement(By.partialLinkText(null));
		
		//Tagname -not working ,not unique
		
		//driver.findElement(By.tagName(null));
		
		//xpath - need to learn syntex and very powerful but slow
		
		
		//driver.findElement(By.xpath(null));
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.className("_9ay7")).getText();
		
		Thread.sleep(2500);
		
		String ExpectedError = "The email or mobile number you entered isn’t connected to an account. ";
		
		String ActualError = driver.findElement(By.className("_9ay7")).getText();
		
		System.out.println(ActualError);	
		
		if (ExpectedError.equals(ActualError)) {
			
			System.out.println("test pass");
		} else {
			System.out.println("test failed");
		}
		
		
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		driver.findElement(By.id("did_submit")).click();
		
		driver.findElement(By.linkText("Forgot Account?")).click();
		
		
		

	}

}
