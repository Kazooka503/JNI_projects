#include "test_TestNative.h"
#include "test_Test2Native.h"
#include <string>

JNIEXPORT jdouble JNICALL Java_test_TestNative_multiply
	(JNIEnv *env, jobject thisObject, jdouble param1, jdouble param2){
		return param1*param2;
}

JNIEXPORT jdouble JNICALL Java_test_Test2Native_sum
	(JNIEnv *env, jobject thisObject, jdouble param1, jdouble param2){
		return param1+param2;
}

JNIEXPORT jstring JNICALL Java_test_TestNative_speak
	(JNIEnv *env, jobject thisObject){
		return env -> NewStringUTF("Hello world!\nHow are you doing?");
}
