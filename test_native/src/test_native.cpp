#include "test_TestNative.h"
#include "test_Test2Native.h"

jdouble JNICALL Java_test_TestNative_multiply
	(JNIEnv *env, jobject thisObject, jdouble param1, jdouble param2){
		return param1*param2;
}

jdouble JNICALL Java_test_Test2Native_sum
	(JNIEnv *env, jobject thisObject, jdouble param1, jdouble param2){
		return param1+param2;
}
