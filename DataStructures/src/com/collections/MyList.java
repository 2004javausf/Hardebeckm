package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {
	
	//List
	//	A list is indexed
	//	Allows duplicates
	//	An ordered sequence
	public static void main(String[] args) {
		
		List<String> firstList = new ArrayList<>();
		firstList.add("poopy butt-hole");
		firstList.add("i like turtles");
		firstList.add("order");
		System.out.println(firstList);
		System.out.println(firstList.get(2));
		firstList.set(1, "bowl of gravy");
		System.out.println(firstList);
		
		List<String> listTwo = new LinkedList<>();
		listTwo.add("yes");
		listTwo.addAll(firstList);
		System.out.println(listTwo);
		listTwo.remove(1);
		System.out.println(listTwo);
		System.out.println(firstList.subList(1, 2));
		//Linked list is only good, if you're adding and removing a lot of elements.
		//Array List
		
		/*Access via index(positional access):interact with elements based on position in arraylist
		 * 										get, set, add, addAll, and remove
		 * 
		 */
		listTwo.get(2);
		listTwo.set(2, "bob");
		listTwo.add("bobby");
		listTwo.remove(3);
		
		/*
		 * Search: find a specified object in the list and return its position:
		 *  indexOf();
		 *  lastIndexOf();
		 */
		
		System.out.println(listTwo.indexOf("bob"));
		System.out.println(listTwo.indexOf("da"));// will return a -1 to indicate its not in the list
		
		/*
		 * Range view methods:
		 * 			sublist() [a,b) where a and b are indicies
		 */
		System.out.println(listTwo.subList(0, listTwo.size()));
	}
}
