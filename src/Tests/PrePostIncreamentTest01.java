package Tests;

public class PrePostIncreamentTest01 {

	public static void main(String[] args) {
		
		//int for number 
		int a = 10;
		System.out.println("a1-"+a);
		
		a = a+20;
	    System.out.println("a2-"+a);
	    
	    a =  a+30;
	    System.out.println("a3-"+a);
	    
	    System.out.println(a++); // i =i+1; post Increament
	    System.out.println(a);
	     
	    System.out.println(++a);// i+1=i; pre Increament
	    
	   //double
	     double b = 10.4;
	     System.out.println(b);
	     b = b+20;
	     System.out.println(b);
	   // Character
	     char c ='d';
	     System.out.println(c);
	     char e = '8';
	     System.out.println(e);
	    // boolean
	     /*boolean x = "True";
	     System.out.println(x);
	     boolean y ="False";
	     System.out.println(y);*/
	    // String 
	     String name1 = "akshay";
	     String name2 = "roshani";
	     System.out.println(name1+" "+name2);
	     String name3 ="Manisha";
	     String name4 = "Darshan";
	     System.out.println(name1+" "+name2+" "+name3);
	    // when  there is string name initially in syso than it will have string relationship but when ther is integer value at begin
	     //arithmetic relation
	     int  a1 = 10;
	     int b1 =20;
	     System.out.println(a1+b1+name1+name2+name3);
	     System.out.println(name1+name2+name3+a1+b1);
	     System.out.println(name1+name2+name3+(a1+b1));
	    // Print - when using print instead of println than it will direct printing in sma direction ,
	     //when using println ,it will direct to nextline
	     
	     String v1 = "Akky";
	     String v2 = "Ajay";
	     System.out.print(v1);
	     System.out.print(v2);
	     System.out.println(v1);
	     System.out.print("keval");
	     System.out.print("lisa");
	     System.out.println();
	     System.out.print("nidhi");
	     System.out.println();
	     
	     // if& else statement 
	     
	     int s1 = 20;
	     int s2 =30;
	     
	      for (int i =1; i<=10; i=i+2) {
	    	  System.out.println(i);
	      }
	      
	      System.out.println("--------------------------------------");
	      for (int i=0; i<=10; i++) {
	    	  System.out.println(i);
	    	  if (i ==5) {
	    		  System.out.println("got 5");
	    		 break; //continue;
	    	  }
	      }
	      System.out.println("--------------------------------------");
	     if(s1==s2) {
	    	 
	    	 System.out.println("s1 is not equal to s2");
	     } else if (s2>s1) {
	    	 System.out.println("s2 is greater than s1");
	     } else {
	    	 System.out.println("default statement");
	     }
	     
	     String expected = "akshay";
	     String actual = "Akshay";
	     
	     if (expected.equals(actual)) {
	    	 
	    	 System.out.println("True");
	     } else {
	    	 System.out.println("false");
	     }
	    
	    // for Loop conditional statement - initialization;condition;increament 
	     
	}
	
	   

}

       
