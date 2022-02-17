package AccessModifiers2;

import AccessModifiers.Employee;

public class Dev extends Employee {

	public static void main(String[] args) {
		
		Dev d=new Dev();
		d.name="vijju"; //public
		d.dob="12-06";//protected
	//	d.salary-> private
	//	d.city->default
		
		//diff package sub class->cant access default n private
		d.getName("Sush");//public
		d.getDOB();//protected
	}

}
