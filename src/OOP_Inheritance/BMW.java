package OOP_Inheritance;

public class BMW extends Car {// Bmw is a child of car

	// method overriding: polymorphism ->dynamic/runtime (method overloading is also
	// polymorphism but compile time polymorphism
	// when u have the same method in parent class and child class
	// with:
	// 1.same name
	// 2.same number of parameters
	// 3.same type of parameters
	// 4.same return type
	// 5.private methods,static methods CANNOT be overridden

	@Override
	public void start() { // overridden method->java will always acces this
		System.out.println("BMW.. start..");

	}

	public void autoParking() {
		System.out.println("BMW..auto parking...");
	}

	// System obj=new System();// system is a private constructor by java and v
	// cant create an object for this
	
	// method hiding-when u have same static method as parent its called method
	// hiding
	public static void price() { // static methods cannot be overriden
		System.out.println("BMW---price");
	}
}
