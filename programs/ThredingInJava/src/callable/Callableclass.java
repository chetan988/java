package callable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Running implements Callable<String> {

	public String call() throws Exception {
		Random rand = new Random();
		int sleeptime = rand.nextInt(1000);
		System.out.println("Starting . . . . ");
		Thread.sleep(sleeptime);
		System.out.println("End ....");
		if(sleeptime > 900)
			throw new IOException("too long");
		return Thread.currentThread().getName();
	}
}


public class Callableclass {

	public static void main(String[] args) {
		
		List<Future<String>> future = new ArrayList<Future<String>>();
		Running running = new Running(); 
		ExecutorService es = Executors.newCachedThreadPool();
		
		for (int i=0;i<5;i++) {
			future.add(es.submit(running));
		}
		
		es.shutdown();
		for(Future value : future) {
			try {
				System.out.println("Successfully completed : " + value.get());
			}
			catch(Exception e) {
				Exception io = (IOException) e.getCause();
				io.printStackTrace();
			}
		}
		
	}

}
