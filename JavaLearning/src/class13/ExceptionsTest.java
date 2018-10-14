package class13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// 2 Types:
// Checked Exception - Compile time exceptions , It should be handled by programers
// Unchecked exceptions - Run time exceptions, situations which programers can't identify
// like program logic error, bugs
// Error : Error is irrecoverable , ex - VM has gone out of memory etc

public class ExceptionsTest {

	public static void main(String[] args) {

		File file = new File("myFile.txt");

		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			int a = 50 / 0; // ArthematicException will be thrown
			String str = null;
			System.out.println(str.length()); // NullPointer Exception

			String s = "abc";
			int i = Integer.parseInt(s); // NumberFormat Exception

			int arr[] = new int[5];
			arr[10] = 50; // ArrayOutofBounds Exception

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("ArithmeticException Found");
		} catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormatException Found");
		} catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("NullPointerException Found");
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException Found");
		}
		finally{
			// Important code that must be executed before program ends
			// Like : DB Connections closure, File Stream Closure etc..
			// It is always executed irrespective of Exception handled or not
			System.out.println("Finally Block Code is getting executed");
		}

	}

}
