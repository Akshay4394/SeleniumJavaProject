package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazoneHowerTest {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327651&hvpos=&hvnetw=g&hvrand=1299729453554553926&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9021541&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845442&gclid=EAIaIQobChMIjqujm-Sv9wIVe21vBB3_1gD3EAAYASAAEgJHAvD_BwE"); 
			
		
		WebElement signin =driver.findElement(By.id("nav-link-accountList"));
		
		Actions hower = new Actions(driver);
		
		hower.moveToElement(signin).build().perform();
		
		List<WebElement>Signin = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		
		System.out.println(Signin.size());
		
		Thread.sleep(3000);
		
		
		for(WebElement SignIn:Signin) {
			
			System.out.println(SignIn.getText());
		
			
		}
		
		List<WebElement> accountlist = driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a"));
		
		System.out.println(accountlist.size());
		
		Thread.sleep(3000);
		
		for(WebElement AccountList:accountlist) {
			
			System.out.println(AccountList.getText()+"------"+AccountList.getTagName());
			
			 Thread.sleep(3000);
			
			System.out.println("__________________________");
			
			Thread.sleep(3000);
			
			System.out.println(AccountList.isSelected());
			
			System.out.println(AccountList.getAttribute("class"));
			
		}
		
		
	}

}
