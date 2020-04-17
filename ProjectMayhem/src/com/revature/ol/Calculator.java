package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		b = 3.9;
		a = (int)b; //truncates down, will not round up
		Double d = 3.6;
		Integer e = 4;
		System.out.println(a+b);
		add(add(1,2),6);
		add(3.1,2.6);
		add(1,2,3);
		add(1,3,2,6,8,1,2,9,4);
		add(d,e);
		add(d.intValue(), (int)5.3,4);
	}
	// parametric polymorphism
	static int add(int a, int b) {
		System.out.print("1 ");
		System.out.println(a+b);
		return a+b;
	}
	static double add(double a, double b) {
		System.out.print("2 ");
		System.out.println(a+b);
		return a+b;
	}
	static int add(int a, int b, int c) {
		System.out.print("3 ");
		System.out.println(a+b+c);
		return a+b+c;
	}
	static int add(int ...a) {
		int tot = 0;
		for(int i:a) {
			tot = tot+i;
		}
		System.out.print("4 ");
		System.out.println(tot);
		return tot;
	}
}
