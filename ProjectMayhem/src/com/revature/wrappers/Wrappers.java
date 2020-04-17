package com.revature.wrappers;

public class Wrappers {
	/*
	 * character - char
	 * boolean - boolean
	 * byte - byte
	 * short - short
	 * integer - int
	 * long - long
	 * float - float
	 * double - double
	 * 
	 * ^^^^^ are class representation of primitive types 
	 * wrapper classes require no constructors
	 */
	static Integer z;
	static int myInt = 3;
	static Integer myInteger = 5; // <- this is trash for this code specifically
	static Double myDub = 3.9;
	
	/*autoboxing - implicit conversion from primitive type to wrapper class.
	 * auto unboxing - implicit conversion from wrapper to primitive type.
	 * both boxing and unboxing are expensive processes.
	 * 
	 */
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static Integer mult(Integer a, Integer b) {
		return z = a*b;
	}
	
	public static void main(String[] args) {
	System.out.println(add(myInt,myInteger));
	System.out.println(add(myInt,myDub.intValue()));
	System.out.println(mult(myInt,myInteger));
	System.out.println(z);
}
}
