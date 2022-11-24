package com.inheritance;

 interface G {
	
	public void m1();
}
interface E {
	
	
	public void m1(); 
		
}	


class F implements  G,E{

	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	
	public static void main(String[] args) {
		
		F f=new F();
		f.m1();
		
		
	}
}
