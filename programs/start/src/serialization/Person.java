package serialization;

import java.io.Serializable;

public class Person implements  Serializable{

	private static final long serialVersionUID = 3976054746712840999L;
	private String name;
	private transient int id;
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
