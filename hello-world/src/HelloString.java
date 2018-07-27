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
		
		
	}
}