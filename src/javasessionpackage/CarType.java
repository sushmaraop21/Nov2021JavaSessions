package javasessionpackage;

public class CarType {
	String name;
	int price;
	String color;
	static int wheels = 4; // Only class variables can be static
	
	public static void start() { //static method
		System.out.println("car----start");
	}
	public void stop() {
		System.out.println("Car----stop");
	}

	public static void main(String[] args) {

		// local variables cannot be declared as static

		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.color = "Black";
		// c1.wheels=4; //this wheels 'property value' is 4 which is common in all the Cars
		// so v declare this wheels as static as class variable
		System.out.println(c1.name);
		//System.out.println(c1.wheels); // the static field CarType.wheels should be accessed in a static way

		//how to access a static variable
		//1.access directly:
		System.out.println(wheels);// v can actually access this directly because
		//both main method is static and variable is also static in nature but not good way
		
		//2.access via class name
		System.out.println(CarType.wheels); //with classname we can only access static variables
		
		//How to access the static method:
		//1.access directly
		start();
	//	stop();//Error: Unresolved compilation problem: 
		//2.access via class name
		CarType.start();
		
		
		
		CarType c2 = new CarType();
		c2.name = "BMW";
		c2.price = 70;
		c2.color = "Black";
		c2.wheels = 4;

		CarType c3 = new CarType();
		c3.name = "BMW";
		c3.price = 70;
		c3.color = "Black";
		c3.wheels = 4;

	}

}
