package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.JCommander.Builder;

public class TDListTest {

	public static void main(String[] args) throws InterruptedException {
		// Footer list size and text

		System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.td.com/ca/en/personal-banking/products/bank-accounts/savings-accounts/?cm_sp=:GOOGLE:Acquisition+RLSA+-+PS%26I+-+Core+Branded+-+(22_S_BR_BAC_AO_ACQ_ENFR_NAT):DIF:Core+Branded+-+Exact&gclid=EAIaIQobChMI0-TPpf6e9wIVzytMCh1fCQB-EAAYASAAEgIHV_D_BwE&gclsrc=aw.ds");
		
		WebElement ProductList =driver.findElement(By.xpath("//li[@class='td-dropdown active']"));
		
		Actions ServiceList = new Actions(driver);
		
		ServiceList.moveToElement(ProductList).build().perform();
		
		Thread.sleep(3000);
		
		/*Select Product = new Select (ProductList);
		
		Product.selectByValue("Credit Cards");8*/
		
		
		//WebElement craditcard =driver.findElement(By.linkText("Credit Cards"));
		
		
		List<WebElement>Footerlink = driver.findElements(By.xpath("//ul[@aria-labelledby='td-desktop-nav-dropdown-link-2']/li"));
				//li[@class='td-dropdown active']//li"));
		
		int ListSize = Footerlink.size();
		
		System.out.println(ListSize);
		
		Thread.sleep(3000);
		
		for(WebElement dropdownlist:Footerlink) {
			
			System.out.println(dropdownlist.getText());
		}
		
        Thread.sleep(3000);
        
        WebElement bankaccount = driver.findElement(By.linkText("Bank Accounts"));
        
        bankaccount.click();
        
        driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); //Google
		
        
        
      List<WebElement> Tdsegments = driver.findElements(By.xpath("//div[@class='td-segments']//li"));
      
      int SegmenSize = Tdsegments.size();
      
      System.out.println(SegmenSize);
     
      
      for(WebElement Segments:Tdsegments) {
    	  
    	  System.out.println(Segments.getText()+"----"+Segments.isSelected());
    	  
      }
	
       
        
	}

}

