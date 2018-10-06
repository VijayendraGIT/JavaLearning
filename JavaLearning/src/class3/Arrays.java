package class3;

public class Arrays {

	public static void main(String[] args) {

		// 1. Declaration of Array
		int[] arr1 = new int[4];
		// 2.
		int arr2[] = new int[4];
		// 3.
		int[] arr3 = {100,200,300,400};
		
		String strArr[] = new String[4];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		
		for (int i=0 ; i<4;i++){
			System.out.println("Printing arr["+i+"] = "+arr1[i]);
		}
			
	}

}
