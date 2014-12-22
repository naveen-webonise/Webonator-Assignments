package com.webonise.core;
public class HelloWorld {

	private String name;
	private HelloWorld2 helloWorld;
	public HelloWorld2 getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(HelloWorld2 helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printHello() {
		System.out.println(helloWorld.getSurname());
	}
}
