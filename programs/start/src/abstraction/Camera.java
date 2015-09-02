package abstraction;

public class Camera extends Machine implements information {

	@Override
	public void start() {
		System.out.println("Camera started");
	}

	@Override
	public void exec() {
		System.out.println("Camera taking shorts at 30fps");
	}

	@Override
	public void stop() {
		System.out.println("camera stopping");	
	}

	@Override
	public void showInfo() {
		System.out.println("take pic and video, used for documentation");
	}

}
