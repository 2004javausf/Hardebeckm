package com.revature.generics;
/* Generics
 * using a type as a parameter
 * write code that can handle different types of objects
 * use angle brackets <> to denote that something is a generic
 * allows us to ensure type safety
 * adds stability and reuseability 
 * placeholder (T,E,?,etc.) - use instead of an explicit type
 */
public class Gen1<T> {
	//declare an object of type T
	T ob;
	// pass the constructor a reference to an object of type T
	Gen1(T o){
		ob = o;
	}
	// return on
	T getOb() {
		return ob;
	}
	//show type of T
	void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}
}
