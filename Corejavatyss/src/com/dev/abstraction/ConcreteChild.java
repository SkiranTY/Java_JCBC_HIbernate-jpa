package com.dev.abstraction;

public class ConcreteChild extends ParentAbstr{
	

	@Override
	void myname() {
		System.out.println("this is implemented in concrete class inheried by parent abstract");
		
	}

	
	public static void main(String[] args) {
		ConcreteChild ce=new ConcreteChild();
		ce.myname(); 

	}

	

}
