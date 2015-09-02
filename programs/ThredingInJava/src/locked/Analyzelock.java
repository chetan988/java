package locked;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Worker1 {
	private List<Integer> work_status1= new ArrayList<Integer>();
	private List<Integer> work_status2= new ArrayList<Integer>();
	
	Object lock1 = new Object();
	Object lock2 = new Object();
	
	Random rand = new Random();
	public void doJob1(String thread) {
	   synchronized(lock1) {
		   System.out.println("processing job 1 by thread: "+ thread);
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
	 }
				
	}
	public void doJob2(String thread){
		// filling second list
		System.out.println("processing job 2 by thread: "+ thread);
	synchronized(lock2) {
		for(int i=0;i<1000;i++){
			work_status2.add(rand.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
		
	}
	
	public void showSize() {
		System.out.println("list1 size ="+ work_status1.size());
		System.out.println("list1 size ="+ work_status2.size());
		
	}
	
}

class thread extends Thread {
	Worker1 w1;
	
	public void setWorker(Worker1 w) {
		w1 = w;
	}
	public void run() {
		System.out.println("running thread "+ this.getName());
		
		w1.doJob1(this.getName().toString());
		w1.doJob2(this.getName().toString());
		w1.showSize();
	}
	
}

public class Analyzelock {

	public static void main(String[] args) {
		
		Worker1 w = new Worker1();
	// create a thread object and run 
		long start = System.currentTimeMillis();
		System.out.println("running threads");
		thread t1 = new thread();
		t1.setName("Thread-1");
		t1.setWorker(w);
		
		thread t2 = new thread();
		t2.setName("Thread-2");
		t2.setWorker(w);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Total time taken : "+ (end - start) + "ms");
		
		
		
	}

}
