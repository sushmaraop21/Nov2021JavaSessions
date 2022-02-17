package AccessModifiers;

public class Employee {
	
	public String name;
	private int salary;
	String city;
	protected String dob;
	
	public void getName(String name) {
		
	}
	
//	default void get() { //only in interfaces
//		
//	}
	
	void getName() {
		
	}
	
	private void getSalary() {
		
	}
	
	protected void getDOB() {
		
	}

	public static void main(String[] args) {
		 int i=2; // local vars cannot be public/private/protected/static but can be applied final
	
		Employee e =new Employee();
		e.name="Sush";
		e.salary=20;
		e.city="LA";
		e.dob="12 jan";
		
		//same class
		e.getName("Sush"); //public
		e.getName();//default
		e.getSalary();//private
		e.getDOB();//protected
	}

}
