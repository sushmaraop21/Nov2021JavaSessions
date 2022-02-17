package OOP_Inheritance;

public class Car extends Vehicle {
	//final keyword:
	//used to provide constant vars
	//used to prevent overriding
	//used to prevent inheritance
	
	String name;
	static int wheels=4;
	public void start() {
		System.out.println("Car.. start..");

	}

	public void stop() {
		System.out.println("Car.. stop..");

	}

	public void refuel() {
		System.out.println("Car.. refuel..");

	}
	public static void price() { // this will be in CMA -its not given to object
		System.out.println("car---price");
	}

}
