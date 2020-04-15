package com.revature.beans;
//packages are fancy folders. name space. creates folders for each new word in the package name
// java package is java.lang

/*
 * naming conventions 
 * classes and projects: Pascal casing(capitalize first letter of each word)
 * methods and variables: Camel casing (first word lower-case all subsequent first letter capitalized. firstSecondThird
 * packages: all lower-case and delimted by periods.
 * constants: all UPPER CASE
 */
public class Pork {
	/*
	 * members of a class - couple of forms
	 * instance variables - property of a specific object
	 * static variables - property of the class shared by all of its children
	 * instance methods - behavior relative to the specific object.
	 * static methods - behavior relative to the entire class.
	 * constructor - instantiates the class using the keyword "new"
	 */
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
	
}
