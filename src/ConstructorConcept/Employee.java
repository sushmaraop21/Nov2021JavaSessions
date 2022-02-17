package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String empId;
	String dept;

	// Const... name will remain same the class name.
	// const..will not have any return type/no void/no return keyword.
	// const..looks like a function but not a function
	// const..overloading is possible
	// default const. depends on use case..n number of objects

	// const vs func
	// 1.const name will remain same ..but function can be anything
	// 2. const will never have any return but function may or may not have
	// 3.const will be called when u create the object but the method will be called
	// with object reference
	// 4.const will help to create the object of the class n we can restrict
	// unnecessary object creation
	// 5.const should never have buisness logic and function should have the
	// business logic ,should define the feature of the class

	public Employee() {// 0 param
		System.out.println("default const....");
	}

	public Employee(int i) {
		System.out.println("1 param const..." + i);
	}

	public Employee(int i, String p) {
		System.out.println("2 param const.." + i + p);
	}

	public static void main(String[] args) {
		// 5.const will be called when u create the object
		// Employee e1=new Employee(); // here default const with no paramters will be
		// called
		// Employee e1=new Employee(10);// const with param will b called
		// Employee e1=new Employee("test");//The constructor Employee(String) is
		// undefined..here
		// const will except u to pass int and string both else it wont be called
		Employee e1 = new Employee(10, "test");
		Employee e2 = new Employee(10);
		Employee e3 = new Employee();

	}

}
