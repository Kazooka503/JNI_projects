package test7;

import java.lang.reflect.Field;

public class TestAccessFields { 
	
	static {
		System.loadLibrary("native_c");
	}
	
	public native void printName(Person person);
	
	public static void test1() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// practice reflection API
		Person person = new Person("Bob");
		
		// class identifier
		Class<?> clazz = person.getClass();
		// field identifier
		Field f1 = clazz.getDeclaredField("name");
		System.out.println(f1);
		// get the value of the field
		Object nameObj = f1.get(person);
		System.out.println(nameObj);
	}
	
	public static void test2() {
		Person person = new Person("Bob");
		
		TestAccessFields test = new TestAccessFields();
		test.printName(person);
		
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//test1();
		test2();
		
	}

}
