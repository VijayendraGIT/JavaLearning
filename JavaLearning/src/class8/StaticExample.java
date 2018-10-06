package class8;

public class StaticExample {
	
	// 1. Class variable
	// 2. Class methods/ functions 
	// 3. Initalizer Blocks
	// 4. Nested Classes
	
	int a;
	int b ;
	int c;
	static int d;
	
	 static void method(){
		
		//int a; // Can't access local class variables
		//int b; // Can't access local class variables
		d = 10; // Static methods work with static variables
		System.out.println("Static method called :d  ="+d);
		
	}
	 // Initalizer block
	 {
		 a = 20;
		 b = 60;
		 c = 80;
	 }
	 
	 //Static initalizer block
	 static{
		 d =100;
	 }

	 void testStaticCall(){
		 d = 50;
		 method();
	 }
	public static void main(String[] args) {
		
		StaticExample obj = new StaticExample();
		obj.a = 10;
		obj.b = 20;
		obj.c = 30;
		obj.d = 11;
		
		StaticExample obj1 = new StaticExample();
		obj1.a = 100;
		obj1.b = 200;
		obj1.c = 300;
		
		StaticExample.d = 50;
		StaticExample.method();


	}

}
