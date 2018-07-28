import java.util.Scanner;

public class HelloMethods {
	
	static int randomNumber; // Class Variable
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Whenever you are defining a method/function, you have to 
		// first define your accessModifier
		// Then static if you don’t have to create an object from a class before you can use static methods defined by the class.
		// accessModifier (public/private), static, returnType (void, int, double, String, etc), methodName()
		
		System.out.println(getRandomNum());
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1) {
			System.out.print("GUESS A NUMBER BETWEEN 0 AND 50: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes the random number is " + randomGuess);
		
	}
	
	public static int getRandomNum() { // THE 'int' IN THE PARAM DECLARATION CREATES A NEW VERSION OF THE ORIGINAL VARIABLE
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess) {
		if (guess == randomNumber) {
			return -1;
		} else {
			return guess;
		}
	}
	
}
