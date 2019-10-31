package com.dev.inheritance;

public class Starcl {
 public Starcl() {
	 System.out.println("const with no-arg of superclass");
 }
 
 public Starcl(int i) {
	 System.out.println("const with int arg of supercalss");
 }
 
 public Starcl(String str) {
	 System.out.println("const with String arg of supercalss");
 }
 
 public Starcl(String str,int i) {
	 System.out.println("const with String and int arg of supercalss");
 }
 
 public Starcl(int i,String str) {
	 System.out.println("const with int and String arg of supercalss");
 }
	public static void main(String[] args) {
		
	new Starcl();
	}

}
