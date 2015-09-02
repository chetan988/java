package producerconsumer;
import java.util.ArrayList;
import java.util.List;

class Q {
	private List<Integer> list = new ArrayList<Integer>();
	private final int LIMIT =10;
	Object lock = new Object();
	
	public void put(int n) throws InterruptedException {
		synchronized (lock) {
			while(list.size() == LIMIT) {
				lock.wait();
			}
			System.out.println("putting : " + n);
			list.add(n);
			lock.notify();
		}
	}

	public synchronized void get() throws InterruptedException {
		synchronized (lock) {
			while(list.size() == 0) {
				lock.wait();
			}
			System.out.print("size = "+ list.size());
			int value =list.remove(0);
			System.out.println("; getting : "+ value);
			lock.notify();
		//	Thread.sleep(1000);
		}
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
		while (count < 100) {
			try {
			//	System.out.println("running producer thread ");
				q.put(count++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//count++;
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
		while (count < 100) {
			try {
	//			System.out.println("Running consumer thread");
				q.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			
		}
	}

}

public class Solution3 {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}
