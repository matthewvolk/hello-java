package HelloOldThread;
public class HelloThreads {
	public static void main(String[] args) {
		Thread getTime = new HelloThread();
		Runnable getMail = new HelloSecondThread(10);
		Runnable getMailAgain = new HelloSecondThread(20);
		
		// Run three threads at the same time
		getTime.start();
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
	}
}