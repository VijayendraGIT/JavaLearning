package class22;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	//Hashset implements Set interface
	//No duplication of elements allowed [Major difference between List and Set]
	//It skips one duplicate element
	//Uniquness acheived via HashMap - internally 
	//Unordered , hence access via index not allowed
	//Null as value is allowed
	//it is not threadsafe
	//any change in hashset after creation of iterator will throw exception"ConcurrentModificationException"
		
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("A");
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		hs.add("D");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		

	}

}
