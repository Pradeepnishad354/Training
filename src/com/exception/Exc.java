package com.exception;

public class Exc {
	public static void main(String[] args) {
		try {
		int a=10/2;
		int b=10/3;
		int a1=10/0;
		int b1=10/4;
		int b2=10/1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(b2);
		

		
		}catch(ArithmeticException e) {
			
			System.out.println(e);
			
			
		}
		
		
	}

}
