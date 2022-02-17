package javasessionpackage;

public class MainMethodOverloading {

	// jvm always calls this main method: always looks for the same signature
	public static void main(String a[]) { //if u try this void to string u cant execute .cos no srarting point for execution
		System.out.println("main method....");
		System.out.println(main(10));// this will call the next method and print 10
		main(10, 20);
	}

//	public static void main(String[] args) { //main method overloading
//		System.out.println("main method....");
//
//		}
	public static int main(int a) {
		System.out.println("main method...." + a);
		main(20,30);
		return 100;

	}

	public static void main(int a, int b) {
		System.out.println("main method...." + (a + b));

	}

}
