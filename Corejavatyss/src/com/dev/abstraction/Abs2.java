package com.dev.abstraction;

public interface Abs2 {

	void display1();

	int b=2;
	public int d=10;
	//	private int a=1;
	//	protected int v=3;              // in interface only Static,public and final members are acceptable for declaration of variables
	static int f=23;
	final int k=2;

	public static void print() {                  // in method declration only public and static   
		System.out.println("this is fun of Abs2");
	}


}
