package class6;

public class AccessSpecifier {
	
	// Four Types of Access Specifiers / Modifier
	// 1. private -> within class only
	// 2. Default -> with in package only
	// 3. Protected -> with in and out side package via inheritance only
	// 4. Public -> open to all within class and package
	
	private int a; // private
	int b; // Default 
	protected int pro; // Protected
	private void privateMethod(){
		
	}
	
	public void publicMethod(){
		a =10;
		System.out.println("a ="+a);
	}
	
	protected void protectedMethod(){
		
	}


	
}
