package com.ty.excer;

import java.util.HashMap;
import java.util.MissingFormatArgumentException;

public class Excep {

	public static void main(String[] args)  throws MyException {
		int  a=0,b=1;
		System.out.println(Math.pow(a,b));
		if(a==0||b==0) {
			throw new MyException("the exponent and base number format exception");
	
	}
	}
	
}
