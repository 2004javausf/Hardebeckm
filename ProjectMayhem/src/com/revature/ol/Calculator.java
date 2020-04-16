package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		b = 3.9;
		a = (int)b; //truncates down, will not round up
		System.out.println(a+b);
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
