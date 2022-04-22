package ss;

public class TestSysnchronization {

	public static void main(String[] args) {
		
		CustomerThread obj = new CustomerThread();//only one object  -- shared object/ traffic junction
		OrderThread t1 = new OrderThread(obj,"Order");  
		EmployeeThread t2 = new EmployeeThread(obj,"Customer");  
		t1.start();  
		t2.start();  

	}

}
