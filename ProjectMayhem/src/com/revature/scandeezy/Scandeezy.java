package com.revature.scandeezy;

import java.util.Scanner;

public class Scandeezy {

	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		String contents;
	
		System.out.println("What would you like to print?");
		contents = sc.nextLine(); // sc.next prints everything up to a null and sc.nextLine reads until enter is pressed
		System.out.println(contents);
		
		System.out.println("what number");
		double a = sc.nextDouble();
		System.out.println(a);
		
		System.out.println("number");
		String b = sc.nextLine();
		int c = 56 + Integer.parseInt(b);
		System.out.println(c);
	}
}
