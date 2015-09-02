package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class Car implements Comparable<Car> {
	private String name;
	
	
	public Car(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Car c) {
		int l1 = this.name.length();
		int l2 = c.name.length();
		if(l1 > l2) {
			return 1;
		}
		if(l1<l2) {
			return -1;
		}
		else {
			return name.compareTo(c.name);
		}
			
	}


	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
}

public class NaturalOrdering {
	
	public static void addCar(Collection<Car> car) {
		car.add(new Car("Maruti"));
		car.add(new Car("Honda"));
		car.add(new Car("Jaguar"));
		car.add(new Car("BMW"));
		car.add(new Car("Audi"));
		car.add(new Car("Mercedies"));
		car.add(new Car("Astro"));
	}
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		addCar(carList);
		Collections.sort(carList);
		System.out.println(carList);
		
		// now the set
		
		TreeSet<Car> carSet = new TreeSet<Car>();
		addCar(carSet);
		
		System.out.println(carSet);
	}

}
