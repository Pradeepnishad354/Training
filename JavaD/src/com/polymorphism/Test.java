package com.polymorphism;


//case2:
public class Test {
	
	
	public void m1(Object o) {
		System.out.println("object -args");
		
	}
//	public void m1(String s) {
//		
//		
//		System.out.println("string- args");
//	}
	public static void main(String[] args) {
		
		
		
	
	Test t=new Test();
//	t.m1(new Object());// exact match we are give the high priority 
	
	t.m1("pradeep");
	
	t.m1(null);// String args will be call            object(parent)-String(child) 
	}                          
}
