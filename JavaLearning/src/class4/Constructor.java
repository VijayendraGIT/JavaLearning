package class4;

public class Constructor {
	
	// Constructor will have same name as class name
	// don't have any return type
	// Default constructor is provided by Java Compiler
	// Default constructors are always zero arguments and are invisible.
	// If we define any own constructor , default constructor will no longer available
	// it gets called while object creation
	// Initalization of variabales
	
	int a;
	float f;
	String str;
	boolean bool;
	
	// Initializer block
	
	{
		a = 100;
		f = 215.5f;
		str = "Constructor Program";
		bool = false;
		System.out.println("Initalizer block called");
	}
	
	Constructor(){
		System.out.println("Constructor with zero arguments called");
	}
	
	Constructor(int a){
		// this.a => Class variable
		// a -> Local variable
		this.a = a;
		System.out.println("calling Constructor with 1 argument : "+a);
	}
	
	Constructor(int a, String str) {
		this.a = a;
		this.str = str;
		System.out.println("Calling constructor with 2 arguments : a ="+a+"str ="+str);
	}
	
	Constructor(int a, float f, String str, Boolean b) {
		this.a = a;
		this.f = f;
		this.str = str;
		this.bool = b;
		System.out.println("Calling constructor with 4 different datatypes: a ="+a+"f ="+f+"str ="+str+" bool ="+b);
	}
	
	// Constructor method
	public void Constructor(){
		
		System.out.println("Calling Constructor method");
	}
	
	public static void main(String[] args) {

		Constructor obj = new Constructor();
		System.out.println(obj.a);
		obj.Constructor(); // calling Constructor method
		Constructor obj1 = new Constructor(15); // Calling 1 Argument constructor
		System.out.println("Value of a ="+obj1.a);
		Constructor obj2 = new Constructor(20,"Java"); // Calling 2 Argument constructor
		System.out.println("value of a ="+obj2.a+"str ="+obj2.str);
		Constructor obj3 = new Constructor(30, 20.0f,"Strings",true); // calling 4 argument constructor
			
	}

}
