package com.collection;

import java.util.ArrayDeque;

public class ArrayDequeue {
	
public static void main(String[] args) {
	
	ArrayDeque<Integer> ad=new ArrayDeque<>();
	
	ad.add(30);
	ad.add(88);
	ad.add(50);
	ad.add(77);
	
	
	System.out.println(ad);
	
	// clear method 
	ad.clear();
	
	// add first element to insert the head
	ad.addFirst(34);
	ad.addFirst(44);
	ad.add(55);
	
	System.out.println(ad);
	
	// add the elements at tail
	ad.addLast(90);
	ad.addLast(444);

	System.out.println(ad);
}

}
