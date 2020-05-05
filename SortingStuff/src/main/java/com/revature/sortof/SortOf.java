package com.revature.sortof;

import java.util.Arrays;

public class SortOf {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(setUpMess()));
		bubbleSort(setUpMess());
	}
	
	
	public static int[] setUpMess() {
		int[] array = new int[20];
		for (int i = array.length-1; i >= 0; i--) {
			array[i] = array.length-i;
		}
		return array;
	}
	
	public static int[] bubbleSort(int[] a) {
		int c = 1;
		int temp = 0;
		int passes = 1;
		for (int i = 0; i < a.length-1; i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				c++;
			if(a[j]>a[j+1]) {
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				System.out.println(Arrays.toString(a));
				}
			}
			passes++;
		}
		System.out.println("c" + c);
		System.out.println("p" + passes);
		
		return a;
	}
}
