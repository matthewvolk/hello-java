package HelloOldThread;
// How is your computer able to browse the internet, check email, play movies, music, all at the same time?
import java.util.*;
import java.text.DateFormat;

public class HelloThread extends Thread {
	public void run () {
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for (int i = 1; i <= 20; i++) {
			rightNow = new Date();
			currentLocale = new Locale("en");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				//
			}
		}
	}
}