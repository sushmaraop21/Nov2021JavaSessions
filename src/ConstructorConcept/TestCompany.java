package ConstructorConcept;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		// Company c1=new Company(); // i cant create a defualt const- thr is no default
		// const available

		Company c1 = new Company("Flipkart"); // when u create object with name only that const is called rest all the
												// values will be default values
		System.out.println(c1.name);// only name was given
		System.out.println(c1.empCount); // 0 will given
		System.out.println(c1.catList);// null

		Company c2 = new Company("Amazon", 10000);
		System.out.println(c2.name);
		System.out.println(c2.empCount);
		System.out.println(c2.sharePrice);

		ArrayList<String> wmList = new ArrayList<String>();
		wmList.add("Fashion");
		wmList.add("Electronics");
		wmList.add("Sports");
		Company c3 = new Company("WM", 20000, wmList, true, 200.22);// replace catList with wmList

		System.out.println(c3.name);
		System.out.println(c3.sharePrice);
		System.out.println(c3.empCount);
		System.out.println(c3.isFunded);
		System.out.println(c3.catList);
	}

}
