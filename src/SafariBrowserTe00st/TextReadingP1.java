package SafariBrowserTe00st;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextReadingP1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("/Users/akshaypatel/Desktop/Testing\\test2");
		
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bf = new BufferedWriter(fw);
		
		bf.write("this is 1st practice");
		bf.newLine();
		bf.write("this is 2st practice");
		bf.newLine();
		bf.write("this is 3st practice");
		bf.newLine();
		bf.write("this is 4st practice");
		bf.flush();
		
		
		FileReader r = new FileReader(f);
		
		BufferedReader br = new BufferedReader(r);
		
		/*System.out.println(br.readLine());
	
		System.out.println(br.readLine());
		
		System.out.println(br.readLine());*/
		
		String x ;
		
		int i = 0;
		
		while ((x =br.readLine())!= null ) {
			
			System.out.println(x);
			
			i++;
		}
		
		System.out.println("Number of lines:"+i); 
	}

}
