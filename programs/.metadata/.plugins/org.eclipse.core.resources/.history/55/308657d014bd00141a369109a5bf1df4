package thread1;

class UseSync implements Runnable {
	private int count;
	
	public synchronized void increment(){
		count++;
	}
	
	public void displayCount (){
		System.out.println("count = "+ count);
	}
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			increment();
		}
	}
	
}

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	UseSync u = new UseSync();
	Thread t1 = new Thread(u);
	Thread t2 = new Thread(u);
	t1.start();
	t2.start();
	try {
		t1.join();	// to wait
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	u.displayCount();

}

}
