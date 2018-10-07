package class10;

import java.util.Scanner;

// Used to take user input in program under execution
public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine(); // String Input
		System.out.println("Print String str ="+str);

		System.out.println("Enter a Char");
		char c = sc.next().charAt(0);
		System.out.println("Print Character c="+c);
		
		System.out.println("Enter a Integer");
		int a = sc.nextInt();
		System.out.println("Print integer a="+a);
		
		System.out.println("Enter a Long value");
		long l = sc.nextLong();
		System.out.println("Print long value l="+l);
		
		System.out.println("Enter a Double value");
		double d = sc.nextDouble();
		System.out.println("Pring Double value d="+d);
		
		// Close input
		sc.close();

	}

}
