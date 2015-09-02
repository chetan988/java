package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class reverseString implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}

class person {
	private String name;
	private int id;
	public person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	
}


public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(10);
		intlist.add(20);
		intlist.add(1);
		intlist.add(5);
		intlist.add(30);

		System.out.println("Sorting numbers in natural order");
		Collections.sort(intlist);
		
		System.out.println(intlist);
		
		System.out.println("Sorting in reverse order");
		Collections.sort(intlist,new Comparator<Integer>(){  // anonymous class concept

			@Override
			public int compare(Integer x, Integer y) {
				
				return -x.compareTo(y);
			}
		});
		System.out.println(intlist);
		
		
		// now with String
		
		List<String> names = new ArrayList<String>();
		names.add("abc");
		names.add("adc");
		names.add("bcda");
		names.add("xyz");
		names.add("aecfgk");
		names.add("nope");
		
		System.out.println("natural order sorting");
		Collections.sort(names);
		System.out.println(names);
		System.out.println("Reverse order sorting");
		Collections.sort(names,new reverseString());
		System.out.println(names);
		System.out.println("Length wise sort");
		Collections.sort(names,new Comparator<String>() {

			@Override
			public int compare(String s1,String s2) {
					if(s1.length() > s2.length())
						return 1;  // higher length first
					else if (s1.length() < s2.length()){
						return -1;
					}
					else {
						return s1.compareTo(s2);
					}
			}
		});
		System.out.println(names);
		
		// now with class 
		
		List<person> people = new ArrayList<person>();
		people.add(new person("xyz",10));
		people.add(new person("abcd",1));
		people.add(new person("nygf",20));
		people.add(new person("zsh",40));
		people.add(new person("pina",5));
		
		System.out.println("sort by id");
		Collections.sort(people,new Comparator<person>(){

			@Override
			public int compare(person p1, person p2) {
				
				if(p1.getId() >= p2.getId()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			
		});
		System.out.println(people);
		System.out.println("Sort by name");
		Collections.sort(people,new Comparator<person>(){

			@Override
			public int compare(person p1, person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		System.out.println(people);
		
	}

}
