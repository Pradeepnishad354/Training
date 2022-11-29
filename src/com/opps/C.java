package com.opps;

public class C {
	
	
	
	private int id;
	String name;
	String lastName;
	
	static String s="sheat";
	
	public void disp() {
		
		
		
		System.out.println(id+" :"+name+" :"+lastName+":"+s);
	}
	
	public static void m1() {
		System.out.println("this is static method");
	}
	
	
	public static void main(String[] args) {
		
		
		
		C a=new C();
		a.id=1;
		a.name="rohan";
		a.lastName="jain";
		
		C a1=new C();
		a1.id=2;
		a1.name="jay";
		a1.lastName="hind";
		
		a.disp();
		a1.disp();
		
		C.m1();
	}

}
