public class HelloInterface extends HelloAbstract implements HelloInterfaces {
	int numOfWheels = 2;
	double theSpeed = 0;
	int carStrength = 0;
	
	public int getWheels() {
		return this.numOfWheels;
	};
	
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
	};
	
	public double getSpeed() {
		return theSpeed;
	};
	
	public void setSpeed(int speed) {
		this.theSpeed = speed;
	};
	
	public HelloInterface(int wheels, double speed, int strength) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
		this.carStrength = strength;
	}
	
	public void setCarStrength(int strength) {
		this.carStrength = strength;
	};
	
	public int getCarStrength() {
		return this.carStrength;
	};
}