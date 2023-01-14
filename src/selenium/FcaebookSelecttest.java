package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FcaebookSelecttest {

	public static void main(String[] args) throws InterruptedException {
	
		   /* click on create a new account
				
				//enter lastName
				//enter 10 digit mobile number
				//enter password
				//click on SignUp*/
	System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
				
		        FirefoxDriver driver = new FirefoxDriver();  
				
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(3000);
				
				driver.findElement(By.linkText("Create new account")).click();
				
				Thread.sleep(3000);  //provided by sir in lacture
				
				driver.findElement(By.name("lastname")).sendKeys("sdgsdrhsryr");
				
				driver.findElement(By.name("reg_email__")).sendKeys("6475688679");
				
				driver.findElement(By.id("password_step_input")).sendKeys("sgsrfhsthhtsegr");

				driver.findElement(By.name("websubmit")).click();
				
				 WebElement SelecteMonth= driver.findElement(By.name("birthday_month"));
				 
				 Select s = new Select(SelecteMonth);
				 
				 s.selectByValue("7");
				 
				 WebElement BirthYear = driver.findElement(By.name("birthday_year"));
				 
				 Select year = new Select(BirthYear);
				 
				 s.selectByValue("5");
				 
				 WebElement BirthDate = driver.findElement(By.name("birthday_day"));
				 
				 Select Date = new Select(BirthDate);
				 
				 s.selectByValue("8");
				 
				  Thread.sleep(3000);
				 driver.quit();
				 /*s.selectByValue("8");
				  driver.findElement(By.xpath("))
				 
				 String s = driver.findElement(By.xpath("//div[@id='js_26x']")).getAttribute("What’s your name?");
					
				System.out.println(s)			
		        homework -select july,select 2000,select date 20;*/
			

				 
					}
					
				
				
				
	}



