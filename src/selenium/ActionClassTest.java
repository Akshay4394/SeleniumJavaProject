package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(3000);
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions Builder = new Actions(driver);
		
		
		Builder.moveToElement(electronics).build().perform();//moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		
		
		List<WebElement> ElectronicsList = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		
		
		System.out.println(ElectronicsList.size());
		
		
		/*for (int i =0; i<ElectronicsList.size();i++ ) {
			
			System.out.println(ElectronicsList.get(i).getText());
		}*/
		
		
		for (WebElement nameList:ElectronicsList) {
			
			
		System.out.println(nameList.getText());
		
		}
		
		
		

	}

}
