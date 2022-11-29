package com.opps;

class E{
	
	int a=10;
}
public class D extends E {
	
	int a=30;
	
	public void disp() {
		
		System.out.println("a is"+super.a);
		System.out.println("a is"+this.a);
		System.out.println("super and this keywords");
	}
		
	public static void main(String[] args) {	
		D d=new D();
		d.disp();	
	}

}
