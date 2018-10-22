package class16;

//1.String is immutable , String Buffer and String Builder are mutable
//2.String uses StringBuilder or StringBuffer for concat + operator
//3.String is not thread safe, StringBuffer is thread safe and , String Builder not threadsafe
//4.String Buffer is slow or less efficient than String Builder 

public class StringTest2 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		StringBuilder s2 = new StringBuilder("Java");
		StringBuffer s3 = new StringBuffer("Java");
		
		s1.concat(" Learning");
		System.out.println("String :"+s1);
		
		s2.append(" Learning");
		System.out.println("String Builder :"+s2);
		
		s3.append(" Learning");
		System.out.println("String Buffer :"+s3);
		
		//------- String methods
		
		//String lenth
		int length = s1.length();
		System.out.println(length);
		
		// Compare to
		String s4 = "Programming";
		System.out.println(s1.compareTo(s4));
		// S1 > S4 = +ve value
		// S1 < S4 = -ve value
		// S1 == S2 =  0 
		
		// Empty
		System.out.println(s1.isEmpty());
		
		// Trim 
		String str = "                         Java ";
		System.out.println("Before Trim : length"+str.length());
		str = str.trim();
		System.out.println("After Trim : length: "+str.length());
		
		// ToLowercase
		System.out.println("To Lower case:"+str.toLowerCase());
		// ToUppercase
		System.out.println("To Upper case:" +str.toUpperCase());
		
		// replace
		
		System.out.println("Replace: "+str.replace('J', 'H'));
		System.out.println("replace with String:"+str.replace(str, "Selenium"));
		
		// contains
		String str1 = "hello Java";
		System.out.println("Contains :"+str1.contains("hi"));
		
		// Equals
		System.out.println("Equals:"+str.equals(str1));
		System.out.println("Equals Ignore case:"+str.equalsIgnoreCase(str1));
		
	
	}

}
