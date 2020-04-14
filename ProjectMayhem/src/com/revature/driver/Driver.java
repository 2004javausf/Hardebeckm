package com.revature.driver;

import com.revature.beans.Pork;
//IMPORT SHORTCUT CTL+SHIFT+O
public class Driver {
	//single
	/*multi line
	 * comment
	 */
	/*
	 * why java?
	 * "WORA" principle (write once run anywhere)
	 * OOP
	 * widespread use
	 * good documentation
	 * Oracle
	 * Sun Microsystems used to own it
	 * version 1.8 used primarily "Java 8"
	 * 
	 * 3 acronyms JDK, JRE, JVM
	 * JVM - Java Virtual Machine
	 * 		 purpose: converts compiled java code into machine code that processor can read
	 * 		 		  provides portability
	 * JRE - Java Runtime Environment
	 * 		 purpose: JVM + Libraries
	 * 				  everything needed to RUN java
	 * JDK - Java Development Kit
	 * 		 purpose: contains JVM + JRE
	 * 				  compiler, etc...
	 * 				  everything needed to WRITE java
	 * 
	 * Object Oriented Programming
	 * unit of programmability is the object.
	 * objects have states and behaviors.
	 * states - aka fields, attributes, variables, etc.
	 * behaviors - methods
	 * classes - blueprint or template of an object
	 */
	public static void main(String[] args) {
		/* public - access modifier that allows method to be called from anywhere
		 * static - do not need to instantiate to use.
		 * void - does not return anything
		 * String[] args - parameter(s) used for this method
		 */
		System.out.println("trash kid");
		Pork p = new Pork();
		p.setName("Waddles");
		p.setAge(100000);
		p.setWeight(30);
		System.out.println(p);
		System.out.println(p.getName());
	}
}
