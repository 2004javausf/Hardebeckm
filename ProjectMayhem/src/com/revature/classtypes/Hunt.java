package com.revature.classtypes;
/*special type of class that cant be instantiated
 * specify what a class must do, but now how it does it
 * lack instance variables
 * characterized by behavior
 * can mimic multiple inheritance w/ interfaces
 * classes can implement interfaces as many as you want
 * interfaces extend other interfaces
 * all variables for interfaces are public,static,final(only in java8 not newer versions)
 */
public interface Hunt {
	void findPrey();
}
