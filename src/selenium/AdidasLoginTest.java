package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//X-path tutorial
		
		//classname objname = new classname();
        //FirefoxDriver driver = new FirefoxDriver();  
		//interfacename (parentsclass) objname = new classname();

		
		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.adidas.ca/en/account-login");
        
        Thread.sleep(3000);
		 
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Akshaypatel4394@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("cdwvcmnvwcdfhj");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        String Expectederror = "Incorrect email/password – please check and retry";
        
        String Actualerror = driver.findElement(By.xpath("//div[@class='gl-vspace-bpall-small']/div")).getText();
        
        System.out.println(Actualerror);
        
       
       
        
        
        
        
        
        
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        
       // String Expected = "Your request timed out – please retry";
        
      // String Actual = driver.findElement(By.linkText("//div[@data-auto-id ='login-error-message']").
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
