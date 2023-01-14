package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
        
        Thread.sleep(3000);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	    
		List<WebElement>cols = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("number of column-----"+cols.size());
		
		Thread.sleep(3000);
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		
		System.out.println("number of rows-----"+rows.size());
		
		 Thread.sleep(3000);
		 
		for (int i=2; i<=rows.size();i++) {
			
			for(int j=1; j<=cols.size(); j++)
			
			{ System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
			
			//System.out.print("  |  ");
		}
		
		//System.out.println();
	}
				
		/*String one = "//table[@id='customers']//tr[";
		String two = "]/td[";
		String three = "]";*/
	}
	
}
		
		
		
		
	


