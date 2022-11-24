package com.polymorphism;

//Case 3;

public class Testt {
	
	public void m1(String s) {
		
		System.out.println("String -args");
	}
	
	public void m1(StringBuffer b) {
		
		System.out.println("String buffer- args");
		
		
	}
	public static void main(String[] args) {
		
	
	Testt t=new Testt();
	t.m1("d");
	t.m1(new StringBuffer("r"));
//	t.m1(null);// compile time error
	
	}
}
