package test;

import java.io.IOException;

import utils.NativeUtils;

public class TestNative {
	
	static {
		//System.loadLibrary("test_native");
		try {
			NativeUtils.loadLibraryFromJar("/libtest_native.so");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	double parameter ;
	
	public TestNative(double param) {
		parameter = param;
	}
	
	public native double multiply(double a, double b);
	public native String speak();
	
	public static void main(String[] args) {
		TestNative test1 = new TestNative(1.2);
		double result = test1.multiply(1.1, 2.2);
		System.out.println(result);
		System.out.println(test1.speak());
	}

}
