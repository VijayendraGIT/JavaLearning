package class3;

public class TwoDArrays {

	public static void main(String[] args) {
		/*
		 * 00 01 02 
		 * 10 11 12 
		 * 20 21 22
		 */

		// Declaration of 2 D Array
		int[][] arr = new int[3][3];

		// Initalize
		arr[0][0] = 100; // 1st Row
		arr[0][1] = 101;
		arr[0][2] = 102;

		arr[1][0] = 200; // 2nd Row
		arr[1][1] = 201;
		arr[1][2] = 202;

		arr[2][0] = 300; // 3rd Row
		arr[2][1] = 301;
		arr[2][2] = 302;

		// Print Array Elements using 2 For loops

		for (int i = 0; i < arr.length; i++) { // for traversing Rows - for changing row
			System.out.println();
			for (int j = 0; j < arr.length; j++) { // for changing coloums
				System.out.print (arr[i][j]+" ");
			}
		}

	}

}
