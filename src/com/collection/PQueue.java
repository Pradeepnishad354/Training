package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {
	
	public static void main(String[] args) {
		
		
		Queue<Integer> p=new PriorityQueue<Integer>();
		p.add(10);
		p.add(20);
		p.add(90);
		p.add(30);
		
		System.out.println(p);
		
		
		p.peek();
		
		//printing the top element
		System.out.println(p.peek());
		
		// printing the top element and removing it
		System.out.println(p.poll());
		
		// again 0prirnting the top element 
		System.out.println(p.peek());
		
		
		
	}

}
