package locked;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class process {
	private int count;
	private Lock lock = new ReentrantLock();
	
	private void increment() {
		for(int i=0;i<1000;i++)
			count++;
	}
	
	public void thread1 () {
		lock.lock();
		try {
			increment();
		}
		finally {
			lock.unlock();
		}
	}
	
	public void thread2 () {
		lock.lock();
		try {
			increment();
		}
		finally {
			lock.unlock();
		}
	}
	
	public void thread3 () {
		synchronized (this) {
			increment();	
		}
	}
	 
	public void showCount() {
		System.out.println("count = "+ count);
	}
}

public class Reentrantlock {

	public static void main(String[] args) throws InterruptedException {
		final process p = new process();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				p.thread1();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				p.thread2();
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				p.thread3();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		p.showCount();
	}

}
