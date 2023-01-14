package Tests;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 10;
       int b = 20;
       
       if (a==b) {
    	   System.out.println("a is equal to b");
       } else {
    	   System.out.println("a is not equal to b");
       }
	
	
	String expected = "Selenium";
	
	String actual   = "Selenium";
	
	if (expected.equals(actual)) {
		System.out.println("Test Pass");
	} else { System.out.println("Test not pass");
		
	}

}
}