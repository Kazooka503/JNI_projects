package test3;

public class Mammal extends Animal {
	
	// static initializer
	static {
		System.out.println("Inside Mammal static init");
	}
	
	// instance init --> a simple code block { ... }
	{
		System.out.println("Inside Mammal instance init");
	}
	
	public static int ID = 1;
	
	public static void func() {
		System.out.println("Inside Mammal static method");
		
	}
	
	public Mammal() {
		// super() --> constructor call to super class Animal()
		// instance initializer for mammal 
		System.out.println("Inside Mammal constructor");
	}

}
