
class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
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
		Person other = (Person) obj;
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

public class Equalsto {
	public static void main(String[] args) {
		Person p1 = new Person(2,"xxx");
		Person p2 = new Person(2,"xxx");
		Person p3 = p1;
		System.out.println(p1 == p2);	// false as both are not physically same object
		System.out.println(p1==p3);		// true as both are same object
		System.out.println(p1.equals(p2));   // true rightclick -> source -> create equle to method we have to override the equals to method to work for this
		
		
		double d1 = 2.2;
		double d2 = 2.2;
		System.out.println(d1==d2);  // true 
		//System.out.println(d1.equals(d2));  // true
		
		String t1 = "hello";
		String t2 = "hello";
		String t3 = "helloworld";
		String t4 = t3.substring(0,5);
		System.out.println(t4);
		
		System.out.println(t1 == t2);		// true
		System.out.println(t1 == t4);		// false
		System.out.println(t1.equals(t4));	// true always use equals method to compare
	}
}
