package javasessionpackage;

public class ConditionalOperators {

	public static void main(String[] args) {

		// byte b = 065;
		// System.out.println(b); //53
		/*
		 * A number which is starting with zero is treated as Octal number. Conversion
		 * to Octal number , the base of octal number is 8
		 */

		int a = 10;
		int b = 20;

		System.out.println(a == b);
		if (a == b) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail");
		}

		if (true)
			System.out.println("Hi");
		else {
			System.out.println("Bye"); // Deadcode as else is always not reachable
		}

		boolean flag = true;
		if (flag) {
			System.out.println("Selenium");
		} else {
			System.out.println("UFT");// here in this case this is not dead code as flag value can be manipulated

		}
		double d1 = 12.33;
		double d2 = 12.34;
		if (d1 == d2) {
			System.out.println("both are equal");
		} else {
			System.out.println("both r not equal");
		}
		String s1 = "Hello";
		String s2 = "Hello";
		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		String s11 = "Hello";
		String s12 = "hello"; // v tested "Hello " first n then changed to hello
		if (s11.equals(s12)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");// in this case its Not equal cos of SPACE in s12
		}

		if (s11.equalsIgnoreCase(s12)) {

			System.out.println("equal");

		}

		if (s11 == s12) {
			System.out.println("PASS");
		}

		else {
			System.out.println("Fail");// Fail but we never use '==' for string comparison

		}

		int total = 95;// if 85 it will print Grade A

		if (total <= 100) {

			if (total >= 95) {
				System.out.println("A++");
			} else {
				System.out.println("Grade A");// in this case it prints both A++ and Grade A which is illogical
			}
		}

		String browser = "Chrome";
		if (browser.equals("Chrome")) {
			System.out.println("Lunch Chrome");
		}
		if (browser.equals("ff")) {
			System.out.println("Lunch ff");
		}
		if (browser.equals("safari")) {
			System.out.println("Lunch Safari");
		}
		if (browser.equals("ie")) {
			System.out.println("Lunch ie");
		} else {
			System.out.println("Please pass the right browser");//
		}
		// In this case it will always print first if condition and else as well
		// as the else is tied to the last if condition . which is v bad code

	}

}
