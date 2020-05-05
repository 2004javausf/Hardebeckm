package com.revature.threaded;

public class ExtendedThread extends Thread{

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\t\t Hi-ExtendThread");
			
		}
	}
}
