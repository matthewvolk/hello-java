import java.util.regex.*;

public class HelloRegex {
	
	public static void main(String[] args) {
		String longString = " Matt Volk CA 12345 PA (949)466-3267 johnsmith@gmail.com ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		// looking for a word 2 - 20 characters in length
		// [A-Za-z]{2,20}
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End Index: " + regexMatcher.end());
		}
	}
	
}
