package ss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderThread extends Thread {
	
	CustomerThread t;  
	public OrderThread(CustomerThread t, String tName) {
		super(tName);
		this.t=t;  
		
	}
	public void run(){  
		t.printTable(100);  
	}  
}
