package class2;

public class Loops {

	public static void main(String[] args) {
		// For loops

		int a = 1;

		// Shortcut for Print : syso +ctrl + Space
		// Shrtcut To Format Code in Eclipse
		// 1. Ctrl+A
		// 2. Ctrl+Shift+F
		System.out.println("1");
		System.out.println("2");

		// x++ => x=x+1
		
		for (int x = 1; x <= 10;x++) {
			System.out.println(x);
			//x++;
		}

		// While loop
		System.out.println("**In While Loop**");
		while (a != 11) {
			System.out.println("Printing 1to10 ->" + a);
			a++;
		}

		// Do While loop
		a = 1;
		do {
			// Print 1 to 10 in Do while
			System.out.println("In Do While ->" + a);
			a++;
		} while (a < 11);

	}
}
