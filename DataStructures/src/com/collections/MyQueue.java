package com.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	
	// ordered list of objects related to insertion order
	
	//follows the FIFO principle
	
	//methods:
	//		poll, remove, peek, element
	
	
	//other principle is LIFO for a stack
	//stack
	public static void main(String[] args) {
		
		
		Queue<String> qOne = new PriorityQueue<>(); // doesnt follow FILO follows a priority
		Queue<Integer> qTwo = new LinkedList<>(); // insertion
		Queue<String> qThree = new ArrayDeque<>(); // can specify lifo and fifo
		
		qOne.add("Bean");
		qOne.add("Sauce");
		qOne.add("Onions");
		
		System.out.println(qOne); // does not preserve order
		System.out.println(qOne.poll()); // shows you head and removes the head off of the queue
		System.out.println(qOne);
		System.out.println(qOne.remove()); // shows you head and removes head off queue, throws exception at an empty list
		System.out.println(qOne);
		System.out.println(qOne.peek()); // poll but no remove
		System.out.println(qOne);
		System.out.println(qOne.element()); // peek but throws exception at empty list
		System.out.println(qOne);
		
		qTwo.add(1);
		qTwo.add(-1);
		qTwo.add(100);
		System.out.println(qTwo);
		System.out.println(qTwo.poll());
		System.out.println(qTwo);
		System.out.println(qTwo.poll());
		System.out.println(qTwo);
		
		for(int i:qTwo) {
			System.out.println(i);
		}
	}
}
