package locked;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class proc {
	private int count;
	private Lock lock = new ReentrantLock();
	private Condition con = lock.newCondition();
	
	private void increment() {
		for(int i=0;i<1000;i++)
			count++;
	}
	
	public void thread1 () throws InterruptedException {
		System.out.println("thread 1 sleeping");
		Thread.sleep(100);
		System.out.println("thread 1 awake");
		lock.lock();
		System.out.println("thread1 waiting..");
		con.await();
		System.out.println("thread 1 running...");
		try {
			increment();
			
		}
		finally {
			lock.unlock();
		}
	}
	
	public void thread2 () throws InterruptedException {
		lock.lock();
		try {
			increment();
			Thread.sleep(100);
			con.signal();
		}
		finally {
			lock.unlock();
		}
		con.await();
	}
	
		 
	public void showCount() {
		System.out.println("count = "+ count);
	}
}


public class Reentrantlockwithawait {

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
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		p.showCount();
	}

}
