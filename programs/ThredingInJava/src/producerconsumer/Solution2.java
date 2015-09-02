package producerconsumer;
/*
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Q {
	private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);  
	volatile boolean isValueExist = false;

	public void put(int n) throws InterruptedException {
		queue.put(n);
		System.out.println("putting : "+ n + " Current size: "+ queue.size());
	}

	public void get() throws InterruptedException{
		int value = queue.take();
		System.out.println("Getting : "+ value + " Current size : "+ queue.size());
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
			//	System.out.println("running producer thread ");
			try {
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
		while (count < 100) {
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



public class Solution2 {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}
*/