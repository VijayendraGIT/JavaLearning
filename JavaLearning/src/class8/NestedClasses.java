package class8;

public class NestedClasses {
	
	static int data = 30;
	
	// Nested Class
	static class Inner{
		
		// Non Static method
		void display(){
			System.out.println("Data = "+data);
		}
		
		// Static method
		static void staticDisplay(){
			System.out.println("Data from Static method: data = "+data);
		}
	}

	public static void main(String[] args) {

		NestedClasses.Inner obj = new NestedClasses.Inner();
		obj.display();
		
		NestedClasses.Inner.staticDisplay();
		
	}

}
