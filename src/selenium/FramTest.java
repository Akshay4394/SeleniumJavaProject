package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramTest {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> Sortable = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(Sortable.size());// for verifying whether element is present or not ,need to use list<WebElement>
		
		if(Sortable.size()>0) {
			
			System.out.println("sortable is present");
		} else {
			
			System.out.println("sortable is not present");
		}
		
        List<WebElement> Draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(Draggable.size());
		
		if(Draggable.size()>0) {
			
			System.out.println("Draggable is present");
		} else {
			
			System.out.println("Draggable is not present");
		}
		
		
		driver.switchTo().frame(0);//index value
		
		
		 System.out.println("-------------------switching to iframe");
		//driver.switchTo().frame("");//this is for id or name,in this case we dont have id or name
		
		//driver.switchTo().frame(By.className("demo-frame"))//Webelement
		
        Sortable = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(Sortable.size());// for verifying whether element is present or not ,need to use list<WebElement>
		
		if(Sortable.size()>0) {
			
			System.out.println("sortable is present");
		} else {
			
			System.out.println("sortable is not present");
		}
        
		Draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(Draggable.size());
		
		if(Draggable.size()>0) {
			
			System.out.println("Draggable is present");
		} else {
			
			System.out.println("Draggable is not present");
		}
		
		
		
		
		driver.switchTo().defaultContent();
		
		System.out.println("------------------Swithching to defoult");
       
		Sortable = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(Sortable.size());// for verifying whether element is present or not ,need to use list<WebElement>
		
		if(Sortable.size()>0) {
			
			System.out.println("sortable is present");
		} else {
			
			System.out.println("sortable is not present");
		}
        
		Draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(Draggable.size());
		
		if(Draggable.size()>0) {
			
			System.out.println("Draggable is present");
		} else {
			
			System.out.println("Draggable is not present");
		}
		
		
	}

}
