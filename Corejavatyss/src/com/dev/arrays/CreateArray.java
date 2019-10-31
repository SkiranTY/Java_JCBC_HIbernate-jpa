package com.dev.arrays;

public class CreateArray {

	public static void main(String[] args) {
		int []intArr;  //declaration
		char[] carr;
		byte barr[];

		intArr = new int[3];      //creation
		carr = new char[2];
		barr = new byte[4];
		
		
		intArr[0]=1;              //initialisation
		intArr[1]=2;
		intArr[2]=3;
		
		carr[0]='a';
		carr[1]='b';
		
		barr[0]=9;
		barr[1]=5;
		barr[2]=9;
		barr[3]=1;
		
		int pen[]=new int[3];        //declaration and creation
		char arr2[]= {'a','b','c','d','e'};   //declaration and initialisation
		System.out.println(arr2[3]);
		System.out.println("length of arr2 is:"+arr2.length);
		
		System.out.println( intArr[0]*3);	
		System.out.println(intArr[1]+2);
		System.out.println(intArr[2]-1);
		System.out.println(barr[1]/2);
		System.out.println(barr[2]%3);
		
		for(int i=0; i<=2; i++) {
			System.out.println(intArr[i]);
		}
	} 

}
