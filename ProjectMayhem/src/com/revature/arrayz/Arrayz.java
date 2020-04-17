package com.revature.arrayz;

import java.util.Arrays;

public class Arrayz {
	//group of like-typed variables that are referred to by a common name
	public static void main(String[] args) {
		int [] myArray = new int[6]; // can change values of array but not size
		int [] chaos = {1,3,2,4,6,5};
		
		
		for (int i = 0;i<myArray.length;i++) {
			myArray[i] = i*10;
			System.out.println(chaos[i]);
		}
		for (int i:myArray) {
			System.out.println(i);
		}
		Arrays.sort(chaos);
		
		System.out.println(Arrays.toString(chaos));
		
	}
}
