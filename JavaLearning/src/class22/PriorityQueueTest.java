package class22;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	//Inherits Abstract Queue
	//Elements are ordered according to 
	// 1. Natural ordering
	// 2. Comparator provided at queue construction time
	// insertion of Null objects not allowed.
	// poll - removes head of queue
	// remove - removes head of queue
	// peek - retirves the value of head, but does not edit it.(Read only)
	// Can't create priority queue of objects (Generic) because it can't compare two different types of objects

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("A");
		pq.add("D");
		pq.add("C");
		pq.add("U");
		pq.add("E");
		
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		
		Iterator<String> it = pq.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(1);
		pq1.add("ABC");
		
		System.out.println(pq1);

	}

}
