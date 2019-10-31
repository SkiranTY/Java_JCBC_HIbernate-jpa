package com.dev.polymorphism;

public class Runtimepolymorphism {

	int a=10,b=20;
	public void add() {
		int c=a+b;
		System.out.println("sum is:"+c);
	}

	public static void main(String[] args) {
		Runtimepolymorphism rn=new Runtimepolymorphism();
		rn.add();

	}

}
