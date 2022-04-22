package ss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderThread implements Test {
	
	@Override
	public String say(String name) {
		// TODO Auto-generated method stub
		return "Your have ordered "+name;
	}
	
	
}
