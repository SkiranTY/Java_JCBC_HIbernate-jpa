package com.dev.arrays;

public class Arrayfun {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7};
				for(int i=0;i<=arr.length;i++) {
				if(arr[i]==4) {
					System.out.println("value is presrent in the array"+ "index:"+i);
				}
				}
		int index=2;
		if(index<=arr.length) {
			System.out.println("index is valid");
			for(int j=0;j<=index;j++) {
				System.out.println(arr[j]);
			}
		}
		else {
			System.out.println("index invalid");
		} 

		System.out.println("mid value of array:"+arr[(arr.length-1)/2]);
		System.out.println("2nd last element:"+arr[(arr.length-2)]);
	}

}
