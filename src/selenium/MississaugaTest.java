package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  // its constructor and open firefox
		
		driver.get("https://www.mississauga.ca/");
		
		WebElement OurOrganization = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		
		Actions Organisation = new Actions(driver);
		
		Organisation.moveToElement(OurOrganization).build().perform();
		
		OurOrganization.click();
		
		
		Thread.sleep(3000);
		
        
		List<WebElement>OrganisaionList= driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		
		System.out.println(OrganisaionList.size());
		
		for(WebElement organisationlist:OrganisaionList) {
			
			System.out.println(organisationlist.getText());
		}
		
		
		List<WebElement> TopRequest = driver.findElements(By.xpath("//ul[@class='top-requests']/li"));
		
		System.out.println(TopRequest.size());
		
		 
		for(WebElement toprequest:TopRequest) {
			
			System.out.println(toprequest.getText()+"-----"+toprequest.isSelected());
		}
		
		List<WebElement> Resources = driver.findElements(By.xpath("//ul[@class='tile-list row']/li"));
		
		System.out.println(Resources.size());	
		
		for(WebElement resources:Resources) {
			
			System.out.println(resources.getText()+"------"+resources.isSelected());
		}
		
		WebElement PetAnimals = driver.findElement(By.xpath("//div[contains(text(),'Animals and pets')]"));
		
		PetAnimals.click();
		
		System.out.println("====================Afterclick================");
		
        for(WebElement resources:Resources) {
			
			System.out.println(resources.getText()+"------"+resources.isSelected());
		}
		
	}
	

}
