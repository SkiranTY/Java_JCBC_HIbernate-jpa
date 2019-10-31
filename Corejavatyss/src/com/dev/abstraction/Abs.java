package com.dev.abstraction;

@FunctionalInterface
public interface Abs {
	
	void display();
//	void show();
	
	public static void print() {
		System.out.println("this is interface class");
	}
	
	public static void print1() {
		System.out.println("this is interface class");
	}
}
