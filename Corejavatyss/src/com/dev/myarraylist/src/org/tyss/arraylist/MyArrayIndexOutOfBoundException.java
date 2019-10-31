package org.tyss.arraylist;

public class MyArrayIndexOutOfBoundException extends IndexOutOfBoundsException {
	
	private int i;
	public MyArrayIndexOutOfBoundException(int i) {
		this.i=i;
	}
	@Override
	public String getMessage() {
		return "Your index is out of bound "+i;
	}
}
