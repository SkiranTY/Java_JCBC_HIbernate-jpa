package com.dev.assignment;

public class Testlam {

	public static void main(String[] args) {
		
		Funint f= (int i) -> System.out.println("without bracket");

		Funint e=(int i) -> {
			char c='A';
			while(c<'B') {
				c++;
				System.out.println("with brackets:"+c);
			}
		};
		
		Funint g=(int i) -> {
			try {
				int k=0/2;
				System.out.println(k);
			}catch(Exception e1) {
				System.out.println("exception caught");
			}
		};
		f.printval(2);
		e.printval(3);
		g.printval(5);
	}

}
