package class14;

import java.io.IOException;

public class TestThrows {

	// Used to declare exception
	// Programmer to provide code of exception
	
	void method() throws IOException, ArithmeticException{
		throw new IOException("New IO error");
	}
	
	// Exception e = new IOException("New IO Error");
	
	public static void main(String[] args) {
		
		try{
			TestThrows obj = new TestThrows();
			obj.method();
		}
		catch(Exception e){
			System.out.println("Exception Handled : "+e);
		}
		
		System.out.println("Normal flow starts");
	}

}
