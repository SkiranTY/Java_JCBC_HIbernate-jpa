package com.dev.abstraction;

public class SubChildconc extends ChildAbstr {
	
	@Override
	void sendsubchild() {
		System.out.println("this is implemented by child abstract ");
	}
	@Override
	void myname() {
		System.out.println("this is implemented fun in concrete  class of child absract calss");
	}
  
	public static void main(String[] args) {
		SubChildconc sb=new SubChildconc();
		sb.sendsubchild();
		sb.myname();

	}

	

}
