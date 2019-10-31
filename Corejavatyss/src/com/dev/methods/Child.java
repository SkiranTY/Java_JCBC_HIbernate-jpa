package com.dev.methods;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c=new Child();
		c.sum();
	
	}
	
	@Override
	public  int sum() {           // private, final and static  method cannot be overridden 
		int a=10,b=20;
		int c=b-a;
		System.out.println("this s differ in subclass="+c);
		return c;
	}
}
