package class10;

// Polymorphism => Can have multiple Form
// 1. Static Polymorphism - Compile time polymorphism - Overloading
//  - Sequence of arguments should be different
//  -  should have same method name
//  -  return type can be anything but sequence of arguments should be different.
// 2. Dynamic Polymorphism - Run time polymorphism

public class PolymorphismBase {
	
	int baseVariableInt1;
	int baseVariableInt2;
	
	// PolymorphismBaseMethod1 method is overloaded with 2 more methods with different signatures
	
	void PolymorphismBaseMethod1(){
		System.out.println("PolymorphismBase- Calling method1");
	}

	void PolymorphismBaseMethod1(int a){
		System.out.println("PolymorphismBase- Calling method1 with one argument");
	}
	
	void PolymorphismBaseMethod1(int a, double b){
		System.out.println("PolymorphismBase- Calling method1 with two argument");
	}
	
	void PolymorphismBaseMethod1(double ad,int c){
		System.out.println("PolymorphismBase- Calling method1 with one argument");
	}
	
	void PolymorphismBaseMethod1(int c,double b, int a){
		System.out.println("PolymorphismBase- Calling method1 with one argument");
	}
}
