package com.superr;

class Person{
	int id;
	String name;
	Person(int id,String name){
		
		this.id=id;
		this.name=name;
	}
}
public class Emp extends Person{
     
	float salary;
	Emp(int id, String name,float salary) {
		super(id, name);// reuse of parent class constructor
		this.salary=salary;
		
		
	}
	void disp() {
		
		System.out.println(id+" "+name+" "+salary);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Emp e=new Emp(1,"ashu",20000f);
		
		e.disp();
	}

}
