package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
	
	public static void main(String[] args) {
		
		
	
		
	//its print the element in sorting order	
		TreeSet<Integer> t=new TreeSet<>();
		
		t.add(15);
		t.add(16);
		t.add(2);
		t.add(12);
		
		System.out.println(t);
		
		for(Integer i:t) {
			System.out.println(i);
		}
		
		// iterate through while loop
	Iterator<Integer>a=	t.iterator();
	
	
		while(a.hasNext()) {
			
			System.out.println(a.next());
		}
		
		
	}

}
