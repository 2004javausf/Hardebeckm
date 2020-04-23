package com.revature.trycatch;

import java.util.Scanner;

public class TryMeOut {
// Try catch blocks are used to catch an error and deal with it in the code
	
	
	public static void main(String[] args) {
		
		//EXAMPLE 1
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input 2 numbers you want to divide!");
//		System.out.println("Input a positive integer");
//		int x = s.nextInt();
//		System.out.println("Input 0");
//		int y = s.nextInt();
//		
//		
//		try {
//			int z = x/y;
//			System.out.println(z);
//			System.out.println("In the try block.");
//			System.out.println(z);
//			}
//		catch(ArithmeticException ex) {
//			System.out.println("In the catch block");
//			System.out.println("You can't divide by 0!\n");
//		}
//		finally {
//			System.out.println("In the finally block\n");
//		}
//		
//		System.out.println("Outside of the try-catch");
//		System.out.println("=====================\n");
		
		
		
		//EXAMPLE 2
//		int [] t2 = new int[4];
//		
//		try {
//			int i = t2[3];
//			System.out.println("In the try block\n");
//			System.out.println(i);
//			// try block runs first
//			// if the statement puts out an error, moves onto catch block.
//		}
//		catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("In the catch block");
//			System.out.println("Out of bounds exception!");
//		}
//		finally {
//			System.out.println("In the Finally block\n");
//			
//		}
//		System.out.println("outside of the try-catch");
//		System.out.println("=====================\n");
		
//		
//		
//		//EXAMPLE 3.1
//		int [] t = new int[4];
//		
//		try {
//			int i = t[10]; // does not work because we are out of bounds
//			System.out.println("In the try block");
//			System.out.println(i);
//		}
//		catch(Exception ex){ // catch exception is generic, so it works here!
//			System.out.println("In the catch block");
//			System.out.println("Out of bounds exception!\n");
//		}
//		finally {
//			System.out.println("In the Finally block\n");
//			
//		}
//		System.out.println("Outside of the try-catch-finally block");
//		System.out.println("=====================\n");
//		
//		
//		//EXAMPLE 3.2
//		int [] t = new int[4];
//		
//		try {
//			int i = t[10]; // does not work because we are out of bounds
//			System.out.println("In the try block");
//			System.out.println(i);
//		}
//		catch(ArrayIndexOutOfBoundsException ex){ // catch exception is of the correct type so it works
//			System.out.println("In the catch block");
//			System.out.println("Out of bounds exception!\n");
//          ex.printStackTrace();
//		}
//		finally {
//			System.out.println("In the Finally block\n");
//			
//		}
//		System.out.println("Outside of the try-catch-finally block");
//		System.out.println("=====================\n");
//		
//		
////		//EXAMPLE 4
		int [] t1 = new int[4];
		
		try {
			int i = t1[10];
			System.out.println("In the try block");
			System.out.println(i);
			// try block runs first
			// if the statement puts out an error, moves onto catch block.
		}
		catch(NullPointerException ex){ // wrong type of exception, so it cannot work.
			System.out.println("In the catch block");
			System.out.println("Out of bounds exception!");
			ex.printStackTrace();
		}
		finally {
			System.out.println("In the Finally block");
		}
		System.out.println("outside of the try-catch"); // will not run because of the exception
		System.out.println("=====================\n");
		
		

		
	}

}
