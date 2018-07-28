public class HelloSecondThread implements Runnable {
	private int startTime;
	
	public HelloSecondThread(int startTime) {
		this.startTime = startTime;
	}
	
	public void run() {
		try {
			Thread.sleep(startTime * 1000);
		} catch (InterruptedException e ) {
			
		}
		System.out.println("Checking Mail");
	}
}