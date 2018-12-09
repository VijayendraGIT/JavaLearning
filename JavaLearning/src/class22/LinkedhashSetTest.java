package class22;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSetTest {
	//Inherits HashSet and implements Set interface
	//It maintains insertion ORDER
	//Unique elements - No duplication of elements are allowed
	//Internal implementation is based on Doubly linked list

	public static void main(String[] args) {

		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("A");
		s.add("B");
		s.add("A");
		s.add("C");
		s.add(null);
		s.add("D");
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		s.remove("C");
		System.out.println(s);

	}

}
