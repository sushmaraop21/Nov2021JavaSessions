package javasessionpackage;

public class Car {
	// Class prop:class variables/global variables

	String name;// ="Honda";-> this is a bad practice // this name can be used across the class
	int price;
	String color;
	String model;

	public static void main(String[] args) {

		// String name="Naveen";//local variable-scope is only in the main method
		// String name can be a global variable as well as local variable
		// System.out.println(name);

		// to access class var/prop , u have to create object
		// use new keyword

		Car c = new Car();
		c.name = "BMW";
		c.price = 70;
		c.color = "Black";
		c.model = "520d";
		System.out.println(c.name + " " + c.price + " " + c.color + " " + c.model);
		
		Car c1=new Car();
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + c1.model);
		//null 0 null null
		//have create an object but not given any prop values here but the prop are associated 
		//name,price,color ,model 
		
		Car c2=new Car();
		c2.name="Audi";
		c2.model="Q5";
		System.out.println(c2.name + " " + c2.price + " " + c2.color + " " + c2.model);
		// so right now we have this information abt the prop
		
	}

}
