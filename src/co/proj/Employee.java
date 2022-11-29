package co.proj;

public class Employee {
	
	String name;
	String surname;
	Address address;
	public Employee(String name, String surname, Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.address=address;
	}
	
	void disp() {
		
		System.out.println(name+" "+surname+" ");
		
		System.out.println(address.city+" "+address.zipcode+" "+address.street);
	}
	
	public static void main(String[] args) {
		Address add=new Address("varanasi",222109,"sigra");
		Address add1=new Address("jaunpur",222229,"Nauperwa");
		
		
		 Employee emp=new Employee("saurabh","bind",add);
		 Employee emp1=new Employee("anil","v",add1);
		 emp.disp();
		 emp1.disp();
		
	
	}
	

}
