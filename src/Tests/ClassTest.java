package Tests;

import selenium.Test4;

public class ClassTest {
// ClassName ObjName = new ClassName();
	
	static ClassTest t1 = new ClassTest();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	public static void main(String[] args) {
		
		System.out.println("I am in main Method");
		scanme();
		printme();
		
		System.out.println("after the main Method");
		t1.testMe();
		t1.paintMe();
		Test2.red();
		t2.blue();
		t3.square();
		Test3.circle();
		ArgumentTest.sum();
		
		ArgumentTest.sum(100, 200);
	
	}
	
	public static void printme() {
		
		System.out.println("PrintMe");
	}
	public static void scanme() {
		 System.out.println("ScanMe");
	}
	
	public void testMe() {
		
		System.out.println("TestMe");
	}
	public void paintMe() {
		System.out.println("paintMe");
	}

}
/// for calling second method you need to call in first main method to execute