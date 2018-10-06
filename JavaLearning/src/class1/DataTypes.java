package class1;

public class DataTypes {
	
	boolean findEvenNo(int a){
		if(a%2 == 0)
		return true;
		else 
		return false;
		
	}

	public static void main(String[] args) {
		
		// Primitive data Types 
		// int , double, char, bool

		// integers
		byte b = 8; // 8 bit
		short s = 16; //16 bit
		int i = 32; // 32 bit
		long l = 64; // 64 bit
		
		System.out.println("b = "+b);
		System.out.println("s = "+s);
		System.out.println("i = "+i);
		System.out.println("l = "+l);
		
		// Decimals
		
		float f = 3.14f; // 16 bit
		double d = 32.4d; //32 bit
		
		System.out.println("f = "+f);
		System.out.println("d = "+d);
		
		// Char
		char c = 'c';
		System.out.println("c = "+c);
	
	   // boolean
		boolean bool = true;
		System.out.println("bool = "+bool);
		System.out.print("ABC");
		System.out.println("DEF");
		
		

	}

}
