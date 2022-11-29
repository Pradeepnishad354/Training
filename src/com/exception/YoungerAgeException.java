package com.exception;

public class YoungerAgeException extends RuntimeException{
	
	
	YoungerAgeException(String msg){
		
		super(msg);
		
	}

}
class Voting {
	
	public static void main(String[] args) {
		
		int age=16;
		if(age<18) 
		throw new YoungerAgeException("you are not eligible for voting ");
		
	else {
	 
		System.out.println("succes");
	}
}}