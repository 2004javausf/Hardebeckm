package com.revature.strings;

public class Stringdeezy {
	/* string
	 * not char or character.. duh?
	 * java.lang.String
	 * String literal is 0 to many characters
	 * concatenate Strings with + or .concat(.)(.)
	 * "goodbye" + "earth"
	 * immutable
	 * string pool - collection of unique string literals in heap memory <- memory set aside by java for running
	 * stack memory for variables n stuff
	 * String API has utility methods
	 */
	

	public static void main(String[] args) {
		
		String a = "A"; // creates a new reference in the string pool
		System.out.println(a.hashCode());
		a = a.concat("b"); // immutable means this creates new reference
		System.out.println(a.hashCode());
		System.out.println(a);
		String b = "A";
		System.out.println(b.hashCode());
		System.out.println(a.charAt(1));
		
		/* String - immutable and has string pool (sync), fast
		 * StringBuilder - mutable, fast
		 * StringBuffer - mutable, thread safe slow
		 */
		StringBuilder sb = new StringBuilder("bob");
		System.out.println(sb);
		StringBuffer t = new StringBuffer("bobby");
		System.out.println(t);
		// paired program mentor with student for practice
	}

}
