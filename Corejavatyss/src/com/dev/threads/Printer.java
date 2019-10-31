package com.dev.threads;

public class Printer {

	synchronized public void printval(int i,String thread) {
		System.out.println("Printer thread starts....print j");
		for(int j=0;j<=i;j++) {
			System.out.println("Thread= "+thread+" "+"j= " +j);
		}
		System.out.println("printer ends......");
	}
}
