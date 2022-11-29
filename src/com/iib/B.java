package com.iib;

class A{
	
	A(){
		
		System.out.println("parent class constructor");
	}
}



public class B extends A {
	
	B(){
		super();
		System.out.println("child class constructor");
	}
	
	{
		System.out.println("instance initializer block");
	}

	
	public static void main(String[] args) {
		
		
		
		B b=new B();
		
		int Integer = 10;
		char String = 'A';
		System.out.print(Integer);
		System.out.print(String);
	}
}
