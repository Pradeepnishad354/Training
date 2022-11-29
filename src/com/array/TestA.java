package com.array;

public class TestA {
	public static void main(String[] args) {
	int a[]= new int[5];
	a[0]=1;
	a[1]=2;
	a[2]=5;
	a[3]=10;
	a[4]=20;
	
	
	for(int i=0; i<a.length; i++) {
		
		System.out.println(a[i]);
	}
		
	//using forExch loop
	
	for(Integer b:a) {
		
		System.out.println(b);
		
	}
	}

}
