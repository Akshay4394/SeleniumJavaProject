package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		//classname objname = new classname();
        //FirefoxDriver driver = new FirefoxDriver();  
		//interfacename (parentsclass) objname = new classname();

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.ebay.ca/");
        
        Thread.sleep(3000);
		/// when you need to identified attributes than always use getattributes instead of gettext().
        
        String s = driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).getAttribute("placeholder");
        
        System.out.println(s);
        
        String p = driver.findElement(By.id("gh-ac")).getAttribute("iphone");
		
		System.out.println(p);
		
	}

}




