package castobj;

class machine {
	public void start(){
		System.out.println("machine starting");
	}
}

class camera extends machine {
	public void start(){
		System.out.println("camera starting");
	}
	public void snap(){
		System.out.println("taking snap");
	}
}

public class updowncast {
	// normal use of object
	public static void main(String[] args) {
		machine m1 = new machine();
		camera c1 = new camera();
		m1.start();
		c1.start();
		c1.snap();
		
		// upcast  same as polymorphism
		machine m2 = new camera();
		m2.start();
		// as expected will not work m2.snap();
		
		//down cast
		// first make a parent class refer to child class
		machine m3 = new camera();
		camera c2 = (camera) m3;  // downcasted m3 to camera
		c2.start();
		c2.snap();
		
		/* direct down casting will not result compilation error but will result runtime error */
	//	machine m4 = new machine();
	//	camera c3 = (camera) m4;
	//	c3.start();
		
	}
}
