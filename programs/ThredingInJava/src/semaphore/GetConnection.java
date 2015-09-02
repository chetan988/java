package semaphore;

import java.util.concurrent.Semaphore;

public class GetConnection {
	
	private static GetConnection conn= new GetConnection();
	private int connections;
	Semaphore semaphore = new Semaphore(10);
	public GetConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static GetConnection getconnection() {
		return conn;
	}
	
	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		try {
			doConnect();
		}
		finally {
			semaphore.release();
		}
	}
	
	public void doConnect() {
		connections++;
		System.out.println("number of connection: " + connections);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// release the connection
		connections--;
	}
}
