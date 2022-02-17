package ConstructorConcept;

public class Users {

	String name;
	int userId;
	boolean isPrime;
	String city;

	public Users(String name, int userId) {

	//	name=name;// local to local
		this.name=name; // this means this.class variable=local variable
		this.userId=userId;
	}
	// usecase says only company name can be given 
	public Users(String name) {

		this.name=name;
		}
	//requirement with the specified parameters 
	public Users(String name, int userId, boolean isPrime,String city) {
		this.name=name;
		this.userId=userId;
		this.isPrime=isPrime;
		this.city=city;
		
	}

	public static void main(String[] args) {

	//	Users u1 = new Users();// The constructor Users() is undefined (without the parameterss) it cant be
								// called

		Users u1 = new Users("Tom",100);// tom will be given to the name and 100 to usedId in the const
		System.out.println(u1.name); // gives null
		System.out.println(u1.userId);// 0 .. default values of class variables
		System.out.println(u1.isPrime);//false
		System.out.println(u1.city); //null default values
		
		//Users u2=new Users();// so end user will b restricted from creating unnecessary objects
		//whenever u create an object u have to pass 2 parameters -use of const-
		//unnecessary creating of objects will fill up the heap memory
		
		Users u2=new Users("Naveen");
		Users u3=new Users("Nikki",200,true,"Bangalore");
		System.out.println(u3.name+""+u3.userId+""+u3.isPrime+""+u3.city);
		
	}

}
