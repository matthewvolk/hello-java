import java.util.Arrays;

public class HelloString {
	public static void main(String[] args) {
		String randomString = "Hi world!";
		
		// Escape Codes:
		String goToQuote = "He said, \"Fib\".";
		System.out.println(goToQuote);
		
		// Casting: Start with Integer
		int numTwo = 2;
		System.out.println(numTwo);
		
		// Primitive -> String
		String intToString = Integer.toString(numTwo);
		System.out.println(intToString);
		
		// String -> Primitive
		int stringToInt = Integer.parseInt(intToString);
		System.out.println(stringToInt);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		// Using .equals versus using .equalsIgnoreCase
		if (uppercaseStr.equals(lowercaseStr)) {
			System.out.println("They are equal.");
		} else {
			System.out.println("Because they are different cases, they are not equal");
		}
		
		if (uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
			System.out.println("Now they are equal!");
		}
		
		String letters = "abcde";
		System.out.println(letters.charAt(0));
		
		/*
		 * Compare To method: Compare two strings based on alphabetical order
		 * Will print out a '0' if the strings are equal
		 * If the letters in 'letters' come before 'moreLetters', you will get a negative number
		 * If the letters in 'moreLetters' come before 'letters', you will get a positive number
		 */
		String moreLetters = "fghijk";
		System.out.println(letters.compareTo(moreLetters));
		
		// Other useful methods:
		letters.contains("a");
		letters.endsWith("e");
		letters.length();
		letters.replace("abc", "xyz");
		
		// Split each character of String into an array
		String[] letterArray = letters.split("");
		System.out.print("[");
		for (int i = 0; i < letterArray.length; i++) {
			if (i == (letterArray.length - 1)) { System.out.print(letterArray[i]); break; }
			System.out.print(letterArray[i] + ", ");
		}
		System.out.print("]");
		
		// Get rid of string whitespace:
		String whiteSpaceString = "    whitespace    ";
		System.out.println("\n" + whiteSpaceString.trim());
		
		/*
		 * STRING BUILDERS:
		 * Strings are inherently immutable.
		 * When you 'mutate' a string, Java stores the old string version in the existing memory, storing the mutated version in new memory. 
		 * If you are planning to manipulate the same string over and over, user StringBuilder
		 */
		StringBuilder randSB = new StringBuilder("A Random Value");
		
		// Append something to the end of the string built with string builder
		randSB.append("!");
		
		// Want to know how much space the string builder built string is currently taking in memory?
		// NOTE: This function returns a different value every time you manipulate the function
		randSB.capacity();
		
		// You can increase space allocated manually (Sets MINIMUM not MAXIMUM)
		randSB.ensureCapacity(100);
		
		
	}
}