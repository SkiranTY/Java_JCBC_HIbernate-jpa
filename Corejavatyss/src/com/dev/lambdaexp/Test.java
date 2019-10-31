package com.dev.lambdaexp;

import com.dev.assignment.Funint;

public class Test {

	public static void main(String[] args) {
		Funcint f=(int k) -> {
			for(int i=1;i<=10;i++) {
				System.out.println("i= "+i);
			}
		};

		f.printvalue(2);

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
		e.printval(3);
		g.printval(5);
	}

}
