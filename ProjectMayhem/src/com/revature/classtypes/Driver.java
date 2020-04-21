package com.revature.classtypes;

import com.revature.beans.Pork;

public class Driver {

	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.breathe();
		shark.findPrey();
		shark.swim();
		Pork p = new Pork();
		p.findPrey();
		p.breathe();
	}
}
