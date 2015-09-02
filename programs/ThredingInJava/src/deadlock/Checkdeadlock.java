package deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {

	private String name;
	private int accno;
	private int amount = 1000; // min amount to create acc

	public Account(String name, int accno) {
		this.name = name;
		this.accno = accno;
	}

	public void deposite(int amount) {
		this.amount += amount;
	}

	public int withdraw(int amount) {
		if ((this.amount - amount) > 0) {
			this.amount -= amount;
			return 1;
		}
		return 0;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		// System.out.println("Transferring " + amount);
		if (acc1.withdraw(amount) == 1) {
			acc2.deposite(amount);
		}

		// System.out.println("acc " + acc1.accno + " : " + acc1.getAmount());
		// System.out.println("acc " + acc2.accno + " : " + acc2.getAmount());
		// System.out.println();

	}

	public void ShowAccount() {
		System.out.println("\nAmount  " + accno + " : " + amount);
	}

	public int getAmount() {
		return amount;
	}
}

class Transaction {
	Account a1 = new Account("Chetan", 1);
	Account a2 = new Account("Chetan", 2);

	Lock l1 = new ReentrantLock();
	Lock l2 = new ReentrantLock();
	Random rand = new Random();

	private void acquireLock(Lock l1, Lock l2) throws InterruptedException {
		while (true) {
			boolean statusl1 = false;
			boolean statusl2 = false;
			try {
				statusl1 = l1.tryLock();
				statusl2 = l2.tryLock();
			} finally {
				if (statusl1 && statusl2)
					return;
				if (statusl1) // if l1 is locked then release it so that other
								// thread will get the lock and try to lock l1
					l1.unlock();
				if (statusl2)
					l2.unlock();
			}
			Thread.sleep(1);
		}
	}

	public void doTransaction1() throws InterruptedException {
		for (int j = 0; j < 100; j++) {
			acquireLock(l1, l2);
			// will come here if got l1 and l2
			Account.transfer(a1, a2, rand.nextInt(100));
			l1.unlock();
			l2.unlock();
		}
	}

	public void doTransaction2() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			acquireLock(l1, l2);
			Account.transfer(a2, a1, rand.nextInt(100));
			l1.unlock();
			l2.unlock();
		}
	}

	public void showBal() {
		a1.ShowAccount();
		a2.ShowAccount();
		System.out.println("Sum of amount : "
				+ (a1.getAmount() + a2.getAmount()));
	}
}

public class Checkdeadlock {
	static Transaction t = new Transaction();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					t.doTransaction1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					t.doTransaction2();
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

		t.showBal();
	}

}
