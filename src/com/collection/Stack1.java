package com.collection;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	
	public static void main(String[] args) {
		
		Stack<String> s=new Stack<>();
		
		s.add("ashutosh");
		s.add("arvind");
		s.add("shubham");
		s.add("mahadev");
		s.add("pritesh");
		
		
	
//	Collections.sort(s);
//	System.out.println(s);
//	iterate the stack
	for(String n: s) {
		System.out.println(n);
	}
	
	
//	s.remove(0);
//	System.out.println(s);
//	
	
//	s.add(2,"pradeep");
//	System.out.println(s);
	
	s.pop();
	
	System.out.println(s);
	
	// while 
	
Iterator<String> itr=	s.iterator();
while(itr.hasNext()) {
	
	String next = itr.next();
	System.out.println(next);
}
	
	}
}
