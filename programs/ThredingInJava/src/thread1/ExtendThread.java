package thread1;


class thread extends Thread{
	private String threadname;
	public thread(String name) {
		threadname = name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("running thread "+ threadname +" : "+ i );
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ExtendThread {

	public static void main(String[] args) {
		thread t1 = new thread("thread1");
		t1.start();
		thread t2 = new thread("thread2");
		t2.start();
		
		
	}

}
