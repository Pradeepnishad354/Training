package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap1 {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> m=new HashMap<>();
		
		m.put("java",20000);
		m.put("hibernate",12000);
		m.put("spring",13000);
		m.put("hibernate",11000);
		
		
		
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		System.out.println(entrySet);
		
		
	for(Map.Entry<String ,Integer> map:m.entrySet()) {
		
		System.out.println(map.getKey()+""+map.getValue());
	}
	
	}
	
	

}
