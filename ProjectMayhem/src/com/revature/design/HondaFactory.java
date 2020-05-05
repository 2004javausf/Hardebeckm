package com.revature.design;
//Factories create an object without exposing creation logic to client
public class HondaFactory {
	/*
	 * use a "factory" method to return a car model based on what is given
	 * if the method is given a parameter of something besides crc or civic, it return null
	 */
	public Car makeCar(String whatCar, String color) {
		if("civic".equalsIgnoreCase(whatCar)) {
			return new Car("Honda", 2020, "Civic", color);
		}else if("crv".equalsIgnoreCase(whatCar)) {
			return new Car("Honda",2020,"CRV",color);
		}
		return null;
	}

}
