/* Java does not allow you to inherit from multiple different classes
 * What do you do when you want to add additional functionality to a class
 * that's already inheriting from another class?
 */

// Use an abstract class when you want to create a class in which every method doesn't have to be implemented to use the abstract class
public abstract class HelloAbstract {
	boolean carDrivable = true;
	public void youCrashed() {
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int strength);
	public abstract int getCarStrength();
}