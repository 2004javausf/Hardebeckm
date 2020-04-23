package com.revature.generics;

public class NextGen {

	
	public static void main(String[] args) {
		Gen1<Integer> i;
		i = new Gen1<Integer>(88);
		i.showType(); // this will print out fully qualified class name
		int v = i.getOb();
		System.out.println(v);
		
		Gen1<String> s = new Gen1<String>("Generics Test!");
			s.showType();
			String str = s.getOb();
			System.out.println("value: "+str);
		}
	}
	

