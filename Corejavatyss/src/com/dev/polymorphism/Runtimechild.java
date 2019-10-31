package com.dev.polymorphism;

public class Runtimechild extends Runtimepolymorphism{

	@Override
	public void add() {
		int d=a-b;
		System.out.println("this is override fun changed sum to difference:"+d);
	}
	
	public static void main(String[] args) {
		Runtimechild rc=new Runtimechild();
		rc.add();

	}
}
