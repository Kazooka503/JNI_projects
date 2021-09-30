package test2;

public class Overload1 {
	
	public native double func(double x); // __D
	public native double[] func(double[] x);  // __[D --> ___3D
	public native double func(double[] x, String text); // __[DLjava/lang/String; --> _3DLjava_lang_String_2
	
	public native void func(Overload1 obj, Overload1 obj2); // __Ltest/Overload1; --> __Ltest_Overload1_2
	//__Ltest2/Overload1;Ltest2/Overload1; --> __Ltest2_Overload1_2Ltest2_Overload1_2
}
