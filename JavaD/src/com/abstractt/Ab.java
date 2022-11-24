package com.abstractt;

abstract class C {
	
	
	public abstract void m1();
		
	
	
	public void m2() {
		
		System.out.println("this is non abstract method");
	}
}
class Ab extends C{

	@Override
	public void m1() {
		System.out.println("this is abstract method ");
		
	}
	
	public static void main(String[] args) {
		
		
		
		Ab c=new Ab();
		c.m1();
		c.m2();
	}
	
	
}
