package com.revature.design;

public class Singleton {
	/* Singleton Design Pattern
	 * ensure a class has only one instance and provides global access
	 * 
	 */
	
	//private static instance of itself
	private static Singleton instance;
	
	// private constructor
	private Singleton(){
		//logic
		}
	
	//Static method to get the unique instance- if does not exist, then we create it
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doSomething(){
		//logic - what the object should do
	}
}
