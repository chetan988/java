package generics;

import java.util.ArrayList;

class machine {

	
	public void start() {
		System.out.println("machine started");
	}
	
	public String toString(){
		return ("I am a machine");
	}
}

class camera extends machine {
	public void snap() {
		System.out.println("snap taken");
	}
	
	public String toString(){
		return ("I am a camera");
	}
}

public class Wildcard {
	
	public static void showMachine(ArrayList<machine> list) {
		for(machine value : list) {
			System.out.println(value);
			value.start();
		}
	}
	
	public static void showCamera(ArrayList<camera> listc) {
		for(camera value : listc) {
			System.out.println(value);
			value.start();
			value.snap();
			
		}
	}
	
	public static void showGeneric(ArrayList<?> list){
		for(Object value: list) {
			System.out.println(value);
		}
	}
	
	public static void showGenericUpperBound(ArrayList<? extends machine> list){
		
		// all list of machine and its child class can pass
		for(machine value: list) {
			System.out.println(value);
			value.start();
		}
	}
	
public static void showGenericLowerBound(ArrayList<? super camera> list){
		
		// all list of camera or its super class we have to access using super super class i.e object to avoid downcasting
		for(Object value: list) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		ArrayList<machine> m1 = new ArrayList<machine>();
		m1.add(new machine());
		m1.add(new machine());
		
		ArrayList<camera> c = new ArrayList<camera>();
		c.add(new camera());
		c.add(new camera());
		
		showMachine(m1);  // we can not pass camera list here 
		showCamera(c);
		System.out.println("using generic class to pass machine list");
		showGeneric(m1);
		System.out.println("using generic class to pass camera list");
		showGeneric(c);
		
		System.out.println("defining upper bound to wirldcard list parameter");
		showGenericUpperBound(c);
		showGenericLowerBound(c);
		
	}
}
