package com.dev.threads;

public class Printer2 {

        public void printval(int i,String thread) {
        	System.out.println("Printer2 starts.....printing k value");
		for(int k=0;k<=i;k++) {
			System.out.println("Thread= "+thread+" "+"k= " +k);
		}
		System.out.println("Printer2 ends");
	}
}
