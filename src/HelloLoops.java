import java.util.Scanner;

public class HelloLoops {
	public static void main(String[] args) {
		double myPi = 4.0;
		double j = 3.0;
		String continueYorN = "Y";
		Scanner userDecision = new Scanner(System.in);
		
		/* 
		 * Calculation for Pi:
		 * 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 ...
		 * 
		 */
		
		while (j < 199 && continueYorN.equalsIgnoreCase("y")) {
			myPi = myPi - (4/j) + (4/(j + 2));
			j += 4;
			System.out.println("Value of j: " + j + ", Value of My PI: " + myPi);
			System.out.print("Continue (Y/N)? ");
			continueYorN = userDecision.nextLine();
		}
		
		System.out.println("Value of Pi: " + Math.PI);
		System.out.println("Value of your Pi: " + myPi);
		System.out.println("Your value of Pi was off by " + (myPi - Math.PI));
		
		/*
		 * How the algorithm was created:
		 * 1) Identify the PATTERN that can be repeated
		 *    In this case, PI is calculated like: 4 - 4/3 + 4/nextOddNum - PATTERN
		 * 2) All you have to do is recognize that the beginning number is the same as the myPi variable
		 * 3) nextOddNum will always be the current 'j' value + 2
		 * 4) This means you must increment current 'j' by 4
		 * 
		 */
		
	}
}