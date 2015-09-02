package abstraction;

public class Car extends Machine implements information{

	@Override
	public void start() {
		System.out.println("car started");
	}

	@Override
	public void exec() {
		System.out.println("car running at 120kmh");
	}

	@Override
	public void stop() {
		System.out.println("car stopped");
	}

	@Override
	public void showInfo() {
		System.out.println("4 wheel, runs on road, used for transport");
	}

}
