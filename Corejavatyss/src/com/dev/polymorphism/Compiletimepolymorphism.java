package com.dev.polymorphism;

public class Compiletimepolymorphism {

	public void printname() {
		System.out.println("this fun is with no-arg");
	}

	public void printname(int a) {
		System.out.println("this fun is with int arg");
	}

	public void printname(int a, String str) {
		System.out.println("this fun is with int and String arg");

	}

	public void printname(String str,int a,double b) {
		System.out.println("this fun is with 3 args");
	}


	public static void main(String[] args) {
		Compiletimepolymorphism cm=new Compiletimepolymorphism();
		cm.printname("a",6,3.2);
		cm.printname(7);
	}

}
