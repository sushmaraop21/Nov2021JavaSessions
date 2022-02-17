package AccessModifiers;

public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Adhu"; // public
		e.city = "Nsshville";//default
		e.dob="10-9";//protected
	//	e.sal private->cant be accessed
		
		//same package non subclass
		e.getName("Adhu");//public
		e.getName();//default
		e.getDOB();//protected
	}

}
