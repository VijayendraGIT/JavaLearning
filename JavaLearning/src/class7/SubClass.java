package class7;

public class SubClass extends SuperClass{
	
	int a;
	int b;
	
	void display(){
		System.out.println("SubClass : a = "+this.a);
		System.out.println("SubClass : b = "+this.b);
		super.display(); // Calling parent class display
	}
	
	int[] returningArray(){
		int[] arr = {1,2,3,4};
		
		return arr;
		
	}
	SubClass(int a, int b , int c, int d){

		super(a,b); // Invoking Parent class constructor with 
		System.out.println("values received: a = "+a+" b ="+b+" c ="+c+" d ="+d);
		this.a = c; 
		this.b = d;
		
	}
	

	public static void main(String[] args) {
		
		SubClass subObj = new SubClass(10,20,30,40);
		subObj.display();
		
		int array[] = subObj.returningArray();
		
		System.out.println(array[0]);
	}

}
