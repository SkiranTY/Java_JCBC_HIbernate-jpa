package com.dev.inheritance;

public class Son extends Father{
	static Son s=new Son();

	@Override
	public void printname() {
		String name="Robb";
		System.out.println(name+" "+super.name+" "+s.lastname);
		super.printname();
	}
		public static void main(String[] args) {
		s.printname();

		}

	}

