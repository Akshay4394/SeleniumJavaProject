package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.gecko.driver","/Users/akshaypatel/Desktop/SeleniumJars/geckodriver");
		
        FirefoxDriver driver = new FirefoxDriver();  
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=w3ub78irnkY&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoidzN1Yjc4aXJua1kiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0OTAxNTAxNywiaWF0IjoxNjQ5MDEzODE3LCJqdGkiOiJjOTRkNDIxMS1jMmM4LTQ5OTQtOWIzZC0wMmQ3OGViNDRmMzUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.mMBWFYh556kFnP_yXWZqTLwBr3wDpo7xErVT6a4sdbBDyAsSpcAMRBLFDiwVLWM0Oew2l6kSUEIF8dHoqz_8yWSijFyG1S40Xdp9OUv5LZAAe80twyiSTeDgbSGZZ_QIU_Pjh_pcxhTAfTTwibk-owLzY3T3MuzkE_Ya_mcns0R6Jaye0XzWiYbvh0olKRYt-nDQeM5DmFpr199H9RNGwSbh3LxpWRbpbzfNFW92myAIloiEPAjP14z2KGXQ_q_5UWB-AObzQ8VRRzP3ELCg0ZYyMuKY5U3CoVkcW9EPU52OrUvWRiQGftUyNpS4LCerUGxFVcciyhTbJ8yCeIDPiA&preferred_environment="); 
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("sdvhbjmvdsbvb$%");
		
		driver.findElement(By.id("password-input")).sendKeys("1234$&");
		 
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		
		String Expectederror = "Please enter a username or card number without special characters.";
		
		String actualerror = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		
		System.out.println(actualerror);
		
		
		 if (Expectederror.equals(actualerror) ) {
			 
			 System.out.println("The Test Pass");
		 }else {
			 System.out.println("Test failed");
		 }
				
		
		
		
	}

}
