package com.revature.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fib {

	public static void main(String[] args) {
		itFib(12);
		int x = recFib(3);
		System.out.println(x);
	}
	
	public static void itFib(int i) {
//		List<Integer> a = new ArrayList<Integer>();	
//		a.add(0);
//		a.add(1);
		int[] array = new int[i];
		int current = 1;
		int p = 0;
		int pp = 0;
		for (int j = 0; j<i;j++) {
			pp = p;
			p = current;
			current = p+pp;
			array[j] = current;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static int recFib(int i) {
			if(i==0) {
				return 1;
			}else if(i == 1) {
				return 1;
			}else if(i<0) {
				return 0;
			}
			return recFib(i-1)+recFib(i-2);
		
	}
}
