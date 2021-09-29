package test;

public class TestNative {
	
	static {
		System.loadLibrary("test_native");
	}
	
	public native double multiply(double a, double b);
	
	public static void main(String[] args) {
		TestNative test1 = new TestNative();
		double result = test1.multiply(1.1, 2.2);
		System.out.println(result);
	}

}
