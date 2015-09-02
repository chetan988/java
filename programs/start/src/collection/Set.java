package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		HashSet<String> city = new HashSet<String>();
		LinkedHashSet<String> indiacity = new LinkedHashSet<String>();
		TreeSet<String> usacity = new TreeSet<String>();
		
		// add to city
		city.add("delhi");
		city.add("london");
		city.add("new york");
		city.add("mumbai");
		city.add("chicago");
		city.add("hyderabad");
		city.add("losangelos");
		city.add("kolkata");
		
		
		// add to indiacity
		
		indiacity.add("delhi");
		indiacity.add("mumbai");
		indiacity.add("hyderabad");
		indiacity.add("kolkata");
		indiacity.add("chennai");
		indiacity.add("Bangalore");
		
		
		// add usa city
		
		usacity.add("new york");
		usacity.add("chicago");
		usacity.add("losangelos");
		usacity.add("seatale");
		usacity.add("losvegas");
		
		System.out.println("city : " + city);
		System.out.println("india city : " + indiacity);
		System.out.println("USA city : " + usacity);
		
		//////////////// get the indian city common to city and indiacity set ///////////
		// making a copy of indian city 
		
		HashSet<String> intersection_city = new HashSet<String>(indiacity);
		intersection_city.retainAll(city);
		System.out.println("intrsection : "+intersection_city);
		
		HashSet<String> differnce = new HashSet<String>(usacity);
		differnce.removeAll(city);
		System.out.println("differnce : "+ differnce);
		
		HashSet<String> union = new HashSet<String>(indiacity);
		union.addAll(usacity);
		
		System.out.println("union : " + union);
		
	}
}
