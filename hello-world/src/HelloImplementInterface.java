public class HelloImplementInterface {
	public static void main(String[] args) {
		HelloInterface car = new HelloInterface(4, 65, 10);
		
		System.out.println("Cars Max Speed: " + car.getSpeed());
		System.out.println("Car Wheels: " + car.getWheels());
		
		car.setCarStrength(10);
		System.out.println("Car Strength: " + car.getCarStrength());
	}
}