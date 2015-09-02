

public class finalc {
	private String name;
	private String sex;
	private int age;
	private int ID;
	
	public static int count;
	public final static String PLANTE = new String("EARTH");
	
	finalc() {
		count++;
		ID=count;
	}
	
	public void setAll (String name,String sex,int age) {
		this.name = name;
		this.sex=sex;
		this.age = age;
	}
	
	public static int getCount() {
		return count;
		
	}
	
	public void putAll() {
		System.out.println("ID : "+ ID +" Name : "+ name + " sex : " +sex + " age : "+ age);
	}
	public static void main(String[] args) {
		
		// accessing the static variable to initialize
		finalc.count =0;
		
		finalc people1 = new finalc();
		finalc people2 = new finalc();
		finalc people3 = new finalc();
		
		people1.setAll("Chetan", "male", 25);
		people2.setAll("Rohit", "male", 29);
		people3.setAll("Ritu","female",30);
		
		// accessing class variable
		int total_obj = finalc.getCount();
		System.out.println("Total number of object created so far : " + total_obj );
		// accessing final static variable 
		System.out.println("We all from planet " + finalc.PLANTE);
		
		// print object variables
		people1.putAll();
		people2.putAll();
		people3.putAll();
		
		
	}

}
