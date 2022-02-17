package ConstructorConcept;

public class ConstructorCalling {

	// Contsructor chaining->calling constructor from another constructor
	String name; // ->naveen->tom
	int age;
	double salary;

	public ConstructorCalling(String name) {
		this.name = name;
	}

	public ConstructorCalling(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public ConstructorCalling(String name, int age, double salary) {
		this("Naveen");// calling constructor->in this case const 1 will be called-> naveen
		this.name = name; // naveen will become tom here because local name has tom which is passed
		// if this.name is commented then the result will be naveen instead of tom
		this.age = age;
		this.salary = salary;
		// this("Naveen"); //Constructor call must be the first statement in a
		// constructor
	}

	public ConstructorCalling(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ConstructorCalling obj = new ConstructorCalling("Tom", 30, 23.33);
		System.out.println(obj.name); // result Tom

	}

}
