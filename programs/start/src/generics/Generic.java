package generics;

import java.util.ArrayList;
import java.util.HashMap;

class someclass {
	
}

public class Generic {
	public static void main(String[] args) {
		
		/////////////old style ///////////////
		
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("mango");
		
		String choceoffruit = (String) list.get(2);  // we have to downcast else a compilation error
		
		System.out.println(choceoffruit);
		////////////////// new stylr ////////////////
		ArrayList<String> animal = new ArrayList<String> ();
		animal.add("cat");
		animal.add("dog");
		animal.add("fish");
		
		String choiceofpet = animal.get(2);  // no casting required as we already set the generic object to String
		System.out.println(choiceofpet);
		
		////////////////////// array list can take any parameter /////
		
		ArrayList<someclass> cl = new ArrayList<someclass>();
		
		//////// some generic class takes more than one parameter //////////////
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		///////////////////// java 7 generic class ///////////
		
		ArrayList<String> somelist = new ArrayList<>();
		// it allow to omit the String call in second case
		
	}
}
