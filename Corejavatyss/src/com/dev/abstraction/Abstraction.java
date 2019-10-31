package com.dev.abstraction;

public  class Abstraction extends AbstractExample {

	public Abstraction() {
		System.out.println("this is constr of Abstraction class");
	}
	
	@Override
	void display() {
          System.out.println("this is the implemented abstract method");
	}
	
	@Override
	void print() {
		System.out.println("2 nd method of abstract class");
	}
	

	public static void main(String[] args) {
	
		Abstraction ae=new Abstraction();
		ae.display();
		ae.show();
		ae.print();
	}
}