package thread1;

import java.util.Scanner;

class Tryvolatile extends Thread {
	private int stop =0;
	private String threadname;
	
	public Tryvolatile(String threadname) {
		this.threadname = threadname;
	}
	
	public void setStop(int stop) {
		this.stop = stop;
	}
	public void run(){
		int count =0;
		while(stop == 0 ) {
			System.out.println("running thread "+ threadname + (count++) + " times");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class CheckVolatile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tryvolatile t1 = new Tryvolatile("thread1");
		t1.start();
		System.out.println("Enter any key to stop the tread");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		t1.setStop(1);
	}

}
