package test3;

public class Animal {
	
	// static initializer
	static {
		System.out.println("Inside Animal static init");
		System.loadLibrary("native_c");
	}
	
	// instance init --> a simple code block { ... }
	{
		System.out.println("Inside Animal instance init");
	}
	
	public Animal() {
		// super()
		// instance initializer
		System.out.println("Inside Animal constructor");
	} 

}
