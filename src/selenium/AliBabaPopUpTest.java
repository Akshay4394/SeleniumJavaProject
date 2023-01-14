package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AliBabaPopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://best.aliexpress.com/?src=google&albch=fbrnd&acnt=347-178-5672&albcp=2043897087&albag=77948300611&slnk=&trgt=aud-842000338059%3Akwd-14802285088&plac=&crea=357666257741&netw=g&device=c&mtctp=e&memo1=&albbt=Google_7_fbrnd&albagn=888888&isSmbActive=false&isSmbAutoCall=false&needSmbHouyi=false&gclid=EAIaIQobChMIv9etsbmk9wIV52xvBB3PugxJEAAYASAAEgKjNPD_BwE&aff_fcid=141a6dfadcf644e9b0add35dd6d66d0a-1650519798358-02071-UneMJZVf&aff_fsk=UneMJZVf&aff_platform=aaf&sk=UneMJZVf&aff_trace_key=141a6dfadcf644e9b0add35dd6d66d0a-1650519798358-02071-UneMJZVf&terminal_id=f1a333e11ffa47f1acc0e8c21ca53e4f&afSmartRedirect=y");
	
	    List<WebElement>Poppup1 = driver.findElements(By.className("btn-close"));
	    
	    System.out.println(Poppup1.size());
		
	    if(Poppup1.size()>0) {
	    	
	    	Poppup1.get(0).click();
	    }
	    
       List<WebElement>Poppup2 = driver.findElements(By.className("_24EHh"));
	    
	    System.out.println(Poppup2.size());
	    
	    if(Poppup2.size()>0) {
	    	
	    	System.out.println(Poppup2.size());
	    	
	    	Poppup2.get(0).click();
	    	
	    }
	    
	    Thread.sleep(3000);
		
	   WebElement SearchKey = driver.findElement(By.id("search-key"));
	   
	   SearchKey.sendKeys("computer");
	   
	   Thread.sleep(3000);
	   
	   SearchKey.clear();
	   
	  Thread.sleep(3000);
	   
	   WebElement Suggestionlist = driver.findElement(By.id("search-dropdown-box"));
	   
	   Suggestionlist.click();
	   
	   /*Thread.sleep(3000);
	   
	   Select a = new Select(Suggestionlist);
	   
	   a.selectByIndex(2);
	   
	    System.out.println(a);*/
	    
	    
		
		
		
	}

}
