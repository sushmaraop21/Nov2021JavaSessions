package AccessModifiers;

public class QA extends Employee{

	public static void main(String[] args) {
		QA q=new QA();
		//same package sub class 
		q.name="Sushma"; //public
		q.city="Blore";// default
		q.dob="21-Feb";//protected
	//	q.salary -> cannot be accessed in the sub class/ child class as this is private
		
		//same package sub class
		q.getName("Vijju");//public
		q.getName();//default
		q.getDOB();//protected
		//v cant access private 
		
	}

}
