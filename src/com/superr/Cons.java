package com.superr;

class Animal{
	
	Animal(){
		
		System.out.println("parent constructor");
	}
	
}

class Dog extends Animal{
	
	Dog(){
		super();
		System.out.println("child class constructor");
	}
	
	
}




public class Cons {
	public static void main(String[] args) {
		
	
	
	
	Dog d=new Dog();
	
	
	
	}
}
