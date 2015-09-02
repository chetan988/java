package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Person {
	private String name;
	private int id;
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	
	
}

class Person_new {
	private String name;
	private int id;
	public Person_new(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person_new other = (Person_new) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}


public class Customobjectmapset {

public static void main(String[] args){	
	Map<Person,String> email = new HashMap<Person,String>();
	
	Person p1 = new Person("xxx",2);
	Person p2 = new Person("yyy",12);
	Person p3 = new Person("zzz",22);
	Person p4 = new Person("xxx",2);   // p4 and p1 are same person
	email.put(p1, p1.getName() + "@gmail.com");
	email.put(p2, p2.getName() + "@gmail.com");
	email.put(p3, p3.getName() + "@gmail.com");
	email.put(p4, p4.getName() + "@gmail.com");
	
	
	// display the hash
	
	for (Person p : email.keySet()) {
		System.out.println(p +" => " + email.get(p));
	}
	
	
	HashSet<Person> set = new HashSet<Person>();
	
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	
	System.out.println(set);
	
	System.out.println("Though p1 and p4 are same person still map and set are not filtering\n\nSolution with new class");
	Map<Person_new,String> email_new = new HashMap<Person_new,String>();
	
	Person_new pn1 = new Person_new("xxx",2);
	Person_new pn2 = new Person_new("yyy",12);
	Person_new pn3 = new Person_new("zzz",22);
	Person_new pn4 = new Person_new("xxx",2);   // p4 and p1 are same person
	email_new.put(pn1, p1.getName() + "@gmail.com");
	email_new.put(pn2, p2.getName() + "@gmail.com");
	email_new.put(pn3, p3.getName() + "@gmail.com");
	email_new.put(pn4, p4.getName() + "@gmail.com");
	
	
	// display the hash
	
	for (Person_new pn : email_new.keySet()) {
		System.out.println(pn +" => " + email_new.get(pn));
	}
	
	
	HashSet<Person_new> setn = new HashSet<Person_new>();
	
	setn.add(pn1);
	setn.add(pn2);
	setn.add(pn3);
	setn.add(pn4);
	
	System.out.println(setn);
	
}
}
