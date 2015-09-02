package producerconsumer;

import java.util.Random;
/*
class Q {
	private int n;

	public synchronized void put(int n) {
		this.n = n;
		System.out.println("Putting :" + n);
	}

	public synchronized int get() {
		System.out.println("getting " + n);
		return n;
	}
}

class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true)
			q.put(new Random().nextInt(100));
	}

}

class Consumer implements Runnable {
	Q q;

	Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	public void run() {
		while (true)
			q.get();
	}

}

public class incorectclass {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
*/