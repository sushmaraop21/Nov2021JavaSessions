package FinalizeMethod;

public class Employee {

	String name;

	public static void main(String[] args) {
		// if u comment this 2 below lines system.gc wont be invoked cos java will
		// always check for any objects to be destroyed.
		Employee e = new Employee();
		e = null;
	
		Company c = new Company(); // for this class also v need to have finalize method ..this finalized method is
									// for Employee class
		c = null;
		System.gc(); // if this is commented finalize method wont be called

		// e.name="Tom"; NPE
		// System.out.println(e.name);
		System.out.println("this is employee class");

	}

	@Override
	public void finalize() { // this method will be called by java
		System.out.println("Finalize method....emp class");
	}

}
