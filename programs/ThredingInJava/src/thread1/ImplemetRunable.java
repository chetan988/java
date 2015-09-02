package thread1;


class Useranable implements Runnable {
	private String threadname;
	public Useranable(String name) {
		threadname = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("running thread "+ threadname +" : "+ i );
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ImplemetRunable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Useranable("thread1"));
		t1.start();
		Thread t2 = new Thread(new Useranable("thread2"));
		t2.start();

	}

}
