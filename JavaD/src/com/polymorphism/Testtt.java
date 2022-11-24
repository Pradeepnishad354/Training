package com.polymorphism;

//Case4:

public class Testtt {
	
	public void m1(int i) {
		
		System.out.println("general method");
	}
	
	public void m1(int...is) {
		System.out.println("vargs-method");
	}
	
	public static void main(String[] args) {
		
		
		Testtt t=new Testtt();
		t.m1(10);
		t.m1(10,20,30); // for vargs we can enter any int value including with 0
	t.m1();
	}
	

}
