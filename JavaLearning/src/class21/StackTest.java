package class21;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
	
	// Stack is a subclass of Vector
	// Based on LIFO principal
	// 5 methods - Push, pop, empty, search and peak : Returns last element of stack

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		
		System.out.println("C is available :"+st.search("C"));
		System.out.println("ABC is availble:"+st.search("ABC"));
		
		System.out.println("Peak :"+st.peek());
		
		Iterator<String> it = st.iterator();
		
		while(it.hasNext()){
			System.out.println("Traversing in Iterator : "+it.next());
		}
		
		while(!st.isEmpty()){
			st.pop(); // Remove each element
		}
		if(st.empty()){
			System.out.println("Stack is Empty Now !!");
		}


	}

}
