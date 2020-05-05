package com.revature.design;

public class Driver {
	private static HondaFactory hf = new HondaFactory();
	public static void main(String[] args) {
		Car c1 = hf.makeCar("CIVIC", "red");
		Car c2 = hf.makeCar("Crv", "black");
		Car c3 = hf.makeCar("Tesla", "black");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
