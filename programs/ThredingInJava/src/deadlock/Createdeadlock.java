package deadlock;

/* dead lock using synchronization */

class lockme {
	private int count = 0;
	private final static Object loc1 = new Object();
	private final static Object loc2 = new Object();
	public void lock1() throws InterruptedException {
		if (count == 10)
			return;
		count++;
		synchronized (loc1) {
			System.out.println("Calling lock1 from "
					+ Thread.currentThread().getName());
//			Thread.sleep(10);
			lock2();
		}
	}

	public void lock2() throws InterruptedException {
		if (count == 10)
			return;
		count++;
		synchronized (loc2) {
			System.out.println("Calling lock2 from "
					+ Thread.currentThread().getName());
	//		Thread.sleep(5);
			lock1();
		}
		
	}
}

public class Createdeadlock {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				try {
					new lockme().lock1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					new lockme().lock2();
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
