package Tests;
// need to import arraylist through hoveraround the code and make it correct
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
       ArrayList<String>tools = new ArrayList<String>();
       
       
       tools.add("selenium");
       tools.add("Java");
       tools.add("Junit");
       tools.add("Testing");
       System.out.println(tools.size());
       tools.add("Git");
       System.out.println(tools.size());
       
       System.out.println(tools.get(0));
       System.out.println(tools.get(1));
       System.out.println(tools.get(2));
       System.out.println(tools.get(3));
       System.out.println(tools.get(4));
       
       tools.remove(2);
       
       System.out.println(tools.size());
       System.out.println(tools.get(2));
       
       System.err.println("--------------------");
       
       for(int i=0; i<tools.size(); i++) {
    	   
    	   System.out.println(tools.get(i));
       }
	}

}
