package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AliExpressHowerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//hower test for women and all highlighted manu
		
    System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://best.aliexpress.com/?src=google&albch=fbrnd&acnt=347-178-5672&albcp=2043897087&albag=77948300611&slnk=&trgt=aud-842000338059%3Akwd-14802285088&plac=&crea=357666257741&netw=g&device=c&mtctp=e&memo1=&albbt=Google_7_fbrnd&albagn=888888&isSmbActive=false&isSmbAutoCall=false&needSmbHouyi=false&gclid=EAIaIQobChMIv9etsbmk9wIV52xvBB3PugxJEAAYASAAEgKjNPD_BwE&aff_fcid=141a6dfadcf644e9b0add35dd6d66d0a-1650519798358-02071-UneMJZVf&aff_fsk=UneMJZVf&aff_platform=aaf&sk=UneMJZVf&aff_trace_key=141a6dfadcf644e9b0add35dd6d66d0a-1650519798358-02071-UneMJZVf&terminal_id=f1a333e11ffa47f1acc0e8c21ca53e4f&afSmartRedirect=y");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//wait.until(ExpectedConditions.numberOfElementsToBe(By.className("btn-close"), 1));
		
		List<WebElement>popup1 = driver.findElements(By.className("btn-close"));
		
		System.out.println(popup1.size());
		
		if (popup1.size()>0) {
			
			System.out.println(popup1.get(0).getText());
			
			popup1.get(0).click();
		}
		
		List<WebElement>popup2 = driver.findElements(By.className("_24EHh"));
		
		System.out.println(popup2.size());
		
		if(popup2.size()>0) {
			
			System.out.println(popup2.get(0).getText());
			
			popup2.get(0).click();
		
		}
	
		WebElement WomensFashion = driver.findElement(By.linkText("Women's Fashion"));
		
		Actions w1 = new Actions(driver);
		
		w1.moveToElement(WomensFashion).build().perform();
		
		//Thread.sleep(3000);
		
		List<WebElement> womenfashion = driver.findElements(By.xpath("//dl[contains(@class,'sub-cate-items')]//a"));
		
		System.out.println(womenfashion.size());
		
		// Thread.sleep(3000);
		 
		for(WebElement  FAshionCatagory:womenfashion) {
			
			System.out.println(FAshionCatagory.getText()+"-----");	
			
			System.out.println(FAshionCatagory.isDisplayed());
			
		}
			
		
		
		
	}

}
