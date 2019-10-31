package com.dev.strings;

public class Stringmeth {

	public static void main(String[] args) {
		
		String s="hello java";
		String s1="Hello Java";
		
		  int length=s.length();
		  System.out.println("for length method="+length);

		  char arr[]=s.toCharArray();
		  for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
		  }
		  
		  System.out.println();
		  
		 char c=s.charAt(7);
		 System.out.println("for charAt method="+c);
		 
		 boolean b=s.equals(s1);
		 System.out.println("for equals method="+b);
		 
		 boolean b1=s.equalsIgnoreCase(s);
		 System.out.println("for equalsignorecase="+b1);
		
		boolean b2=s.contains("hello");
		System.out.println("for contains method="+b2);
		
		String n=s.replace('h', 'H');
		System.out.println("for replace="+n);
		
		int d=s.indexOf('H');
		System.out.println("for indexOf method="+d);
		
		String v=s.toUpperCase();
		System.out.println("for uppercase="+v);
		
		String z=v.toLowerCase();
		System.out.println("for lowercase="+z);
		
		
	}

}
