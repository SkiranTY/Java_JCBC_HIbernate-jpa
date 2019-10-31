package com.dev.exception;

public class Exceptionhandling extends CustomException{

	public static void main(String[] args) throws CustomException {
		s();
		try {
			divide(10,0);
		}catch(Exception e){
			throw new CustomException();
		}

	}
	public static int  divide(int i,int j)  {
		int res=i/j;
		System.out.println(res);
		return 1;
	}
		public static void s() {
			try {
				StringBuffer sb=new StringBuffer(-1);
				
			}catch(Exception e) {
				new CustomException().printStackTrace();
			}
		}
		
	
}
