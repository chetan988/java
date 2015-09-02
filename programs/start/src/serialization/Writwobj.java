package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Writwobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Chetan",1);
		Person p2 = new Person("Peter",5);
		System.out.println(p1);
		System.out.println(p2);
		
		// now serialize the data
		String filename = "/home/chetan/study/java/people.bin";
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))) {
			
			System.out.println("serializing people object");
			os.writeObject(p1);
			os.writeObject(p2);
			
			System.out.println("serializing array of people");
			Person[] peopleArray = {new Person("aaa",12),new Person("bbb",22),new Person("ccc",32)};
			os.writeObject(peopleArray);
			
			System.out.println("Seralizing array list");
			ArrayList<Person> peopleList = new ArrayList<Person>();
			peopleList.add(new Person("ddd",42));
			peopleList.add(new Person("eee",52));
			peopleList.add(new Person("fff",62));
			os.writeObject(peopleList);
			
			System.out.println("serializing with count");
			os.writeInt(2);  // we are going to serialize 2 
			os.writeObject(new Person("ggg",72));
			os.writeObject(new Person("hhh",82));
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found at : "+ filename);
		} catch (IOException e) {
			System.out.println("can not read/write file at : "+ filename);
		}
	}

}
