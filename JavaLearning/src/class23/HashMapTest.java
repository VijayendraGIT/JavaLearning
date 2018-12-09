package class23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	
	//It maintains a unique Key-Value pair
	//Extends abstract Map and implements map
	//No Duplicate keys allowed
	//It is unordered, specific order or sequencing not maintained 
	//One null as a key and multiple value as null is allowed
	//If no element exists in Map , it throws "NoSuchElementException"
	//It uses Hashing internally,it is a technique of converting large string to small string that represents same string
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> student = new HashMap<Integer,String>();
		student.put(1, "Ram");
		student.put(2, "Shyam");
		student.put(3, "Sandeep");
		student.put(null, "NullValue");
		student.put(4, "Vikas");
		student.put(5, null);
		student.put(6, null);
		
		//traversing through For each loop
		for(Map.Entry<Integer, String> m:student.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		student.replace(5, "Amrita");
		student.remove(null);
		
		System.out.println(student);
		
		//Traversing via Iterator
		System.out.println("******************");
		Set<Entry<Integer, String>> set = student.entrySet(); //Converting to Set for iteration
		Iterator<Entry<Integer, String>> it = set.iterator();
		while(it.hasNext()){
			//Converting to Map Entry to get Key and value Separately
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		


	}

}
