package SafariBrowserTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPreactice2Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("/Users/akshaypatel/Desktop/Testing/Practice2.Properties");
		
		Properties f2 = new Properties();
		
		f2.load(f);
		
		System.out.println(f2.getProperty("Name"));
		
		System.out.println(f2.getProperty("Relationship"));
		
		System.out.println(f2.getProperty("Occupation"));
		
		f2.setProperty("strenth","HardWorking");
		
		System.out.println(f2.getProperty("strenth"));
		
		FileOutputStream file = new FileOutputStream("/Users/akshaypatel/Desktop/Testing/Practice2.Properties");
		
		f2.store(file, "Adding New Properties");

	}

}
