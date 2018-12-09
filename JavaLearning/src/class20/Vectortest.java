package class20;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectortest {

	// Vector implements List and RandomAccess Interface
	// Internally it works on Dynamic Array
	// It is legacy class
	// Duplication of elements are allowed
	// null can be added as element
	// it is thread safe / Synchronized
	// it is slow
	// best choice of frequent reading , not good for operations contains
	// insertion or deletion in between
	// Enumeration class can also be used for traversal

	public static void main(String[] args) {

		Vector<String> vtr = new Vector<String>();
		System.out.println("Inital Size of Vector:" + vtr.capacity());
		vtr.add("A");
		vtr.add("B");
		vtr.add("C");
		vtr.add(null);
		vtr.add("A");
		vtr.addElement("X");
		vtr.add("D");
		vtr.add("E");
		vtr.add("F");
		vtr.add("G");
		vtr.add("H");

		System.out.println("Size of Vector:" + vtr.capacity());

		// traversing through Enumeration class
		Enumeration<String> e = vtr.elements();
		while (e.hasMoreElements()) {
			System.out.println("Enumeration:" + e.nextElement());

		}

		vtr.remove(2);
		vtr.remove("A");

		// traversing through iterator
		Iterator<String> it = vtr.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println("Iterator:" + str);
			if (str == "F") {
				it.remove();
				System.out.println(" F element removed");
			}
		}

		// traversing through List iterator
		ListIterator<String> lit = vtr.listIterator();

		while (lit.hasNext()) {
			String st = lit.next();
			System.out.println("List Iterator:" + st);

			if (st == "G") {
				lit.add("New Element Added");
			}
		}

		System.out.println(vtr);

	}

}
