package com.dev.constructer;

public class ConstructersExamp {
	
	public ConstructersExamp() {
		System.out.println("this s no-arg constr");
	}

	public  ConstructersExamp(int i) {
		System.out.println("this const is with int arg");
	}
	
	public  ConstructersExamp(String str) {
		System.out.println("this const is with String");
	}
	
	public  ConstructersExamp(int i,String s) {
		System.out.println("this const is with int and String arg");
	}
	
	public static void main(String[] args) {
		ConstructersExamp pc=new ConstructersExamp(1);
		ConstructersExamp nc=new ConstructersExamp();
		ConstructersExamp sc=new ConstructersExamp("A");
		ConstructersExamp isc=new ConstructersExamp(1,"B");
	}

}
