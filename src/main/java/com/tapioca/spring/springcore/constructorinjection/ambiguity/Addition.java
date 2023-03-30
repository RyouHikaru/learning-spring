package com.tapioca.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	public Addition(int a, double b) {
		System.out.println("Inside constructor");
		System.out.println("a: " + a + " b: " + b);
	}
}
