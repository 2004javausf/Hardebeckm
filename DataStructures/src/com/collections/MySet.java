package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.random.RandomObject;

public class MySet {

	//Collection Framework
	//List, Set, Queue
	
	//Why?
	// Array object is limited. it is immutable and you dont get many methods to work with.
	
	/*
	 * called a framework(more library), provides interfaces and classes that allow devs to manage collections easier
	 * 
	 * Advantages: 
	 * 		reduces effort(provides data structure and algorithms for you)
	 * 		increases performance
	 * 		encourages software reuse
	 * 
	 * BUT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * 	only accepts objects meaning we need to convert all prim to wrapper
	 */
	
	/*Set
	 * set - a basis set 	
	 * does not in general guarantee insertion order
	 * sets are equal if they contain the same elements
	 * 
	 * HashSet:
	 * 	maintains no order, stores in hash table, and has best performance
	 * LinkedHashSet:
	 * 	maintains insertion order, stores in hash table, weaker performance
	 * 
	 * TreeSet:
	 * 	maintains value order, stored in red flag tree, very slow performance
	 */
	public static void main(String[] args) {
		
		
		Set<String> mySet = new HashSet<String>();
		mySet.add("Wuddup");
		mySet.add("Homie");
		System.out.println(mySet.add(""));
		System.out.println(mySet.add("")); // will print out false because duplicates
		System.out.println(mySet);
		
		Set<String> mySetTwo = new HashSet<>();
		mySetTwo.add("spicey");
		mySetTwo.addAll(mySet); //add all adds onto whats already in the set
		System.out.println(mySetTwo);
		mySetTwo = mySet; //overrides all values in the set also by reference, so other sets will change because they point to same location
		mySet.add("not spicey");
		System.out.println(mySetTwo);
		
		
		Set<RandomObject> randomSet = new HashSet<>();
		RandomObject rand1 = new RandomObject("Cat Woman");
		RandomObject rand2 = new RandomObject("Chad");
		
		randomSet.add(rand1);
		randomSet.add(rand2);
		System.out.println(randomSet);
		
		
		//TreeSet:
		
		Set<Integer> myTree = new TreeSet<>();
		myTree.add(1);
		myTree.add(3);
		myTree.add(2);
		myTree.add(1);
		System.out.println(myTree);
		
		Set<Object> finalSet = new HashSet<>(); // ALLOWS FOR DIFFERENT DATA TYPES(cuz they all are being cast up to objects
		finalSet.add(42);
		finalSet.add("forty-two");
		System.out.println(finalSet);
		
		Set<Integer> lonkSet = new LinkedHashSet<>(); // preserves order
		
		lonkSet.add(72);
		lonkSet.add(2);
		lonkSet.add(33);
		System.out.println(lonkSet);
	}
}
