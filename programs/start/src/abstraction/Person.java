package abstraction;

public class Person implements information {
	private String Name;
	private String sex;
	@Override
	public void showInfo() {
		System.out.println("person is a man/woman having name,age,sex");
	}
	
}
