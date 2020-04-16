package com.revature.control;

public class LoopyLoops {
/* If
 * for decision making
 * providing multiple paths of execution
 * 
 * switch case
 * provides multiple paths of execution based on a value
 * the switch is based on an integer, numeric, a string, a char, a boolean, or enum. enum = set list of constant values held in a class
 */
	static String color;
	public static void whatColor(String color){
		switch(color) {
		case "red":
			System.out.println("color is red");
			break;
		case "green":
			System.out.println("color is green");
			break;
		case "purple":
			System.out.println("color is purple");
			break;
		default: 
			System.out.println("you suck");
		}
	}
	
	/*For Loops
	 * for(a;b;c){do something}
	 * a is variable dec
	 * b is boolean
	 * c is incrementor
	 */
	
	public static void forLoop(int x) {
		for(int i = 0; i>=x; i--) {
			if (x>0) {
				break;
			}
			System.out.println(i);
		}
	}
	
	/*enhanced for loop aka for each
	 * for(x:<array/collection){}
	 * good for moving through collections
	 * more cpu efficient
	 * no issues w/ index out of bounds
	 * good for access elements in one collection
	 * bad for adding and removing
	 */
	static int [] myArray = {1,2,3,4000,5,6,7,8,9,10};
	public static void forEach(int [] a) {
		for(int t:a) {
			System.out.println(t);
		}
	}
	
	/*While loops
	 * while(){}
	 * do while
	 * dowhile(){}
	 */
	
	public static void whiley(int i) {
		while(i++<10) {
			System.out.println("poop");
		}
	}
	
	public static void dowhiley(int i) {
		do{
			System.out.println("stand");
		
		}
		while(i++<10); 
	}
	
	public static void main(String[] args) {
		whatColor("red");
		forLoop(-10);
		forEach(myArray);
		whiley(9);
		dowhiley(11);
	}
}

/* conditional
 * < > <= >= != ==
 * OR a|b bit wise a||b short circuit or if a is true, return without b
 * AND a&b bit wise a&&b checks both and evaluates true if all true
 * equals == compares values of primitives, compares there memory location not the contents
 * != checks not equal
 * .equals() looks at content
*/