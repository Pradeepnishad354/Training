package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet1 {
	
	public static void main(String[] args) {
		
//		Set<Foo> foo="";
//		
//		Foo foo=new Foo();
//		
		
//		Set<HashSet1> h=" ";
//		
//		HashSet1 h=new HashSet1();
//		
	
		
		
		HashSet<Integer> h=new HashSet<>();
		h.add(10);
		h.add(22);
		h.add(66);
		h.add(6);
		h.add(null);
		System.out.println(h);
		
		for(Integer p:h) {
			
			System.out.println(p);
		}
		
		
		LinkedHashSet<Integer> i=new LinkedHashSet<>();
		
		i.add(10);
		i.add(22);
		i.add(66);
		i.add(11);
		i.add(null);

	
		System.out.println(i);
		
		for(Integer r:i) {
			System.out.println(r);
		}
	
		
	}

}
