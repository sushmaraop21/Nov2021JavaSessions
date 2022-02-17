package javasessionpackage;

public class Page {

	//Method Chaining concept
	public void m1() {
		System.out.println("m1");
		m2(); // v dont need to create an object for this class as they r in the same class
		//v can do this even with static methods n its called recurssive method
	}
	public void m2() {
		System.out.println("m2");
		m3();
	}
	public void m3() {
		System.out.println("m3");
		Page.t2();// v dont need object for this. v can use class name
	}
	
	public static void t1() {
		System.out.println("t1");
		t2(); 
		//m1();//Cannot make a static reference to the non-static method m1() from the type Page
				// so we create object. whenever u calling non static method from static
		Page p2=new Page();
		p2.m1();
	}
	public static void t2() {
		System.out.println("t2");
		t3();
	}
	public static void t3() {
		System.out.println("t3");
	}
	
	// all the static methods and main method will be given to the CMA/metaspace
	public static void main(String[] args) {
		Page p1=new Page();
		p1.m1();
		Page.t1();
	}

}
