package inheritance;

public class machine {

	private int machine_id;
	public String machine_name;
	
	public void start() {
		System.out.println("machine started");
	}
	
	public void stop(){
		System.out.println("machine stopped");
	}
	
	public void setMachinid(int mid){
		machine_id=mid;
	}
}
