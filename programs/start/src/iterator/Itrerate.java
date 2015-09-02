package iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class TestIt implements Iterable<String> {
	List<String> names = new ArrayList<String>();
	
	@Override
	public Iterator<String> iterator() {
		return names.iterator();
	}
	
}

class TestWOIterable {
	public List<String> names = new ArrayList<String>();
}

class OwnIterator implements Iterator<String>,Iterable<String> {
	private List<String> urls = new ArrayList<String>();
	private int index =0;
	public void setUrl() {
		urls.add("http://www.facebook.com");
		urls.add("http://chetandas.co.nf/");
	}
	@Override
	public boolean hasNext() {
		
		return index < urls.size();
	}

	@Override
	public String next() {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(urls.get(index));
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			while((line = br.readLine())!= null) {
				sb.append(line);
				sb.append("\n");
				
			}
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		index++;
		return sb.toString();
	}

	@Override
	public void remove() {
		urls.remove(index);
	}
/*	@Override
	public Iterator<String> iterator() {
		
		return urls.iterator();
	}*/
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new OwnIterator();
	}
	
}


public class Itrerate {

	public static void main(String[] args) {
		List<String> animal = new ArrayList<String>();
		animal.add("cat");
		animal.add("dog");
		animal.add("cow");
		animal.add("fish");
		
		System.out.println("Traversing using iterator");
		Iterator<String> its = animal.iterator();
		while(its.hasNext()){
			
			System.out.println(its.next().toString());
		}
		System.out.println();
		System.out.println("Class without Iterable and have a list");
		TestWOIterable twi = new TestWOIterable();
		twi.names.add("ted");
		twi.names.add("carrot");
		twi.names.add("barny");
		for(String name : twi.names) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("making a class iterable through foreach loop");
		TestIt ti = new TestIt();
		ti.names.add("chetan");
		ti.names.add("xyz");
		ti.names.add("abc");
		
		for(String name : ti){
			System.out.println(name);
		}
		System.out.println();
		System.out.println("Checking out the iterator class");
		OwnIterator oi = new OwnIterator();
		oi.setUrl();
		System.out.println("getting the urls in the list");
		while(oi.hasNext()) {
			System.out.println(oi.next());
		}
	/*	Iterator<String> ii = oi.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		*/
	}

}
