package com.prime;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number ");
	int a = sc.nextInt();
	int temp=0;
	
//	if(a%2==0) {
//		System.out.println("e");
//	}
//	else {
//		
//		
//		
//		System.out.println("o");
//	}

	for(int i=2; i<=a-1; i++ ) {
		
		if(a%i==0) {
			
			
			temp=temp+1;
			
			
		}
		if(temp==0) {
			
			System.out.println("number is p"+a);
		}else {
			
			
			
			System.out.println("number is not p"+a);
		}
		
	}

}}
