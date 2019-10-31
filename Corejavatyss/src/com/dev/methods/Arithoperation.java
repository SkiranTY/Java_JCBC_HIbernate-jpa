package com.dev.methods;

public class Arithoperation {

	static Arithoperation a=new Arithoperation();

	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("sum of 2 digit:"+c);
		return c;
	}

	public float sum(int a,float b,float h) {
		float d=a+b+h;
		System.out.println(" sum  of 3 didgit is:"+d);
		return d;
	}

	public double sum(int a,double b,float h,int j) {
		double d=a+b+h+j;
		System.out.println("sum of 4 digit  is:"+d);
		return d;
	}

	public int difference(int a,int b) {
		int d=a+b;
		System.out.println("difference of 2 dig:"+d);
		return d;
	}

	public float difference(float v,int x,float i) {
		float g=v-x-i;
		System.out.println("difference of 3 digit:"+g);
		return g;
	}


	public float difference(float v,float x,int a,int b) {
		float n=v-x-a-b;
		System.out.println(" difference of 4 digit is:"+n);
		return n;
	}

	public int multiplication(int a,int b) {
		int d=a*b;
		System.out.println("mulitiplication of 2 digits  is:"+d);
		return d;
	}

	public double multiplication(double v,float x,int d) {
		double m=v*x*d;
		System.out.println("multiplication of 3 digits is:"+m);
		return m;
	}

	public float multiplication(int a,float b,int c,int d) {
		float m=a*b*c*d;
		System.out.println("multiplication of 4 digits is:"+d);
		return m;
	}

	public int division(int a,int b) {
		int d=a/b;
		System.out.println("division of 2 digits:"+d);
		return d;
	}

	public float division(int a,int b,float c) {
		float d=a*b*c;
		System.out.println("division of 3 is:"+d);
		return d;
	}

	public double division(int a,int b,float c,double h) {
		double d=a*b*c*h;
		System.out.println("division of 4  digits is:"+d);
		return d;
	}

	public static void main(String[] args) {


		a.sum(5,2,5,7);
		a.difference(3.2f, 4.2f, 2, 6);
		a.multiplication(3, 2.4f, 7, 2);
		a.division(3, 5, 4.3f, 2.433);

	}

}
