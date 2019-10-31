package com.dev.inheritance;

public class Supercl extends Starcl   {
  public Supercl() {
//	  System.out.println("this is const of subclass");
  }
  public Supercl(int i) {
	  System.out.println("this is const after super() in subcalss");
  }
  public Supercl(String str) {
	  super(str);
		 System.out.println("const with String in subclass");
	 }
  
  public Supercl(int i,String Str) {
	  super(i,Str);
		 System.out.println("const with int and String arg of subcalss");
	 }
  
	public static void main(String []args) {
	new Supercl();
	new Supercl("g");
	new Supercl(4,"f");
	}

}
