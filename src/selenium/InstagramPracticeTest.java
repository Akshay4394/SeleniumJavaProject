package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramPracticeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.instagram.com/?hl=en");
		
		Thread.sleep(3000);
		
		WebElement Signup = driver.findElement(By.name("username"));
		
		Signup.sendKeys("ghggbjse");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("dbvjkvebevfwb");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		
		login.click();
		
		String Expextederror ="The username you entered doesn't belong to an account. Please check your username and try again.";
	    
		String  actualerror = driver.findElement(By.xpath("//p[@id='slfErrorAlert']")).getText();
		
		System.out.println(actualerror);
		
		if(Expextederror.equals(actualerror)) {
			
			System.out.println("test pass");
			
		} else {
			System.out.println("test failed");
		}
	
		
		
		
		
	}

}
