package ss;

public class CustomerThread implements Runnable {

	
	@Override
	public void run() {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i*100);
		}
		
	}

}
