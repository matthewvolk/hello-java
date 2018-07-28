public class HelloConditions {
	
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 50);
		if (randomNumber < 25) {
			System.out.println("The random number is less than 25");
		} else if (randomNumber > 40) {
			System.out.println("The random number is greater than 40");
		} else if (randomNumber == 18) {
			System.out.println("The random number is equal to 18");
		} else if (randomNumber != 40) {
			System.out.println("The random number is not equal to 40");
		} else {
			System.out.println("Nothing Worked");
		}
		
		if (!false) {
			System.out.println("\nI turned false into true");
		}
		
		// OR statement only has one vertical pipe
		if (true | false) {
			System.out.println("This will always print if one condition is true");
		}
		
		// TERNARY operator
		int valueOne = 1;
		int valueTwo = 2;
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo; 
		
		System.out.println("The random number is " + randomNumber);
		
		char theGrade = 'A';
		switch (theGrade) {
			case 'A':
				System.out.println("Great job");
				break;
			case 'B':
				System.out.println("Not bad");
				break;
			case 'C':
				System.out.println("Okay");
				break;
			case 'D':
				System.out.println("Bad");
				break;
			case 'F':
				System.out.println("Fail");
				break;
		}
			
	}
	
}