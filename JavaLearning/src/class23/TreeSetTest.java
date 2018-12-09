package class23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
	//TreeSet implements "Set" interface and has tree for storage
	//Objects stored in ascending order
	//No duplicate elements allowed
	//Insertion order of elements not maintained
	//Excellent choice for storing sorted data/information and have a quick access
	//It has Self balancing binary search tree and hence accessibility is so fast
	//Null can't be added as element
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("D");
		ts.add("C");
		ts.add("z");
		ts.add("a");
		ts.add("A");
		ts.add("1");
		ts.add("*");
		
		System.out.println(ts);

		ts.remove("C");
		System.out.println(ts);
		
		TreeSet<Integer> tsi = new TreeSet<Integer>();
		tsi.add(45);
		tsi.add(101);
		tsi.add(10);
		tsi.add(91);
		
		//Traverse through iterator 
		Iterator<Integer> it = tsi.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
