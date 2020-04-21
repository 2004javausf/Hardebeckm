package com.revature.classtypes;

public class Shark extends Fish implements Hunt{

	@Override
	public void swim() {
		System.out.println("I'm swimming underwater");
	}

	@Override
	public void breathe() {
		System.out.println("I'm... breathing underwater");
	}

	@Override
	public void findPrey() {
		System.out.println("I hunt while breathing and swimming underwater");
		
	}

}
