package Tests;

public class Test2 {
static Test2 t2 = new Test2();
	public static void red() {
		
		System.out.println("red");
		t2.blue();
	}
	
	public void blue () {
		
		System.out.println("Blue");
	}
	
	public Test2 () {
		
		System.out.println("I,m in new Constructor");
	}
}
