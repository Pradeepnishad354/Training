package com.polymorphism;

public class Testttt {
	
	public void m1(int i,float f) {
		
		System.out.println("int float- args");
	}
	
	public void m1(float f,int i) {
		
		System.out.println("float int-args");
		
		
	}
	public static void main(String[] args) {
		
		
		Testttt t=new Testttt();
		t.m1(10,10.2f);
		t.m1(30.2f,20);
	}

}
