package interfaceex;

public class Main {
	
	public static void outputinfo(IInfo info) {
		info.showInfo();
	}
	
	public static void main(String[] args){
		car c = new car();
		c.machine_name = "suzuki";
		//c.machine_id;     can not do that
		c.start();
		c.engine();
		c.stop();
		c.setId(1203455);
		person p = new person();
		p.setId(1234);
		p.setName("xxx");
		p.showIdentification();
		p.showInfo();
		
		c.showIdentification();
		c.showInfo();
		
		IInfo info = new person();
		info.showInfo();   // this does not make sense so we can add parameter to the showinfo 
		
		IInfo info1 = p;
		info1.showInfo();  // this makes sense now
		
		IInfo carinfo = c;
		
		outputinfo(info1);
		outputinfo(c);
		
	}
}
