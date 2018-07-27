// Array lists are exactly like arrays, however they can dynamically resize if you delete or modify elements within.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class HelloArrayLists {
	public static void main(String[] args) {
		// ArrayList declaration
		ArrayList arrayListOne;
		
		// ArrayList initialization
		arrayListOne = new ArrayList();
		
		// ArrayList Declaration AND Initialization
		ArrayList arrayListTwo = new ArrayList();
		
		// By default, ArrayLists accept any type. If you want type checking enabled:
		ArrayList<String> names = new ArrayList();
		names.add("Fib");
		names.add("Tib");
		names.add("Wib");
		
		// Add an element at a specified index. This moves all elements greater than the index parameter up by one.
		names.add(2, "Other Tib");
		
		// To REPLACE an element, not just add, use .set
		names.set(0, "Fibber");
		
		// To REMOVE
		names.remove(3);
		
		System.out.println(names);
		
		for (String i : names) {
			System.out.println(i);
		}
		
		// BEFORE THE ENHANCED FOR LOOP, we had to use the Iterator object
		Iterator individualItems = names.iterator();
		while (individualItems.hasNext()) {
			System.out.println(individualItems.next());
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		System.out.println(nameCopy);
		
		System.out.println(nameCopy.contains("Fibber"));
		
		// Does the array 'names' contain all elements from 'nameCopy'?
		if (names.containsAll(nameCopy)) {
			System.out.println("It does!");
		}
		
		names.clear();
		System.out.println(names.isEmpty());
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		
		
	}
}