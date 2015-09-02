package interfaceex;

public class car extends machine implements IInfo,Iidentify{
	private int id;
	public void engine (){
		System.out.println("300cc engine");
	}
// as the parent class already done that we can skip it

	@Override
	public void showIdentification() {
		// TODO Auto-generated method stub
		System.out.println("Identification number ="+id);
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine name : "+machine_name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
