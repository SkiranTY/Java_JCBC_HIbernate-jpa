package com.ty.excer;

import java.sql.DriverManager;

public class MyException extends RuntimeException{

	public MyException(String str) {
		System.err.println(str);
	}
	
}
