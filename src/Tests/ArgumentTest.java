package Tests;

public class ArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		sum();
		sum(4,5);
		sum(4,5,6);
	}
	// if you want to use same method than you need to change the argument .otherwise , use different method name to execute the same argument.,
	 public static void sum() {
		 
		 int a = 4 + 5 ;
		 
		 System.out.println(a);
	 }
	 
	 public static void sum(int b ,  int c) {
		 
		 int a = b + c;
		 
		 System.out.println(a);
	 }
	 
	 public static void  sum (int b, int c, int d) {
		 
		 int a = b + c + d;
		 
		 System.out.println(a);
		 
		 
	 }

}
