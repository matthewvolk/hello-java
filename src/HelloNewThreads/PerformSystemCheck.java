package HelloNewThreads;

import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable {
	
	private String checkWhat;
	ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkWhat) {
		this.checkWhat = checkWhat;
	}
	
	// Synchronizing the run thread ensures protection against other threads trying to invoke the run method
	// Too many synchronized functions can slow down the program
//	synchronized public void run() {
//		
//	}
	
	public void run() {
		lock.lock();
		System.out.println("Checking " + this.checkWhat);
		
		lock.unlock();
	}
	
	
}