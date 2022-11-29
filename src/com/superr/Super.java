package com.superr;


class A{
	
	void eat() {
		
		System.out.println("animal");
	}
}

class B extends A{
	
	void eat() {
		
		System.out.println("dog");
	}

 void work() {
	 
	 eat();
	  super.eat();
 }
}





public class Super {
	
	public static void main(String[] args) {
		
		
		B b=new B();
		
		b.work();
		
	}
	
	

}
