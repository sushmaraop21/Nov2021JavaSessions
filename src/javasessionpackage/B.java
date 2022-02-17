package javasessionpackage;

public class B {

	public static void main(String[] args) {
		System.out.println("---B main----");
		//A.main(args); //StackOverflowError ->this is an eg of memory leakage
	}

}
