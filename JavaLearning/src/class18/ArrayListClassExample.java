package class18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClassExample {

	int empNo;
	String name;
	int age;
	
	public ArrayListClassExample(int empNo,String name,int age){
		this.empNo = empNo;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		ArrayListClassExample e1 = new ArrayListClassExample(1001,"Sandeep",27);
		ArrayListClassExample e2 = new ArrayListClassExample(1002,"harpret",25);
		ArrayListClassExample e3 = new ArrayListClassExample(1001,"Amrita",26);
		
		ArrayList<ArrayListClassExample> employeeList = new ArrayList<ArrayListClassExample>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		Iterator<ArrayListClassExample> it = employeeList.iterator();
		while(it.hasNext()){
			ArrayListClassExample et = (ArrayListClassExample)it.next();
			System.out.println("Employee NO:"+et.empNo+" Employee Name:"+et.name+" Employee Age:"+et.age);
		}
		
		

	}

}
