#include "../header/TestOverloading.h"

/*
 * Class:     TestOverloading
 * Method:    func
 * Signature: (D)D
 */
JNIEXPORT jdouble JNICALL Java_TestOverloading_func__D
  (JNIEnv *env, jobject TestOverloading, jdouble x){
	return x;
}

/*
 * Class:     TestOverloading
 * Method:    func
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_TestOverloading_func__DD
  (JNIEnv *env, jobject TestOverloading, jdouble x, jdouble y){
	return x;
}

/*
 * Class:     TestOverloading
 * Method:    func
 * Signature: (DLjava/lang/String;)D
 */
JNIEXPORT jdouble JNICALL Java_TestOverloading_func__DLjava_lang_String_2
  (JNIEnv *env, jobject TestOverloading, jdouble x, jstring text){
	return x;
}
