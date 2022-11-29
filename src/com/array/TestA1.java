package com.array;

public class TestA1 {
	
	public static void main(String[] args) {
		
		int a[]= {23,45,65,33,2};
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		//traverse an array using for each loop
		for(Integer b:a) {
			
			System.out.println(b);
		}
		
	}

}
