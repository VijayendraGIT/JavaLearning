package class7;

public class SuperClass {
	
	int a;
	int b;
	
	void display(){
		System.out.println("Super Class : a = "+this.a);
		System.out.println("Super Class : b = "+this.b);
	}
	
	SuperClass(int a){
		this.a = a;
		System.out.println(" SuperClass - one argument constructor called");
	}
	
	SuperClass(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(" SuperClass - two argument constructor called");
	}
	

}
