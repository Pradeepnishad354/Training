package com.exception;

public class Exception1 {
	
	
	public static void main(String[] args) {
	
		try {
         int a=2;
         
		System.out.println(a/0);  
		}catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
		
		
		
		catch(Exception e){
			   System.out.println(e);
			   
			   
			   
			}
		finally {
		System.out.println("finally");
		 }
		
		
		
	}

}
