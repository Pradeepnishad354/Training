package com.opps;

public class Over {
	
	
	public void sum(int num1,int num2) {
	
		int result;
		
		result=num1+num2;
		
		System.out.println(result);
		
	}
	
	public void sum(int num1,int num2,int num3) {
		
		int result1=num1+num2+num3;
		
		System.out.println(result1);
		
	}
	
	public void sum(int num1,float num2,float num3) {
		
		float result2;
		result2=(num1+num2+num3);
		
		System.out.println(result2);
	
	}
	
	public static void main(String[] args) {
		
		Over o=new Over();
		o.sum(2, 20);
		o.sum(12,22,44);
		o.sum(11,22.4f,33.3f);
		
	}

}
