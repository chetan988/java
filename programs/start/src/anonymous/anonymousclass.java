package anonymous;

class Someclass {
	public void info(){
		System.out.println("This is a someclass class");
	}
}

interface InterfaceClass {
	public void interfaceMethod();
}
public class anonymousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Someclass cl = new Someclass() {
			public void info(){
				System.out.println("This is a anonymous class");
			}
		};
		cl.info();
		
		InterfaceClass ic = new InterfaceClass() {
			public void interfaceMethod(){
				System.out.println("This is a intrface method");
		}
		};
		
		ic.interfaceMethod();
	}

}
