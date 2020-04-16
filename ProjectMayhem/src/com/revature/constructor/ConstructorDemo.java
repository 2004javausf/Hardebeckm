package com.revature.constructor;

public class ConstructorDemo extends D{
	/* constructors
	 * how we instantiate an object
	 * no return type but does return the object that it created
	 */
		public static void main(String[] args) {
			C c = new C();
		}

}

class A{
	{System.out.println("A instance code block");}
	A(){
		System.out.println("A constructor");
	}
}

class B extends A{
	static {System.out.println("B static block");}

	B(){
		System.out.println("B constructor");
	}
}

class C extends B{
	static {System.out.println("C static block");}
	C(){
		System.out.println("C constructor");
	}
}

class D{
	static {System.out.println("D static block");}
	D(){
		System.out.println("D constructor");
	}
}