package ss;

public class OrderThread extends Thread {
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		super.run();
	}


}
