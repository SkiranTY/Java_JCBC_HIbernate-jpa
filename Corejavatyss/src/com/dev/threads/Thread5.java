package com.dev.threads;

public class Thread5 extends Thread{

	Printer2 p2;
	
	public Thread5(Printer2 p3) {
		p2=p3;
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p2.printval(10, "Thread5");
	}

}
