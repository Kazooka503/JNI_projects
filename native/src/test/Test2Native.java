package test;

public class Test2Native {
	
	static {
		System.loadLibrary("test_native");
	}
	
	public native double sum(double a, double b);
	

	public static void main(String[] args) {
		Test2Native test = new Test2Native();
		double result = test.sum(1.1, 2.2);
		System.out.println(result);

	}

}
