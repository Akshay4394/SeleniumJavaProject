package SafariBrowserTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
       FirefoxDriver  driver = new FirefoxDriver();
       
       driver.get("https://www.bestbuy.ca/identity/en-ca/signin?tid=ZZ%252FBpebXbevc5619M7FKNhfATDCyQA5aIUXy6Hj09Zzsf%252BxTa6YdBIuaJGpI1n4JJHMC%252B9Yl9LiGHp4T3yVf67Xo9IDkHbeyWTF1WjZ39VaSFJsEktnEa4pZ1Hb%252F7%252Fg038iLk8AIquY0IIB%252FuhZqHnU5SwPTBMrhLAcOUFK%252BS3b36jHM0TCAisjH9FBvxIezTnLDG6Cy92CS2tSR%252FVWgKtQlsLMxNnUqCAo00CpoNJZSKiE3hXHMys5kL0nx2h6n7gh2uGehVkAws%252B519AUl9feqk2WTFEKkXRfs7hbtKZ67kwiyRSIfKzOcdp13TcLrkMs25STG51uxLlAS%252Fh1CV2baLGVm6l7cMObq5eD%252BoOkj%252BLbbqIWFRcPX1PLF7rbtalfu6Yoxy4HYVfzz0goMeGik588CYc%252FoDdWbrc9xNYBRAttyUkTSfVUeJUD0xiB5JMAxx4UVqIx3owcP0%252B%252BSyAotcESYEpZTYx6gMhRhxe33pQQe%252BDsgbwAXSsbK3fhQmL9IFW7Hn5ETENUek15kk3g0iSBUct92EFcyrfBfnlzhqG2B0gnboLMwkONXJY6R");
		
		driver.findElement(By.id("username")).sendKeys("shreenashah1996@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Shrina@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		Set<String>windows = driver.getWindowHandles();
		
		driver.getWindowHandles().size();
		
		Iterator<String>etr = windows.iterator();
		
		String url = etr.next();
		
		String expected = "https://www.bestbuy.ca/en-ca/collection/intel-core-12th-gen-desktops/394450?mnp=home_onsite_22-03-25_ch_intel_computers_intel_pencilhome";
		
		if (url.equals(expected)) {
			
			System.out.println("test Pass");
		} else {
			
			System.out.println("test failed ");
		}
		
		driver.quit();

	}

}
