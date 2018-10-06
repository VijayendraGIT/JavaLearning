package class9;

public class WapperClasses {

	// Used for conversion between one data type to another data type
	// Integer, Double, Boolean => Wrapper classes
	// String -> Int , String to double, Int -> String
	
	public static void main(String[] args) {
		
		// String -> Integer
		String str = "10";
		int value = Integer.parseInt(str);
		System.out.println("int value = "+value);
		
		//String -> Boolean
		String bool = "true";
		boolean boolValue = Boolean.parseBoolean(bool);
		System.out.println("Bool value is "+boolValue);
		
		// String -> Double
		String d = "3.14";
		double doubleValue = Double.parseDouble(d);
		System.out.println("Double Value is "+doubleValue);

		// Int -> String
		int a = 23;
		String strValue = String.valueOf(a);
		System.out.println("String value = "+strValue);
		
		// If value of data type is not convertible, it will throw : 
		//NumberFormatException 
		String test = "100A";
		int testInt = Integer.parseInt(test);
		System.out.println("Test Int value = "+testInt);
	
		
	}

}
