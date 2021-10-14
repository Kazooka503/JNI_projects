package test6;

public class TestString {
	
	static {
		System.loadLibrary("native_c");
	}
	
	// case 1: creating java string in c++ and returning to java --> return "Hello World!!"
	public native String sayHello();
	
	// case 2: pass a java string to C++ and do something with it
	public native void println(String text);
	
	// case 3: concatenate two java strings and return the result back to java
	public native String concat(String str1, String str2);

	public static void main(String[] args) {
		TestString test = new TestString();
		String str = test.sayHello();
		System.out.println(str);
		test.println(str);
		System.out.println(test.concat("hello", "world!!"));
		// IO streams of java have precedence on IO streams of C++ in JNI
	}

}
