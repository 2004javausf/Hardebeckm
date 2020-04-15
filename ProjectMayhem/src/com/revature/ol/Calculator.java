package com.revature.ol;

public class Calculator {
	
	public static void main(String[] args) {
		add(add(1,2),6);
		add(3.1,2.6);
		add(1,2,3);
	}
	// parametric polymorphism
	static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	static double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
	static int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
}
