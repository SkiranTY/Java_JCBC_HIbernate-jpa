package com.dev.constructer;

public class ConstrEx {
	
	public ConstrEx() {
		System.out.println("this is no argument const");
	}
	
	public ConstrEx(int i,char c) {
		System.out.println("this is int and char const");
	}
	
	public ConstrEx(String s, char v, int k) {
		System.out.println("this is const with 3 input args");
	}

	public ConstrEx(int k,String s, char v) {
		System.out.println("this is change in order const");
	}
	
	public static void main(String []args) {
		ConstrEx ce=new ConstrEx();
		System.out.println("ce:"+ce);
		ConstrEx ce1=new ConstrEx(4,'d');
		System.out.println("ce1:"+ce1);
		ConstrEx ce2=new ConstrEx("kiran",'b',8);
		System.out.println("ce3:"+ce2);
		ConstrEx ce3=new ConstrEx(8,"praveen",'p');
		System.out.println("ce3:"+ce3);
	}
}
