package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Readobject {
	public static void main (String[] args) {
		String filename = "/home/chetan/study/java/people.bin";
		
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(filename))) {
			System.out.println("deserializing people object");
			Person p1 = (Person) os.readObject();
			Person p2 = (Person) os.readObject();
			System.out.println(p1);
			System.out.println(p2);
			
			System.out.println("desrializing people array");
			Person[] peopleArray = (Person[]) os.readObject();
			for(Person people : peopleArray){
				System.out.println(people);
			}
			
			System.out.println("deserializing prople ArrayList");
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();
			
			for(Person people : peopleList){
				System.out.println(people);
			}
			
			System.out.println("deserialize with out");
			int count = os.readInt();
			for (int i =0; i< count;i++) {
				System.out.println((Person)os.readObject());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File could not found at :" + filename);
		} catch (IOException e) {
			System.out.println("File could not read/write at : "+filename);
		} catch (ClassNotFoundException e) {
			System.out.println("reading wrong class ");
		}
	}
}
