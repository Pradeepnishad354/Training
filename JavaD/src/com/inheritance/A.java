package com.inheritance;

 class B {
// advantage of inheritance is to codereuseability	
// Is-A relationship

	// code reusability
	public void m1() {
		
		System.out.println("parent method");
	}
	

}
class A extends B{
	
	public void m2() {
		
		System.out.println("child method");
	}
	
	
	public static void main(String[] args) {
		
		
		B b=new B();
		b.m1();
		
	}
}



/* without inheritance */
// real time example of inheritance 
//loan module
class PersonalLoan{
	
	// 300 methods
}

class HLoans{
	
	// 300 methods
}
class CLoans{
	
	//300 methods 
}

// with Inheritance
class PLoans{
	//250 methods
}

class HoLoans extends PLoans{
	//50 commmon methods
}
class CaLoans extends PLoans{
	
	// 50 specific method call
}
