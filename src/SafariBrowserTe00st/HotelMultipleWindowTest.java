package SafariBrowserTe00st;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelMultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
        
       // Thread.sleep(3000);
		
        driver.get("https://www.hotels.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.xpath("//a[contains(text(),'Hotels in Chicago')]")).click();
        
        Set<String>allWindows = driver.getWindowHandles();
        
        System.out.println(allWindows.size());
        
        Iterator<String>itr = allWindows.iterator();
        
        String parentWindows = itr.next();
        
        String childWindows =  itr.next();
        
        System.out.println(parentWindows);
        System.out.println(childWindows);
        
        //Thread.sleep(3000);
        
        driver.switchTo().window(childWindows);
        System.out.println(driver.getTitle());
        
        //Thread.sleep(3000);
        
        driver.switchTo().window(parentWindows);
        
        System.out.println(driver.getTitle());
      
        
        

	}

}
