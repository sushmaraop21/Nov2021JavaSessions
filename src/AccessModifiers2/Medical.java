package AccessModifiers2;

import AccessModifiers.Employee;

public class Medical {

	public static void main(String[] args) {
	
		Employee e=new Employee();
		
		e.name="Vijju";//public
		// v cant access default,protected,private from diffrent package non subclass
		
		//diff package non sub class
		e.getName("sush");//public

	}

}
