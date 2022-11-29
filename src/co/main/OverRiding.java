package co.main;


class OverRiding1{
	
	
	void show() {
		
		System.out.println("this is parent method");
	}
}


public class OverRiding extends OverRiding1{
	
	void show() {
		
		System.out.println("this is child method");
	}
	
	public static void main(String[] args) {
		
		
		
		OverRiding ov=new OverRiding();
		ov.show();
	}
	
	

}
