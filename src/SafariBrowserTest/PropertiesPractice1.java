package SafariBrowserTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPractice1 {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream f = new FileInputStream("/Users/akshaypatel/Desktop/Testing/Practice.Properties");
		 
		 Properties r = new Properties();
		 
		 r.load(f);
		 
		 r.getProperty("Name");
		 
		 System.out.println( r.getProperty("Name"));
		 System.out.println( r.getProperty("Browser"));
		 System.out.println(r.getProperty("Data"));
		 
		 r.setProperty("key", "income");
		 
		 System.out.println(r.getProperty("key"));
		 
		 FileOutputStream u = new FileOutputStream("/Users/akshaypatel/Desktop/Testing/Practice.Properties");
		 
		 r.store(u,"adding new property");
		 

	}

}
