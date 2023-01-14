package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://echoecho.com/javascript4.htm");		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//for webElement
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //other than web element
		
		
		
		driver.findElement(By.name("B2")).click();
		
		//Thread.sleep(3000);
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();//click on selected one
		//al.dismiss();/click on none selected one
		

	}

}
