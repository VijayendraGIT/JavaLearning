package class24;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedhashMapTest {
	
	//It extends HashMap and implements map Interface
	//Unique key, value pair
	//one Null as a key and multiple null as value
	// It maintains insertion order
	
	public static void main(String[] args) {

		LinkedHashMap<Integer,String> lp = new LinkedHashMap<Integer,String>();
		lp.put(1, "A");
		lp.put(2, "B");
		lp.put(30, "X");
		lp.put(10, "M");
		lp.put(null, "NullValue");
		lp.put(2, "B");
		
		//Travarse via Foreach loop
		for(Map.Entry<Integer, String> m:lp.entrySet()){
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		//Traverse via Iterator
		//1.Convert Map to Set for iteration
		Set<Entry<Integer,String>> st = lp.entrySet();
		//2. Create iterator for Set
		Iterator<Entry<Integer,String>> it = st.iterator();
		while(it.hasNext()){
			//3. Convert SetEntry to Map Entry to get Key and Value seperatly
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)it.next();
			System.out.println("Iterator :"+entry.getKey()+ " "+ entry.getValue());
		}
		

	}

}
