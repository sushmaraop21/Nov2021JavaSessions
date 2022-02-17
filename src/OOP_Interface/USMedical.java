package OOP_Interface;

public interface USMedical extends Medical{
	
	int min_fee=10; //by default->this is final and static 
	
	//no body method//only method declaration
	//only method prototype
	//only abstract method :no body
	//cannot create the object of interface
	//cannot have static abstract non static method.
	//100%abstraction without default method
	
//	public USMedical() { // Constructor of an interface is not possible where as for Abstract class its possible
//		
//	}
//	
	
	public void physioServices();
	public void cardioServices();
	public void oncologyServices();
	public void emergencyServices();
	
	@Override
	public void vaccination(); //overriding is possible in the child interface but of no use without body
	
	
	//After jdk1.8
	//1.can have static method with method body:
	public static void billing() { 
		System.out.println("USMedical...billing...");
	}

	//2.can have non static default method
	default void optServices() {
		System.out.println("USMedical...opt...");
	}
}
