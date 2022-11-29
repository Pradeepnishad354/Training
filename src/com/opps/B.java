package com.opps;

 class A {

	
	public A m1() {
		
		return this;
	}
}
	
	class B extends A{
		
		
		public B  m1() {
			return this;
		}
		
		void mes() {
			
			System.out.println("covariant return type");
	}
		
		public static void main(String[] args) {
			
			
			
		B b= new B();
		b.m1().mes();
		
			
		}
}
