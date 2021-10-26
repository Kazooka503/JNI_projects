package test4;

public class TestTypes {
	
	public native boolean func1(boolean param);
	// Java_test4_TestTypes_func1__Z
	
	public native boolean func1(boolean param, double x);
	// Java_test4_TestTypes_func1__ZD
	// return type: jboolean
	// parameter signature: jboolean
	
	public native void func2();
	public native void func2(short param);
	// Java_test4_TestTypes_func2
	
	public native void func3(long param);
	// Java_test4_TestTypes_func2__S 
	
	public native void func3(long param, double x);
	// Java_test4_TestTypes_func3__JD
	
	public native void func4(char c, Double param); // jchar, jobject 
	// Java_test4_TestTypes_func4_CLjava_lang_Double_2
	
	public native void func4(Double param);
	// Java_test4_TestTypes_func4_Ljava_lang_Double_2

}
