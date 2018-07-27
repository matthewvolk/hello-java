// A Linked List is just another collection, just like an ArrayList
import java.util.Arrays;
import java.util.LinkedList;

public class HelloLinkedList {
	public static void main(String[] args) {
		// A linked list is best used for when you have a collection whose objects you'd expect to add/delete a lot.
		LinkedList linkedListOne = new LinkedList();
		LinkedList<String> names = new LinkedList();
		
		names.add("Fib");
		names.add("Tib");
		
		names.add(0, "Second Wib");
		
		names.addLast("Wibber");
		names.addFirst("First Fibber");
		
		names.remove(2);
		names.remove ("Tib");
		
		System.out.println("names: " + names);
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		System.out.println("nameCopy: " + nameCopy);
		
		if (names.contains("Wibber")) {
			System.out.println("Wibber's here!");
		}
		
		if (names.containsAll(nameCopy)) {
			System.out.println("names LinkedList has all values in nameCopy LinkedList!");
		}
		
		// More Methods for LinkedList
		names.indexOf("Wibber");
		names.isEmpty();
		names.size();
		names.get(0);
		
		// If .get parameter does not exist, you'll get an error.
		// If you want to look without error, use .peek
		// Only retrieves the first element in the list
		System.out.println(names.peek());
		
		// Retrieve and remove element at first index
		names.poll();
		
		// Retrieve and remove element at last index
		names.pollLast();
		
	}
}