package com.encapsulation;

public class Encapsulation {
	
	//binding the data and entity together an entity is called encapsulation
	
	//example-capsule
	
	// binding the data member and method into a single uit is called encapsulation
	
	// Student class
	// binding data member and method 
	
	/* if any components follow data hiding and abstraction  tehn it is achieve the encapsulation component encapsulation=datahidning+abstraction*/
	String name;
	int age;
	int rollnu;
	int marks;
	
	public void readMarks() {
		
		
	}
	
	public void write() {
		
		
	}
	
	
	

}
class Account{
	
	private int balance;
	//getter and setter method 
	// GUI//balance enquiry//deposit
	public int getBalance() {
		//validate
		
		return balance;
	}
	
	public void  setBalance(int amount) {
		
		//validate
		
		this.balance=this.balance+amount;
	}
}

// advanatage

//1.security
//2.modularity improve //3.maintainability
	
	
