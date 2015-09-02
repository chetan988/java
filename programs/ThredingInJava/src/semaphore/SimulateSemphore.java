package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
class Dostuff {
	private int keeprec;
	Semaphore semaphore = new Semaphore(1);
	public void increment() throws InterruptedException{
		for (int i=0;i<1000;i++) {
			semaphore.acquire();
			keeprec++;
			semaphore.release();
		}
	}
	
	public void showKeeprec() {
		System.out.println("keeprec="+ keeprec);
	}
	
	
}
*/

public class SimulateSemphore {

	public static void main(String[] args) throws InterruptedException {
	/*	
		final Dostuff ds = new Dostuff();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					ds.increment();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					ds.increment();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.run();
		t2.run();
		
		t1.join();
		t2.join();
		
		ds.showKeeprec();
		*/
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			es.execute(new Runnable() {
				public void run() {
					GetConnection.getconnection().connect();
				}
			});
		}
		
		es.shutdown();
		es.awaitTermination(1,TimeUnit.DAYS);
		
	}

}
