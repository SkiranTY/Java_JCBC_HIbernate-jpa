package com.dev.assignment;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("----------Array reverse---------");
		int[] a= {1,2,3,4,5,6,7};
			
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("-----------sum of array element----------");
		int b=(a.length)/2;
		System.out.println("middle element="+a[b]);
		
		int c=a[0];
		System.out.println("first element="+c);
		
		int d=(a.length-2);
		System.out.println("2nd last element="+a[d]);
		
		int sum=a[b]+c+a[d];
		System.out.println("sum is="+sum);

	System.out.println("-----------------String reverse-------------");
	
	String str= new String("World java");
	String res="";
	for(int j=str.length()-1;j>=0;j--) {
		res=res+str.charAt(j);
	}
	System.out.println("reversed string: "+res);
	}
}

