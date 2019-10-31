package com.dev.methods;

public class Methodoverloading {

	static Methodoverloading mo=new Methodoverloading();

	public void print() {
		System.out.println("this is print method with no-arg");
	}
	
	private void print(int a) {
		System.out.println("this is print method with no-arg");
	}

	public int print(float i) {
		System.out.println("this is print method with int arg");
		return 1;
	}
	
	public String print(String str) {
		System.out.println("this s print  method with Strinf arr");
		return "s";
	}


	public static void main(String[] args) {
		mo.print(4);

	}

}
