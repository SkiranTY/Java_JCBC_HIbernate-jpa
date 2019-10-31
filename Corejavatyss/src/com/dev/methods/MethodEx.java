package com.dev.methods;

public class MethodEx {
	
	static int j=0;
	static MethodEx me=new MethodEx();

	public static void main(String[] args) {
		 		
		j =calcarea(6);
		System.out.println("Area of square:"+j);
		int area1=me.areaRec(2,4);
		System.out.println("area og rectangle:"+area1 );
	}
	
	public static int calcarea(int side) {
		int t=side*side;
		int n=me.areaRec(4, 8);
		System.out.println(n);
		return t;
	}
	
	public int areaRec(int len,int width) {
		j=len*width;
		return j;
	}
}

