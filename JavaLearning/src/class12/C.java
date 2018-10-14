package class12;

public class C extends B{

	@Override
	public void interfaceMethod1() {
	
		System.out.println("Inside C : interfaceMethod1");
		
	}

	@Override
	public void interfacemethod2() {
	System.out.println("Inside C : interfaceMethod2");
		
	}
	
	public void abstractmethod1(){
		
		System.out.println("Inside C : abstractmethod1");
	}
	
	public static void main(String[] args) {

		C obj = new C();
		obj.abstractmethod(); // Accessing Abstract class method
		obj.interfaceMethod1(); // Accessing C class interface method implementation
		obj.interfaceMethod1(); // Accessing C class interface method implementation

	}

}
