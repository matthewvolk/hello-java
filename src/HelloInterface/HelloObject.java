package HelloInterface;
public class HelloObject {
	public static void main(String[] args) {
		// Every thing in Java that isn't a primitive inherits from the Object class
		Object superCar = new HelloInterface(4, 25, 50);
		System.out.println(((HelloInterface) superCar).getSpeed());
		
		HelloInterface superTruck = new HelloInterface(18, 100, 1000);
		System.out.println(superCar.equals(superTruck));
		
		System.out.println(superCar.hashCode());
		
		System.out.println(superCar.getClass().getName());
		
		if (superCar.getClass() == superTruck.getClass()) {
			System.out.println("Same Class!");
		}
		
		superCar.toString();
		
		superTruck.setWheels(6);
		HelloInterface superTruck2 = (HelloInterface) superTruck.clone();
		System.out.println(superTruck.getWheels() + ", " + superTruck.hashCode());
		System.out.println(superTruck2.getWheels() + ", " + superTruck2.hashCode());
	}
}