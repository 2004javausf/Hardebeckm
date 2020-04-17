package com.revature.varargs;

import java.util.Arrays;

public class VarArgss {
	/*
	 * variable length arguments
	 * method that will take a variable number of arguments
	 * automates and hides the process of creating and saving the values into an array prior to invoking the method
	 * vararg must be the last argument
	 * can be of any type(anything in vararg must be same type)
	 */
	
	public static void Test(int ... v) {
		System.out.print("Number of args is: " + v.length + " Contents: " );
		for(int x:v) {
			System.out.print(x+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Test(10);
		System.out.println();
		Test(1,4,6,7,223457,38,23,4263,763);
		System.out.println();
		Test();
	}

}
