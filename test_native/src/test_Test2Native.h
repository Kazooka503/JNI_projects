#include <jni.h>

#ifndef _Included_test_Test2Native
#define _Included_test_Test2Native
#ifdef __cplusplus
extern "C"{
#endif
JNIEXPORT jdouble JNICALL Java_test_Test2Native_sum
	(JNIEnv *, jobject, jdouble, jdouble);

#ifdef __cplusplus
}
#endif
#endif
