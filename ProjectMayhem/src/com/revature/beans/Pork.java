package com.revature.beans;
//packages are fancy folders. name space. creates folders for each new word in the package name
// java package is java.lang

import java.io.Serializable;

import com.revature.classtypes.Animal;
import com.revature.classtypes.Hunt;

/*
 * naming conventions 
 * classes and projects: Pascal casing(capitalize first letter of each word)
 * methods and variables: Camel casing (first word lower-case all subsequent first letter capitalized. firstSecondThird
 * packages: all lower-case and delimted by periods.
 * constants: all UPPER CASE
 */
public class Pork extends Animal implements Hunt,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3086601403732015176L; // add the generated serialversion

	/*
	 * members of a class - couple of forms
	 * instance variables - property of a specific object
	 * static variables - property of the class shared by all of its children
	 * instance methods - behavior relative to the specific object.
	 * static methods - behavior relative to the entire class.
	 * constructor - instantiates the class using the keyword "new"
	 * 
	 * code block - things in the curly braces{}  two types (instance and static)
	 */
	
		// instance code block
	{System.out.println("instance block");}
	
		//static code bloc
	static {System.out.println("static block");}
	
	
	// no args constructor
	public Pork() {
		System.out.println("traasshh");
	}
	
	//constructor with fields
	public Pork(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight; //weight is method scope and this.weight is instance scope
		System.out.print("yer ");
	}
	private String name;
	private int age;
	private int weight;
	
	// ALT+SHIFT+S CAN GENERATE GETTERS AND SETTERS FOR YOU
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Pork [name = " + name + ", age = " + age + ", weight = " + weight + " lbs]";
	}

	@Override
	public void findPrey() {
	System.out.println("I don't hunt?");
		
	}

	@Override
	public void breathe() {
		System.out.println("I breathe, yes.");
		
	}
	
}
