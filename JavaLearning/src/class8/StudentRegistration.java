package class8;

public class StudentRegistration {
	
	static int studentCount = 0;
	String name;
	int age;
	String section;
	
	static void incrementStudent(){
		studentCount++;
	}
	StudentRegistration(String name,int age, String section){
		this.name = name;
		this.age = age;
		this.section = section;
		incrementStudent();
	}
	static void displayStudentCount(){
		System.out.println("Toal student count is :"+studentCount);
	}
	
	public static void main(String[] args) {
		
		StudentRegistration s1 = new StudentRegistration("Rohan", 10, "3A");
		StudentRegistration s2 = new StudentRegistration("Priya", 10, "3A");
		StudentRegistration s3 = new StudentRegistration("Sandeep", 10, "3A");
		StudentRegistration s4 = new StudentRegistration("Amrita", 10, "3A");
	
		StudentRegistration.displayStudentCount();
		System.out.println("Students = "+StudentRegistration.studentCount);
		
	}

}
