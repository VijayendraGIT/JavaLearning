package class21;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeTest {
	
	// Implements Dequeue interface
	// Can add or remove elements from both ends
	// NULL objects are not allowed 
	// Not thread safe
	// No capacity restrictions
	// Faster than Linked list and stack

	public static void main(String[] args) {

		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("A");
		ad.add("B");
		ad.add("C");
		ad.add("D");
		//Offer : It is similar to add
		ad.offer("E");
		ad.addFirst("FIRST");
		ad.addLast("LAST");
		
		Iterator<String> it = ad.iterator();
		while(it.hasNext()){
			System.out.println("Iterator :"+it.next());
		}
		
		//Descending iterator
		Iterator<String> dit = ad.descendingIterator();
		while(dit.hasNext()){
			System.out.println("Descending iterator :"+dit.next());
		}
		
		ad.remove();
		System.out.println(ad);
		ad.remove(3); // removal not possible from middle of queue
		System.out.println(ad);
		ad.poll();  // Poll - removes the head of deque
		System.out.println(ad);
		// Peek is read only operation and gives value of Head of deque
		System.out.println("Peek "+ad.peek());
		ad.remove("LAST");
		System.out.println(ad);

	}

}
