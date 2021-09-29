#include <jni.h>

#ifndef _Included_test_TestNative
#define _Included_test_TestNative
#ifdef __cplusplus
extern "C"{
#endif

JNIEXPORT jdouble JNICALL Java_test_TestNative_multiply
	(JNIEnv *, jobject, jdouble, jdouble);

JNIEXPORT jstring JNICALL Java_test_TestNative_speak
	(JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
