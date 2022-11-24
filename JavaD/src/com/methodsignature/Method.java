package com.methodsignature;

public class Method {
//complexity to reduces
// this is also called compile time polymorphism 
	
	// static polymorphiem
	// early binding
	
	public void m1() {
		
		System.out.println("no-args");
	}
	public void m1(int a)
	{
		
		System.out.println("int-args");
	}
	public void  m1(double d) {
		
		System.out.println("dob-args");
		
		
	}
	
	public static void main(String[] args) {
		
		Method m=new Method();
		m.m1();
		m.m1(2);
		m.m1(12.4);
	}
}
