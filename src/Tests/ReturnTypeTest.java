package Tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		
		System.out.println(sum());
		
		int x = sum();
		
		System.out.println(x);
		System.out.println(Hello());
		
		
	}

	public static int sum() {
		
		int a = 4+5;
		
		System.out.println(a);
		return a;	
		
	}
	
	public static String Hello() {
		
		String s = "hello world";
		return s;
	}
	
	
	
}
