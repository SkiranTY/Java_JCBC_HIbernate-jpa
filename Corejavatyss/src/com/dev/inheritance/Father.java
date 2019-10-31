package com.dev.inheritance;

public class Father extends Grandfather {

	static Father f=new Father();
	String name="Eddard";
	@Override
	public void printname() {
		
		System.out.println(name+" "+super.name+" "+f.lastname);
		super.printname();
	}
	public static void main(String[] args) {
		f.printname();
	}
}
