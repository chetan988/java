package producerconsumer;
/*
import java.util.Random;

class Q {
	private int n;
	volatile boolean isValueExist = false;

	public synchronized void put(int n) throws InterruptedException {
		if (isValueExist) {
			wait();	// wait if value populated
		}
		this.n = n;
		System.out.println("Putting :" + n);
		isValueExist = true;
		//Thread.sleep(10);
		notify();

	}

	public synchronized void get() throws InterruptedException {
		if (!isValueExist) {
			wait();		// wait if value not yet populated
		}
		isValueExist = false;
		System.out.println("getting " + n);
		//Thread.sleep(10);
		notify();

	}
}

class Producer implements Runnable {
	Q q;
	int count = 0;

	Producer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (count < 10) {
			try {
			//	System.out.println("running producer thread ");
				q.put(new Random().nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
	}

}

class Consumer implements Runnable {
	Q q;
	int count = 0;

	Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	public void run() {
		while (count < 10) {
			try {
	//			System.out.println("Running consumer thread");
				q.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
	}

}

public class Solution1 {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
*/