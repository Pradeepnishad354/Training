package com.encapsulation;

public class TitlyEncapsulated {
	
	//make every variable is private  it is called tightly encapsulated class

}

class Accountt{
	
	
	private double balance;
	
	public void getBalance() {
		
	}
	public void setBalance() {
		
		
	}
}

class A{
	
	private int x=20;// tightly encapsulated
}

class B extends A{
	
	int y=20; //not  tightly encapsulated
}
 class C extends A{
	 
	 private int z=30;// tightly encapsulated
 }