package com.dev.exception;

import java.util.Map;

public class Ecxeptionhandling2 {

	public static void main(String[] args){

		try {
		s();
		System.out.println("no Exception for s()");
		int res=divide(10,0);
		System.out.println("no exception for divide()");
		System.out.println(res);
		
		}catch(NegativeArraySizeException e){
          System.err.println("Exception cuaght in catch block");
          System.err.println("getMessage():"+e.getMessage());
          e.printStackTrace();
          
		}catch(ArithmeticException e) {
			System.err.println("Exception cuaght in catch block");
			System.err.println("getMessage(): "+e.getMessage());
		}finally {
			System.out.println("finally block");
		}
	}
	public static void s() {
		StringBuffer sb=new StringBuffer(1);
	}
 
	public static int divide(int i,int j) {
		int res=i/j;
		return res;
	}
}