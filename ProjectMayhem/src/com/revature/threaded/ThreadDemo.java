package com.revature.threaded;

public class ThreadDemo {
/*	2 ways to spin up a thread
 * 1. extend thread class
 * 2. implement runnable
 * 
 */
	public static void main(String[] args) {
		//Thread state-new
		Thread extendThread = new ExtendedThread();
		Thread implementThread = new Thread(new ImplementRunnable());
		
		implementThread.setPriority(10);
		//Thread state-start
		extendThread.start();
		implementThread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Hey-Driver");
			
		}
	}
}
