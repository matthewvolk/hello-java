
public class HelloWorld {

	public static void main(String[] args) {
		
		byte bigByte = 127; // Bytes can hold -128 to 127
		short bigShort = 32767; // Shorts can hold -32768 to 32767
		int bigInt = 2147483647; // Integers can hold -2147483648 to 2147483647
		long bigLong = 9223372036854775807L; // Longs MUST BE SUFFIXED WITH THE LETTER 'L'
		float bigFloat = 3.14F; // Floats MUST BE SUFFIXED WITH THE LETTER 'F'
		double bigDouble = 3.141529; // Doubles CAN be suffixed with the letter 'D' but do not need to be
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		char escapedChar = '\\';
		
		System.out.println(randomChar); // A
		System.out.println(anotherChar); // A
		System.out.println(escapedChar); // \
		
		String randomString = "I'm a random string";
		String anotherString = " lol";
		String oneMoreString = randomString + anotherString;
		
		System.out.println(oneMoreString);
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		
		// Casting
		double aDouble = 3.14489304;
		int doubleToInt = (int) aDouble;
		int stringToInt = Integer.parseInt(intString);
		
		System.out.println(doubleToInt);
		System.out.println(stringToInt);
		
	}
	
}
