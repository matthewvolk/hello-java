package HelloArray;
import java.util.Arrays;

public class HelloArrays {
	public static void main(String[] args) {
		int[] randomArray;
		randomArray = new int[10];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random", "words"};
		
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = i;
		}
		
		for (int j = 0; j < randomArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println();
		
		String[][] multiArray = new String[10][10];
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = Integer.toString(j);
				System.out.print(multiArray[i][j]);
			}
			System.out.println();
		}
		
		// Other Array Methods: The ENHANCED For Loop
		// for (dataType[] tempVariableForRow : arrayName) { ... };
		
		for (int row : randomArray) {
			System.out.println(row);
		}
		
		
	}
}