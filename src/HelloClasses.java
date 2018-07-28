public class HelloClasses {
	
	public static void main(String[] args) {
		HelloAnimals genericAnimal = new HelloAnimals();
		System.out.println(genericAnimal.getName());
		
		HelloCat morris = new HelloCat("Itch", "Tuna", "Yarn");
		morris.eatStuff();
		
		HelloAnimals tabby = new HelloCat("Tabby", "Treats", "Ball");
		acceptAnimal(tabby);
		
	}
	
	public static void acceptAnimal(HelloAnimals animal) {
		System.out.println();
		System.out.println(animal.getName());
		System.out.println(animal.favoriteFood);
		System.out.println();
		
		// If the superclass and the subclass both have the method, 
		// Java will try to resolve the method for the subclass and use the subclass method
		animal.walkAround();
		
		// The parameter passed into this function is an HelloAnimals class
		// If you want access to a method or field defined only in the subclass of HelloAnimals, 
		// you need to first cast the object into that subclass
		HelloCat tempCat = (HelloCat) animal;
		System.out.println(tempCat.favToy);
		
		if (animal instanceof HelloCat) {
			System.out.println(animal.getName() + " is a Cat!");
		}
		
	}
	
}