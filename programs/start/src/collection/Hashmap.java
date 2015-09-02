package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main (String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer> ();
		hm.put("two", 2);
		hm.put("six", 6);
		hm.put("eight", 8);
		hm.put("two", 22);   // override
		hm.put("three", 3);
		
		System.out.println("value of key six is :" + hm.get("six"));
		if(hm.get("one") == null) {
			System.out.println("value does not exist"); // same cna be done by hm.contains
		}
		
		System.out.println("Iterator :");
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key +" => " + value);
		}
		
	}
}
