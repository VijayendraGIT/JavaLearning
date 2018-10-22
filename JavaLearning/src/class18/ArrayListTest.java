package class18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	// Can contain duplicate elements
	// It maintains insertion order
	// Random access is possible via index ex - a[0]
	// Slow in performance - any element gets removed , it shifts all remaining elements into one index back
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); // parameterized ArrayList
		//ArrayList list1 = new ArrayList(); - Generic List - not recommended
	
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		//Traverse via iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList<String> list2 =new ArrayList<String>();
		list2.add("D");
		list2.add("E");
		list2.add("F");
		
		//merging two lists 
		list.addAll(list2);
		
		//Traverse via foreach loop
		for(String obj:list){
			System.out.println("Print via ForEach :"+obj);
		}
		
		list2.addAll(list);
		
		System.out.println(list2);

	}

}
