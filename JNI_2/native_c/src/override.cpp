#include "../header/TestOverrideSuperClass.h"
#include "../header/TestOverrideSubClass.h"

JNIEXPORT jdouble JNICALL Java_TestOverrideSuperClass_func
  (JNIEnv *env, jobject TestOverrideSuperClass, jdouble x){
	printf("inside super class\n");
	return x;

}

JNIEXPORT jdouble JNICALL Java_TestOverrideSubClass_func
	(JNIEnv *env, jobject TestOverrideSubClass, jdouble x){
	  printf("inside sub class\n");
	  return 2.0*x;
}
