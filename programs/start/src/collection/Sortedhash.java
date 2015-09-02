package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sortedhash {
	public static void main (String[] args) {
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer,String>();
		Map<Integer, String> treemap = new TreeMap<Integer,String>();
		
		System.out.println("setting hashmap");
		setValue(hashmap);
		System.out.println("setting linkedhashmap");
		setValue(linkedhashmap);
		System.out.println("setting treemap");
		setValue(treemap);
		System.out.println("hashmap value");
		showMap(hashmap);
		System.out.println("linkedhashmap value");
		showMap(linkedhashmap);
		System.out.println("treemap value");
		showMap(treemap);
		
		
	}
	
	public static void setValue(Map<Integer,String> map) {
		map.put(10, "dog");
		map.put(25, "cat");
		map.put(2, "cow");
		map.put(30, "fish");
		
	}

public static void showMap (Map<Integer,String> map) {
		for (Integer key : map.keySet()) {
			System.out.println(key + " => " + map.get(key));
		}
	}
}