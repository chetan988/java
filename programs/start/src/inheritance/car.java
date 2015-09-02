package inheritance;

public class car extends machine {
	public void engine (){
		System.out.println("300cc engine");
	}

	public static void main(String[] args){
		car c = new car();
		c.machine_name = "suzuki";
		//c.machine_id;     can not do that
		c.start();
		c.engine();
		c.stop();
	}
}
