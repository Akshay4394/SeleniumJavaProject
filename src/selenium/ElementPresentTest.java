package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) throws InterruptedException {
	

        System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		List<WebElement>element = driver.findElements(By.linkText("Aboutbfvbjvb"));
		//div[@class='hl-cat-nav']/ul/li
		
		System.out.println(element.size());
		
		if (element.size()<0) {
			
			System.out.println("element present");
		}else {
			
			System.out.println("not present");
		}
		
		//We can not verify if element is present or not, using WebElement. WebElement Must be present
				/*if(driver.findElement(By.linkText("AboutsDgsdfgherhf")).isDisplayed()) {
					System.out.println("Element Present");
				}else {
					System.out.println("Element Not Present");
				}*/
	
		
		
	}

}
