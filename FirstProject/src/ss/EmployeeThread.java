package ss;


public class EmployeeThread {

	public static void main(String[] args) {
		OrderThread order=new OrderThread();
		order.start();
		
		CustomerThread customer=new CustomerThread();
		Thread t1=new Thread(customer);
		t1.start();
		

	}

}
