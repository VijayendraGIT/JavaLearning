package class22;

import java.util.PriorityQueue;

public class PQStudent implements Comparable<PQStudent>{
	int rollNo;
	String name;
	
	public PQStudent(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public int compareTo(PQStudent o) {
		System.out.println("Calling Comparto");
		if(rollNo >o.rollNo){
			return 1;
		} else if (rollNo < o.rollNo){
			return -1;
		} else {
			return 0;		
		}
	}

	public static void main(String[] args) {
		
		PQStudent st1 = new PQStudent(11,"Ram");
		PQStudent st2 = new PQStudent(21,"Shyam");
		PQStudent st3 = new PQStudent(7,"Mohan");
		
		PriorityQueue<PQStudent> pq = new PriorityQueue<PQStudent>();
		pq.add(st1);
		pq.add(st2);
		pq.add(st3);
		
		for(PQStudent p:pq){
			System.out.println("RollNO:"+p.rollNo+" Name="+p.name);
		}


	}



}
