package com.dev.inheritance;

public class Grandfather {
	static Grandfather g=new Grandfather();

	String lastname="Stark";
	String name="Torren";


	public static void main(String[] args) {
		g.printname();
	}
	public void printname() {
	
		System.out.println(name+" "+g.lastname);
	}
}
