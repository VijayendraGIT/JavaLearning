package class15;

public class TestString {

	public static void main(String[] args) {
		
		//String is a sequence of characters
		// String is immutable - can't change or modified
		char[] ch = {'J','A','V','A'}; 
		//String creation via new keyword
		String s = new String(ch);
		System.out.println(s);
		
		//String creation via String Literal
		String s1 = "Java";
		String s2 = "Java"; // "Java" string searched in "String const pool" and checks if Same literal string present, if yes pass same refernce shared by S1
		
		s1.concat(" Learning"); // In memeory only Java, s1 is constant
		s1 = s1.concat(" Learning");
		
		System.out.println(s1);
		

	}

}
