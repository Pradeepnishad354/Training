package co.proj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	
	public static void main(String[] args) {
		
		
	
	HashMap<Integer,String> map=new HashMap<>();
	map.put(1,"rohan");
	map.put(2,"rahul");
	map.put(3,"aman");
	
	
	Set<Entry<Integer, String>> i = map.entrySet();
	Iterator<Entry<Integer, String>> itr = i.iterator();
	while(itr.hasNext()) {
		
		Entry<Integer, String> p = itr.next();
		System.out.println(p.getKey()+" "+p.getValue());
		
		
	}
	
//	for(Map.Entry<Integer,String> m:map.entrySet()) {
//		
//		System.out.println(m.getKey()+" : " +m.getValue());
//	}
			

}
}
