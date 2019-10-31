package com.dev.strings;

import java.util.stream.IntStream;

public class Stringmethods {

	public static void main(String[] args) {
	    
	  String str="some string";
	  String str1="Some String";
	  
	  int length=str.length();
	  System.out.println("for length method="+length);

	  char arr[]=str.toCharArray();
	  for(int i=0;i<arr.length;i++) {
	  System.out.print(arr[i]+" ");
	  }
	  
	  System.out.println();
	  
	 char c=str.charAt(7);
	 System.out.println("for charAt method="+c);
	 
	 boolean b=str.equals(str1);
	 System.out.println("for equals method="+b);
	 
	 boolean b1=str.equalsIgnoreCase(str1);
	 System.out.println("for equalsignorecase="+b1);
	  
	 String a=str.substring(3);
	 System.out.println("for substring method:"+a);
	 
	 String z=str.substring(3, 11);
	 System.out.println("for substr(int,int):"+ z );
	 
	 IntStream v= str.chars();
	 System.out.println(v);
	 
	 int d=str1.codePointAt(0);
	 int e=str.codePointAt(0);
	 System.out.println(e);
	 System.out.println(d);
	 
	 int n= str.compareTo(str1);
	 System.out.println(n);
	 
	 boolean blm=str.endsWith("g");System.out.println(blm);
	 
	}

}
