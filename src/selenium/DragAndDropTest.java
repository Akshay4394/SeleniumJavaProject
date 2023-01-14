package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

    System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
    FirefoxDriver driver = new FirefoxDriver();  
    
    driver.get("https://jqueryui.com/droppable/");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//for webElement
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //other than web element
    
   // Thread.sleep(3000);
    
    driver.switchTo().frame(0);
    
    WebElement DragMe = driver.findElement(By.id("draggable"));
    
    WebElement DropHere = driver.findElement(By.id("droppable"));
   
    
    System.out.println(DropHere.getText());
    
    Actions builder = new Actions(driver);
    
    builder.dragAndDrop(DragMe, DropHere).build().perform();
    
    wait.until(ExpectedConditions.textToBePresentInElement(DropHere, "Dropped!"));
    
    System.out.println(DropHere.getText());
    
    if(DropHere.getText().equals("Dropped!")) {
    	
    	System.out.println("test pass");
    } else {
    	
    	System.out.println("Test Failed");
    }
    
    
    
    
   
    
		
		
		
		
	}

}
