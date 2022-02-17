package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start(); // overridden method->preference will b its own class method
		b.stop(); // inherited method
		b.refuel();// inherited method
		b.autoParking();// individual method
		b.engine();// inherited method
		// b.theftsafety;// sibling method not possible
		b.name = "520d";
		System.out.println(b.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels); // BMW is a child class it can inherit all the static variable also

		BMW.price(); //
		Car.price();// cannot be overridden

		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.engine();
		au.theftSafety();
		// au.autoparking(); // sibling method access not possible.

		Honda h = new Honda();
		h.start();
		h.stop();
		h.refuel();
		h.engine();
		h.miniVan();
		// h.theftSafety(); // sibling method access not possible

		System.out.println(h.name);
		System.out.println(Car.wheels);
		System.out.println(Honda.wheels); // static var

		Car c = new Car();
		c.start();// car cant take child`s methods.so car class methods
		c.stop();
		c.refuel();
		c.engine();
		// c.theftsafety();//not possible ..car cant take its childs property

		// Top casting
		// child class object(RHS) can be referred by parent class variable

		Car c1 = new BMW();
		c1.start();// BMW start method will b called cos referred by car but properties will be bmw
		// in start method type reference check is PASSED as this is overridden
		c1.stop();
		c1.refuel();
		c1.engine(); // bmw s grandchild of vehicle ->top casting
		// c1.autoparking-> this method cant be accessed by car as it is the bmw's
		// individual method->type reference check

		Car c2 = new Audi(); // top casting with car varible
		c2.start();
		c2.stop();
		c2.refuel();
		c2.engine();
		// c2.theftsafety(); -> type check reference is fail

		Vehicle v2 = new Vehicle();
		v2.dieselVehicles();
		v2.petrolVehicles();

		// top casting with honda obj and car variable
		System.out.println("---Audi-----");
		Car c3 = new Honda();
		c3.engine(); // this is from vehicle
		c3.start();
		c3.stop();
		c3.refuel();
		// c3.miniVan();// type check reference fail

		// child class object(RHS) can be referred by grand-parent class variable
		System.out.println("Top casting--BMW obj with vehivle var");
		Vehicle v1 = new BMW(); // this is top casting but down casting not possible
		v1.engine();// only v1 can access engine but not the child methods.

		// down casting
		// parent class object can be referred by child class reference variable
		// BMW b1=(BMW) new Car();//u have converted a car to bmw object
		// Car cannot be cast to class OOP_Inheritance.BMW - ERROR-CAST EXCEPTION

		// Assignment for multilevel inheritance

		b.designing(); // override from autom
		b.dieselVehicles();// automobile
		b.petrolVehicles();
		b.engine();// vehicle
		b.refuel();
		b.start();
		b.stop();

		// top casting

		Automobile au1 = new Vehicle();
		au1.designing(); // Vehicle is an grandchild of Mechanical
		au1.dieselVehicles();
		au1.petrolVehicles();
		// au1.engine;//individual method so cant access child's indivial method

	}

}
