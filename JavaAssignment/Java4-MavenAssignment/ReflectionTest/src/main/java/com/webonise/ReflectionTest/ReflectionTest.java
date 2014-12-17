package com.webonise.ReflectionTest;

import java.lang.reflect.*;
public class ReflectionTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> className = Class.forName("test");
		System.out.println("Class name is "+className);
		Method[] method = className.getDeclaredMethods();
		System.out.println("Methods are");
		for(Method methods:method){
			System.out.println(methods);
		}
		
	}

}
class test{
	public void printer(){
		
	}
}