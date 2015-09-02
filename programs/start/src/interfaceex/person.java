package interfaceex;

public class person implements Iidentify,IInfo{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Hello there, I am "+ name);
	}
	@Override
	public void showIdentification() {
		// TODO Auto-generated method stub
		System.out.println("Identification code "+ id);
	}
	
	
}
