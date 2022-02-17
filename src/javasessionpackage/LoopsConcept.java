package javasessionpackage;

public class LoopsConcept {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i); // it always prints 1 in an infinite loop
			i++;// this increments i and gives 1 to 10
			// i=i+1;
			// ++i;
		}

		// while (true) // if v pass false here this complete loop will be unreachable
		// {
		// System.out.println("Welcome to the TAZ hotels");// infinite loop
		// }

		// System.out.println("Bye"); //unreachable code

		boolean flag = true;
		int num = 1;
		while (flag) {
			System.out.println("Welcome to the Taj hotels");
			num++;

			if (num == 5)
				break;// break cant be used for an if condition but only when it is associated
			// with a while loop break can b used.
		}

		// 2.While loop
		// 1 to 10
		// (int k=1;k<=10;k++) {
		// System.out.println(k);
		// }

		int k = 1;
		for (; k <= 10; k++) // this can b initilized like this as well, inrement can b later
		{
			System.out.println(k);
		}

		// INFINITE for loop example

		// for(;;) {
		// System.out.println("Hello");
		// }

		System.out.println("----------------------------");

		for (double d = 1.1; d <= 10.5; d++) {
			System.out.println(d);// will print till 10.1 come out of loop after 10.1
		}

		// Example for precision error value in loops .thats y double values are rare in
		// loops

//		for (double d1 = 1.1; d1 < +10.5;) {
//
//			System.out.println(d1);// will give precision values
//			d1 = d1 + 0.1;
//
//		}
//		
//		for(char c='a';c<='z';c++) {
//			System.out.println(c);// to print characters
//		}

		// to print ASCII values of charcters

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + ":" + (int) c); // 97 to122
		}

		// Assignment

		for (char c2 = 'A'; c2 <= 'Z'; c2++) {
			System.out.println(c2 + ":" + (int) c2); // 65 to 90
		}

		for (int odd = 1; odd <= 9; odd = odd + 2) {
			System.out.println(odd);
		}

		// Assignment

		// even numbers
		System.out.println("----Assignment-----");

		for (int even = 0; even <= 10; even++) {
			if (even % 2 == 0) {
				System.out.println("Even no " + even);

			}
		}
		for (int odd1 = 0; odd1 <= 10; odd1++) {
			if (odd1 % 2 == 1) {
				System.out.println("odd no " + odd1);
			}
		}

		for (int l = 1; l <= 100; l++) {
			System.err.println(l);
			if (l % 5 == 0) {
				System.out.println("Hi");
			}
		}

		// do-while loop

		int p = 1;
		do {
			//p++; //prints 2 to 11
			System.out.println(p);
			p++;
		}
		//while (p >= 10); //condition is not satisfied so it at least gets executed once
		while (p <= 10); // infinite loop

	}

}
