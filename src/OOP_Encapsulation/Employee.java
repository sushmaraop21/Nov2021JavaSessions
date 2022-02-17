package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;// nobody can see this salary outside the class

	// getter/setter

	// with the constructor ->every time we have create the object then v can call the constructor
	//with the function- v can call anytime
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getInfo() { // this is also encapsulation ..this public layer accessing private members
		return name + ":" + age + ":" + salary;
	}
	public void setInfo(String name, int age, double salary) { // this is acting like a constructor here
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

}
