package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
       
        FirefoxDriver driver = new FirefoxDriver();  
        

		driver.get("https://echoecho.com/htmlforms10.htm"); 
		
		List<WebElement> allRadios = driver.findElements(By.name("group1"));
		
		System.out.println(allRadios.size());
		
		for(int i=0; i<allRadios.size();i++) {
			
			System.out.println(allRadios.get(i).getAttribute("value")+"------"+allRadios.get(i).isSelected());
		}
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		allRadios.get(1).click();
		
		System.out.println("-------------------------------");
		
		for(int i=0; i<allRadios.size();i++) {
			
			System.out.println(allRadios.get(i).getAttribute("value")+"------"+allRadios.get(i).isSelected());
		}
	}
		
		/*List<WebElement> allRadios = driver.findElements(By.name("group1"));
		System.out.println(allRadios.size());
		
		for(int i=0; i<allRadios.size();i++) {
			if(allRadios.get(i).isSelected()) {
			System.out.println(allRadios.get(i).getAttribute("value")+"------"+allRadios.get(i).isSelected());
		}
		}
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		allRadios.get(2).click();
		System.out.println("-------------------------------");
		
		for(int i=0; i<allRadios.size();i++) {
			if(allRadios.get(i).isSelected()) {
			System.out.println(allRadios.get(i).getAttribute("value")+"------"+allRadios.get(i).isSelected());
		}
		}
		
		
		
		
		
		

	}

        
        
		
	    /* driver.get("https://echoecho.com/htmlforms10.htm");
	     
	     
	     List<WebElement> elementname = 
	    		
	    		 driver.findElements(By.name("group1"));
	    
	      System.out.println(elementname.size());
	      
	      for (WebElement element:elementname) {
	    	  
	    	  
	    	  System.out.println(element.getAttribute("value")+"------"+element.isSelected());
	      }
	     
		//WebElement name =driver.findElement(By.xpath("//input[@value='Cheese']"));
		
		//name.click();
		
		elementname.get(2).click();
		
		System.out.println("------------------");
		
		for (WebElement element:elementname) {
	    	  
	    	  
	    	  System.out.println(element.getAttribute("value")+"------"+element.isSelected());
	      }
	     
	}*/

}
