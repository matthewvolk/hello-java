import java.util.Scanner;

public class HelloInput {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Your favorite number: ");
		if (userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " + numberEntered);
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			// Java Math Library
			int absNum = Math.abs(numberEntered);
			int whichIsBigger = Math.max(numberEntered, 10);
			int whichIsSmaller = Math.min(numberEntered, 10);
			
			double sqRt = Math.sqrt(numberEntered);
			System.out.println("Square root of "+ numberEntered + ": " + sqRt);
			
			double randomNum = Math.random() * numberEntered;
			System.out.println("Random number between 0 and " + numberEntered + ": " + randomNum);

		} else {
			System.out.println("Please enter a number less than 2,147,483,647 and greater than -2,147,483,648.");
		}
	}
	
}