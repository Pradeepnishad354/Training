package com.iib;

public class Bike {
	
	int speed;

	Bike(){
		
		System.out.println("constructor is invoked ");
	}
	{
		System.out.println("instance initializer block");
	}
	
	public static void main(String[] args) {
		
	
	
	Bike b=new Bike();
	Bike b1=new Bike();
	}
}
