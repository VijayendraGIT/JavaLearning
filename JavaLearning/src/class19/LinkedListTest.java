package class19;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	
	// It implements List and Dequeue interfaces
	// It can contain duplicate elements
	// It maintains insertion order.
	// Fast operation for manipulation because - no shifting of elements after removal of any element
    // Internally it uses Doubly linked list 
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add(null);
		ll.addFirst("First Item");
		ll.addLast("Last Item");

		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ll.add(2,"In between");
		System.out.println(ll);
		
		ll.remove("B");
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		for(String str:ll){
			System.out.println(str);
		}
		
		//get method
		String str1 = ll.get(1);
		System.out.println(str1);
		
		// Set method
		ll.set(0, "Changed value");
		System.out.println(ll);
		
				
		LinkedList<Integer> in = new LinkedList<Integer>();
		in.add(1);
		in.add(2);
		in.add(3);
		
		for(int a:in){
			System.out.println(a);
		}
		
	

	}

}
