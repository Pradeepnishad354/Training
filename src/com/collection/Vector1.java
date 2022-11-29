package com.collection;

import java.util.Collections;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		
	Vector<Integer> v=new Vector<>();
	
	
	v.add(66);
	v.add(44);
	v.add(99);
	v.add(898);
	v.add(76);
	
	// collection sorts 
	Collections.sort(v);
	System.out.println(v);
	
	
	System.out.println(v);
		
		for(Integer m:v) {
			
			
			System.out.println(m);
		}
		
		
	}

}
