package class3;

public class Functions {
	
	int a;
	int b;
	int result;
	
	// public -> Access Accessifer / Modifier
	
	public int sum(int a,int b){
		int c = a+b;
		return c;
	}
	
	public void sum(){
		result = a+b;
	}

	public static void main(String[] args) {

		// Creation of new object of Functions Class
		Functions obj = new Functions();
		obj.a =10;
		obj.b =20;
		int c = 0;
		c = obj.sum(obj.a, obj.b);
		System.out.println("Sum is "+c);
		
		//Calling another sum
		obj.sum();
		System.out.println("Result = "+obj.result);
		
	}

}
