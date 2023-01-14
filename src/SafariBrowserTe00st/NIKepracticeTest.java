package SafariBrowserTe00st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NIKepracticeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
        
		driver.get("https://www.nike.com/ca/login?continueUrl=https://www.nike.com/ca/?cp=29728419214_search_%7Cnike%7C10628221437%7C106336396713%7Ce%7Cc%7CEN%7Cpure%7C596645929110&gclsrc=aw.ds&ds_rl=1252249&gclid=Cj0KCQjwyYKUBhDJARIsAMj9lkGUIl2xaZIrdkjvwSOJ7J8OhXitU4-LFzQMTk8VO_1jpKqD49n0c4YaAppeEALw_wcB");
		    
		driver.findElement(By.name("emailAddress")).sendKeys("sdbhjfdshva");
		
		driver.findElement(By.name("password")).sendKeys("hwbdfwag");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
		Thread.sleep(3000);
		
		String expected = "Please enter a valid email address.";
		
		String Actual = driver.findElement(By.xpath("//div[@class='error'][contains(text(),'Please enter a valid email address.')]")).getText();
		
		if(expected.equals(Actual)) {
			
			System.out.println("test Pass");
		} else {
			System.out.println("test Failed");
		}
			 
	}

}
