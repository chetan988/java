package deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* creating dead lock using reentrant lock */

class lockme1 {
	private int count = 0;
	private int cur_count =0;
	private String name;
	lockme1(String name) {
		this.name =name;
	}
	private final static Lock loc1 = new ReentrantLock();
	private final static Lock loc2 = new ReentrantLock();
	public void lock1() throws InterruptedException {
		if (count == 3)
			return;
		count++;
		System.out.println("locking "+ name + ".lock1.loc1 from "
				+ Thread.currentThread().getName());
		loc1.lock();
		// Thread.sleep(10);
		for(int i=0;i<10;i++)
			cur_count++;
		lock2();
		System.out.println("unlocking "+ name + ".lock1.loc1 from "
				+ Thread.currentThread().getName());
		loc1.unlock();

	}

	public void lock2() throws InterruptedException {
		if (count == 3)
			return;
		count++;
		System.out.println("locking "+ name + ".lock2.loc2 from "
				+ Thread.currentThread().getName());
		loc2.lock();
		// Thread.sleep(5);
		for(int i=0;i<10;i++)
			cur_count++;
		lock1();
		System.out.println("unlocking "+ name + ".lock2.loc2 from "
				+ Thread.currentThread().getName());
		loc2.unlock();
	}
	
	public void getCount(){
		System.out.println("current count ="+ cur_count);
	}
}

public class Createdlusinglock {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				try {
					lockme1 l =new lockme1("obj1");
					l.lock1();
					l.getCount();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					lockme1 l = new lockme1("obj2");
					l.lock2();
					l.getCount();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}
