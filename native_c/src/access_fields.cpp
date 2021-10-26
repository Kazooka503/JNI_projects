/*
 * access_fields.cpp
 *
 *  Created on: Oct 25, 2021
 *      Author: austinkrz
 */

#include "../header/test7_TestAccessFields.h"


JNIEXPORT void JNICALL Java_test7_TestAccessFields_printName
	(JNIEnv *env, jobject TestAccessFields, jobject person){
		// goal: access "name" field in the person object
		// step 1:
		jclass person_class = env -> FindClass("test7/Person");
		// step 2: field id
		jfieldID fid = env -> GetFieldID(person_class, "name", "Ljava/lang/String;");
		jfieldID fid2 = env -> GetFieldID(person_class, "age", "I");
		// step 3: get the field
		jobject name_obj = env -> GetObjectField(person, fid);
		jint age = env -> GetIntField(person, fid2);
		// step 4: type cast
		jstring name = (jstring) name_obj;
		// step 5: print the name & age to the console
		const char* name_array = env -> GetStringUTFChars(name, 0);
		printf("%s\n", name_array);
		printf("%s's age is %d\n", name_array, age);
		// relaese the native heap memory
		env -> ReleaseStringUTFChars(name, name_array);
}

