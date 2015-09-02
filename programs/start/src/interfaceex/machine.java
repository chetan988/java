package interfaceex;

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
		setMachine_id(mid);
	}

	public int getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}

}
