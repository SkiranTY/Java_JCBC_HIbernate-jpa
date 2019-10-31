package com.dev.assignment;

public class Test {
	
	static int i=10;
    static int j=15;
    
    static String s1="muyran";
    static String s2="ryan";
    
	public static void main(String[] args) {
	
		System.out.println(i++);
		System.out.println(++j);
		System.out.println(i++ + j++);

		System.out.println(s1=s2);
		System.out.println(s1==s2);
	}

}
