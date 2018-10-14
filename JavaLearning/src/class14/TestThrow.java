package class14;

public class TestThrow {
	
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("Not valid Age to caste vote");
		} else {
			System.out.println("Welcome to Vote");
		}
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("Rest of code");


	}

}
