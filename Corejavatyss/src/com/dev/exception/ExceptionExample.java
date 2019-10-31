package com.dev.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
//        double d=10.0;
//        double q=0;
//        System.out.println("result: "+d/q);
		
        System.out.println("print statement before");
		t();
		System.out.println("print statement after");
	}

	public static void s() {
	StringBuffer sb=new StringBuffer(-1);
	}
	
	public static void t() {
		s();
	}
	
}
