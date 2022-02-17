package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		// Every class will have a default constructor which is created by java
		// internally, called hidden constr
		Employee e1 = new Employee(); // here java lets u to create an object for employee constru though v havent
										// created default const in Employee class

		// e1.name;// name is declared as private so v cant access it with e1

		e1.setName("Tom");
		e1.setAge(30);
		e1.setSalary(12.33);

		e1.setInfo("Naveen", 20, 20.90); // we r updating values here

		System.out.println(e1.getInfo()); // calling public method

		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());

	}

}
