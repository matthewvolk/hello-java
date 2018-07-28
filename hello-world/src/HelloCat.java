public class HelloCat extends HelloAnimals {
	public String favToy = "Yarn";
	public void playWith() {
		System.out.println("Yay favorite toy");
	}
	
	public void walkAround() {
		System.out.println(this.getName() + " stalks around");
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	public HelloCat(String name, String favoriteFood, String favToy) {
		super(name, favoriteFood);
		this.favToy = favToy;
	}
	
	
	
}