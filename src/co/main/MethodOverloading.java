package co.main;

public class MethodOverloading {
	
	
	public void sum(int num1,int num2) {
		
		int result;
		result=num1+num2;
		
		System.out.println(result);
		
		
	}
	
	public void sum(int num1,int num2,int num3) {
		
		int result1 ;
		
		
		result1=num1+num2+num3;
		System.out.println(result1);
	}
	
	public void sum(float num1,float num2) {
		
		float  result2;
		
		result2=num1+num2;
		
		System.out.println(result2);

		
	}
public static void main(String[] args) {
	MethodOverloading o=new MethodOverloading();
	
	o.sum(10,20);
	o.sum(10,20,30);
	o.sum(10.3f,19.3f);
}
}
