package com.dev.abstraction;

public class E implements Abs{

	@Override
	public void display() {
		System.out.println("this is display method of interface");
	}

	public static void main(String[] args) {
		Abs.print();
		E e=new E();
		e.display();
	}
}
