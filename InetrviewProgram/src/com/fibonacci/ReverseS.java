package com.fibonacci;

import java.util.Scanner;

public class ReverseS {
	public static void main(String[] args) {
		
		
//		String s1="rahul";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s1 = sc.nextLine();
		
		for(int i=s1.length();i>0; i--) {
			
			System.out.print(s1.charAt(i-1));
		}
	}           
}
