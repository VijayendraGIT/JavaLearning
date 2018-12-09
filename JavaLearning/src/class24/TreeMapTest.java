package class24;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	//Implements Map and extends Abstract Map
	//Contains only unique key
	//Key can't be null value, Value can be null
	//It maintains order
	//keys are sorted in ascending order

	public static void main(String[] args) {

		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1, "A");
		tm.put(34, "B");
		tm.put(12, "C");
		//tm.put(null, "Null Value"); // It will throw NullPointerException
		tm.put(45, null);
		tm.put(121, "Z");
		tm.put(71, "B");
		
		for(Map.Entry<Integer, String> mp:tm.entrySet()){
			System.out.println(mp.getKey()+ " "+mp.getValue());
		}
		
		tm.replace(45, "D");
		System.out.println(tm);
		
		tm.remove(45);
		System.out.println(tm);

	}

}
