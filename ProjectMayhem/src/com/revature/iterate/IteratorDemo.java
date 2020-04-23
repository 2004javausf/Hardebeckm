package com.revature.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	/*iterator
	 * anything that can be used as the subject of a for each loop uses an iterator
	 * implement iterable interface
	 * every collection has an interator that allows traversal between elements and
	 */
	public static void main(String[] args) {
		//create ArrayList
		List<String> a1 = new ArrayList<String>();
		
		a1.add("C");
		a1.add("A");
		a1.add("D");
		a1.add("G");
		a1.add("F");
		a1.add("E");
		a1.add("B");
		// use iterator to display contents of a1
		System.out.println("Original contents of a1:");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		//Modify objects being iterated
		ListIterator<String> litr = a1.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element+"+");
		}
		
		itr = a1.iterator();
		System.out.println("\nModfied Contents of a1:");
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		//Display list backwards
		System.out.println("\nModified List Backwards:");
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
	}

}
