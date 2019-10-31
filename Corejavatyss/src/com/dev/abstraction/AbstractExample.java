package com.dev.abstraction;

public abstract class AbstractExample {
	
	public AbstractExample() {                         //Constructor
		System.out.println("this is method of abstract class");
	}
	
	abstract void display();
	abstract void print();
	
	public void show() {
		System.out.println("concrete method of abstract class");
	}

	public static void main(String[] args) {


	}

}
