package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer> ();
		// adds at the end
		al.add(10);
		al.add(30);
		al.add(40);
		// adds at perticular index
		al.add(2,20);
		
		System.out.println("iterate method 1");
		for(int i=0;i<al.size();i++) {
			System.out.println(i + " : " + al.get(i));
		}
		
		System.out.println("\n iterator method 2");
		for(Integer in : al) {
			System.out.println(in);
		}
		
		// check if a value exist in the array list
		
		if(al.contains(10)){
			System.out.println("array list have 10");
		}else {
			System.out.println("array list do not have 10");
		}
		
		if(al.contains(100)){
			System.out.println("array list have 100");
		}else {
			System.out.println("array list do not have 100");
		}
	
		// get the index of an element
		
		System.out.println("index of 20 in the arrylist is "+ al.indexOf(20));
		
		// convert Arraylist to array
		Integer[] a = new Integer[al.size()];
		al.toArray(a);
		
		for (int i=0;i< a.length;i++) {
			System.out.println("array " + i +" : " + a[i]);
		}
		
		// another short method
		
		Integer[] b = al.toArray(new Integer[al.size()]);
		for (int i=0;i< a.length;i++) {
			System.out.println("array " + i +" : " + a[i]);
		}
		
		// array to list
		
		List<Integer> bl = Arrays.asList(b);
		
		for(Integer in : bl) {
			System.out.println(in);
		}
		al.remove(1);
		System.out.println("After removing index 2 : "+al);
	}
	
	
}
