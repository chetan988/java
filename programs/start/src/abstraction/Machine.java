package abstraction;

public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void start();
	public abstract void exec();
	public abstract void stop();
	
	public void run () {
		start();
		exec();
		stop();
	}
}
