package com.dpsys.jvm_arch;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		
	Class<?> c=	Class.forName("Student");
	
	Method[] declaredMethods = c.getDeclaredMethods();
	
	for (Method method : declaredMethods) {
		System.out.println(method);
		
	}
		
	Field[] declaredFields = c.getDeclaredFields();
	
	for (Field field : declaredFields) {
		System.out.println(field);
	} 
	
	ClassLoader classLoader = c.getClassLoader();
	Package[] definedPackages = classLoader.getDefinedPackages();
	
	for (Package package1 : definedPackages) {
		System.out.println(package1.getName());
	}
		
	}
}
