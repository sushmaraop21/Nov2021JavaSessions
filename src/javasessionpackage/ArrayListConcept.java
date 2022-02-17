package javasessionpackage;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Collection
		// ArrayList is a default class
		// Dynamic Array

		// object of ArrayList

		ArrayList ar = new ArrayList();// vc=10

		System.out.println(ar.size());// 0
		ar.add(100); // 0
		ar.add(200); // 1
		System.out.println(ar.size());// 2

		ar.add("Tom");// 2
		ar.add('m');// 3
		System.out.println(ar.size());// 4

		// li=0
		// hi=3 - current HI
		// len/size= Hi+1=4
		ar.add(300);// 4
		System.out.println(ar.size());// 5

		System.out.println(ar.get(0));// 100
//		System.out.println(ar.get(-1));//IOB exception Java doesnt allow -ve index,python does
//		System.out.println(ar.get(5));//IOB  -> ar.get is always checked on p.c not virtual

		System.out.println("---------------");

		ArrayList ar1 = new ArrayList(20);// vc=20
		ArrayList ar2 = new ArrayList(5);// vc=5

		ar2.add(100); // 0
		ar2.add(100); // 1
		ar2.add(null);// 2
		ar2.add(null);// 3

		System.out.println(ar2.size()); // 4
		System.out.println(ar2.get(0));// 100
		System.out.println(ar2.get(1));// 100 yes u can have duplicate values
		System.out.println(ar2.get(2)); // null values can be stored
		System.out.println(ar2.get(3)); // null values can be also duplicated

		ar2.add(4, 200);
		// ar2.add(9, 1000); //Java wont allow you to add the value itself.
		System.out.println(ar2.get(4)); // 200
		// System.out.println(ar2.get(9)); //IOB exception

		ar2.add(3, 1100);
		System.out.println(ar2.get(3)); // null will be replaced by this 1100

		ArrayList prod = new ArrayList();
		prod.add("A"); // 0
		prod.add("B"); // 1
		prod.add("C"); // 2
		prod.add("D"); // 3
		prod.add("E"); // 4

		System.out.println(prod.size()); // 5
		System.out.println(prod.get(3));// D
		prod.remove(3); // Removed the segment so D is removed
		System.out.println(prod.size()); // 4
		System.out.println(prod.get(3)); // E so E will be shifted to position D

		// int Arraylist
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);

		ArrayList<Double> sal = new ArrayList<Double>();

		ArrayList<String> emplist = new ArrayList<>();
		emplist.add("Tom");
		emplist.add("123");
		emplist.add("Naveen");
		emplist.add("Naveen");
		emplist.add("Naveen");
		
		//we can directly print on the console without for loop
		System.out.println(emplist); //[Tom, 123, Naveen, Naveen, Naveen]

		//for each loop
		System.out.println("-----------Foreach loop---------------");
		for(String e:emplist)	{
			System.out.println(e);
		}
		
		
		// Name,age,sal,gender,boolen
		// Object ArrayList:
		// If you define generics it might effect the compile time and might impact the
		// performance of the script

		ArrayList<Object> empdata = new ArrayList<Object>();
		empdata.add("Tom"); // 0
		empdata.add(30);// 1
		empdata.add('m');// 2
		empdata.add(12.33);// 3
		empdata.add(true);// 4

		// to print all the values from the ArrayList
		for (int i = 0; i < empdata.size(); i++) {
			System.out.println(empdata.get(i));
		}
		
		//foreach
		System.out.println("------------");
		for (Object e : empdata) {
			System.out.println(e);
			if(e.equals('m')) {
				System.out.println("Male employee");
				
//				if(e==30) {   // e is object and 30 is int primitive datatype
//									
//				}
			}
		}
		System.out.println(empdata); // in static array v use arrays.tostring

	}

}
