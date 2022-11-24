package com.polymorphism;


//case1:

public class Poly {
	/*
	 * // byte-short-int-long-float-double 
	 * //char-int-long-float-double // automatic
	 * conversion by compiler
	 * 
	 */
	public void m1() {
		
		System.out.println("no args");
	}
	
	public void m1(int a) {
		System.out.println("int args");
		
		
	}
	
	public void m1(float f) {
		System.out.println("float-args ");
		
	}
	
	public static void main(String[] args) {
		
		
		Poly p=new Poly();
		p.m1();
		p.m1(10);
		p.m1(20.0f);
		
//		p.m1('a');// automatic promotion in overloading 
		p.m1(10l);
		
	}

}
