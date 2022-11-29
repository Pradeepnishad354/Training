package co.main;

 class B {
	
	
String color="red";

}
class A extends B{
	
	String color="green";
	
	void show() {
		System.out.println("color -:"+super.color);
		
		
	}
	
	public static void main(String[] args) {
		
		
		A a=new A();
		a.show();
	}	
		
	

}
