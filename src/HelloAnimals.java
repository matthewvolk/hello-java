public class HelloAnimals {
	// Private fields are only accessible by the HelloAnimals class itself
	private String name = "Animal";
	
	// Public fields are accessible from the entire program
	public String favoriteFood = "Food";
	
	// Protected fields are accessible by sub classes
	// Protected Final fields are accessible by sub classes but cannot be overwritten in the sub class
	protected final void changeName(String newName) {
		this.name = newName;
	}
	
	protected final String getName() {
		return this.name;
	}
	
	public void eatStuff() {
		System.out.println("Yum " + favoriteFood);
	}
	
	public void walkAround() {
		System.out.println(this.name + " walks around.");
	}
	
	public HelloAnimals() {
		
	}
	
	public HelloAnimals(String name, String favoriteFood) {
		this.name = name;
		this.favoriteFood = favoriteFood;
	}
}