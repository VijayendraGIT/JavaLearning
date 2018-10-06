package class9;

public class CallByValueAndReference {

	int a;
	int b;

	int sum(int x, int y) {
		return x + y;
	}

	int sumbyReference(CallByValueAndReference obj) {
		return obj.a + obj.b;
	}

	void swapNumber(CallByValueAndReference obj) {
		int temp = obj.a;
		obj.a = obj.b;
		obj.b = temp;
	}

	public static void main(String[] args) {

		CallByValueAndReference obj1 = new CallByValueAndReference();

		//CallByValueAndReference obj2 = obj1;
		// Call by Value

		int c = obj1.sum(10, 20);
		System.out.println("Sum value is " + c);

		// Call by reference
		obj1.a = 10;
		obj1.b = 20;

		System.out.println("Values before Swap: a = " + obj1.a + " b = " + obj1.b);
		obj1.swapNumber(obj1);
		System.out.println("Values after Swap: a = " + obj1.a + " b = " + obj1.b);

	}

}
