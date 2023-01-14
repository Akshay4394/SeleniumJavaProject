package SafariBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowerExceltest {

	public static void main(String[] args) throws InterruptedException {
		
		Xls_Reader r = new  Xls_Reader("/Users/akshaypatel/Desktop/Testing/Book1.Xlsx");
		
		r.getCellData("Project2", "Browser", 2);
		
        System.out.println(r.getCellData("Project2", "Browser", 2));
        
         String browsers = r.getCellData("Project2", "Browser", 2);;  //"safari","firefor"
		
		WebDriver driver = null;
		
		if(browsers.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
			
	         driver = new FirefoxDriver();
	        
				
		} else if(browsers.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/Users/akshaypatel/Desktop/SeleniumJars/chromedriver");
			
	         driver = new ChromeDriver(); 
			
		} else if(browsers.equals("safari")) {
           
			System.setProperty("webdriver.safari.driver","/Users/akshaypatel/Desktop/SeleniumJars/safaridriver");
			
	        driver = new SafariDriver(); 
			
			
		}
	 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create new account")).click();    
		
		Thread.sleep(3000);  //provided by sir in lacture
		
		driver.findElement(By.name("lastname")).sendKeys("sdgsdrhsryr");
		
		driver.findElement(By.name("reg_email__")).sendKeys("6475688679");

		
		
	}

        
	}


