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
		
	}
}