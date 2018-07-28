import java.util.*;
import java.io.*;

public class HelloExceptions {
	
	/* Error Types:
	 * 
	 * java.lang.RunTimeException => The developer's responsibility to catch and handle these
	 * java.lang.Exception => Exceptions checked by the compiler, developer must check for these errors
	 * ArithmeticException => Arithmetic operations go wrong, maybe divide by 0
	 * ClassNotFoundException => Class is called but does not exist
	 * IllegalArgumentException => Thrown whenever a method is passed an illegal argument
	 * IndexOuOfBounds => Accessing an index in an array or string that does not exist
	 * InputMismatchException => When you input the wrong data type
	 * IOException => File I/O
	 */
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void divideByZero(int a) {
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
	
	public static int getAge() {
		int age;
		
		System.out.print("How old are you? ");
		age = checkValidAge();
		if (age != 0)
			System.out.println("You are " + age + " years old!");
		
		return age;
	}
	
	public static int checkValidAge() {
		try {
			return userInput.nextInt();
		} catch (InputMismatchException e) {
			userInput.next();
			System.out.println("That isn't a whole number.");
			return 0;
		}
	}
	
	public static void getAFile(String fileName) throws IOException {
//		try {
			FileInputStream file = new FileInputStream(fileName);
//		} catch (FileNotFoundException e) {
//			System.out.println("Sorry, I can't find that file");
//		} catch (IOException e) {
//			System.out.println("Unknown IO error.");
//		} catch (Exception e) {
//			System.out.println("Some error occured");
//		} finally {
//			System.out.println("");
//		}
	}
	
	public static void main(String[] args) {
		divideByZero(2);
		getAge();
		try {
			getAFile("./hello.txt");
		} catch (IOException e) {
			System.out.println("An IO Error occured");
		}
		
	}
	
}