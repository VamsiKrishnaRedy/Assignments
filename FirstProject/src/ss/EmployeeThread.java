package ss;


public class EmployeeThread extends Thread{

	CustomerThread t;  
	public EmployeeThread(CustomerThread t, String threadName) {
		
		super(threadName);
		this.t=t;
		
	}
	public void run(){  
		t.printTable(5);  
	}  


}
