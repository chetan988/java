package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linklist {
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		getEfficency("LinkedList",ll);
		getEfficency("ArrayList",al);
	}
	
	public static void getEfficency (String type, List<Integer> list) {
		//insert inititial 10^4 elelemt
		
		// time to add element to end
		long start = System.currentTimeMillis();
		for (int i=0; i< 1e4; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(type + " took " + (end - start) + " ms to complete task");
		// time to add at front
		start = System.currentTimeMillis();
		for (int i=0; i< 1e4; i++) {
			list.add(0,i);
		}
		end = System.currentTimeMillis();
		
		System.out.println(type + " took " + (end - start) + " ms to complete task");
		
	}
}
