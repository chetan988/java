package locked;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Worker {
	private List<Integer> work_status1= new ArrayList<Integer>();
	private List<Integer> work_status2= new ArrayList<Integer>();
	
	Object lock1 = new Object();
	Object lock2 = new Object();
	
	Random rand = new Random();
	public synchronized void doJob1() {
	//   synchronized(lock1) {
		// filling 1st list
		for(int i=0;i<1000;i++){
			work_status1.add(rand.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//	 }
				
	}
	public synchronized void doJob2(){
		// filling second list
//	synchronized(lock2) {
		for(int i=0;i<1000;i++){
			work_status2.add(rand.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//	}	
		
	}
	
	public void showSize() {
		System.out.println("list1 size ="+ work_status1.size());
		System.out.println("list2 size ="+ work_status2.size());
		
	}
	
}

class thread1 extends Thread {
	Worker w1;
	private int id;
	thread1(int id,Worker w) {
		this.id = id;
		w1=w;
	}
	
	public void run() {
		System.out.println("running thread "+ id);
		w1.doJob1();
		w1.doJob2();
		w1.showSize();
		System.out.println("Finshed running thread "+ id);
	}
	
}

public class threadpool {

	public static void main(String[] args) {
		
		Worker w = new Worker();
	
		System.out.println("Started threads");
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<3;i++) {
			executor.submit(new thread1(i,w));
		}
		// shutdown the pool after finish
		executor.shutdown();
		
		try {
			executor.awaitTermination(1,TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("execution completed");
		
	}

}
