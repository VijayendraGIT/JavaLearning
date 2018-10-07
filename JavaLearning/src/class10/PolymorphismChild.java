package class10;

public class PolymorphismChild extends PolymorphismBase{
	
	int childVariableInt1;
	String childString;
	
	// Overriding the base method PolymorphismBaseMethod1
	void PolymorphismBaseMethod1(){
		System.out.println("PolymorphismBaseMethod1 - Called from PolymorphismChild");
		//super.PolymorphismBaseMethod1();
	}
	
	//Child method
	void PolymorphismChildMethod1(){
		System.out.println("PolymorphismChildMethod1 from PolymorphismChild");
	}

	public static void main(String[] args) {

		// Child class  is used by child class reference object.
		PolymorphismChild chObj = new PolymorphismChild();
		chObj.PolymorphismBaseMethod1();
		
		// Child class  is used by base class reference object.=> "Upcasting"
		PolymorphismBase baseObj = new PolymorphismChild();
		baseObj.PolymorphismBaseMethod1();
		//baseObj.PolymorphismChildMethod1(); // NO visibility to Child class methods
		//baseObj.childString = "Child"; // No visibilty to child variable
		baseObj.baseVariableInt1 = 10; // Access to base varibles
		baseObj.baseVariableInt2 = 20;  
		baseObj.PolymorphismBaseMethod1(10); // Access to Base methods
		
		

	}

}
