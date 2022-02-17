package javasessionpackage;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// 1.int Array

		int a[] = new int[4];

		// li=0;
		// len=4;
		// hi=len-1;-->3
		// len=hi+1;-->4

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		// a[4]=50;// Exception -it wont reach to line 24 cos array length is only 3
System.out.println("int Array:");
		System.out.println(a[0]);
		System.out.println(a[3]);
		// System.out.println(a[4]);//ArrayIndexOutOfboundException - doesnt exist in
		// memory
		// System.out.println(a[-1]);// Exception --same thing is possible in python(-ve
		// index)
		System.out.println(a[0] + a[2]);

		System.out.println(a.length);
		int len = a.length;

		// to print all the values of array- index based for loop
		for (int i = 0; i < len; i++) { // if u wana use i<=length-1;
			System.out.println(a[i]);
		}

		// for each loop: enhanced loop
		for (int e : a) {
			System.out.println(e);
		}

		System.out.println(a);// memory hash code value
		System.out.println(Arrays.toString(a)); // [10,20,30,40] result

		// 2.double array
System.out.println("Double Array:");
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;

		for (double e : d) { // variable e is only in the scope of this for loop.v can use e again
			System.out.println(e); //
		}
		System.out.println(Arrays.toString(d)); // [12.33, 23.44]

		//Assignment index based for loop 
		System.out.println("assign-double");
		System.out.println(d.length);

		double dlen = d.length;
		for (int i = 0; i < dlen; i++) {

			System.out.println(d[i]);
		}

		// 3.Char Array
System.out.println("Char Array :");
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '1';
		System.out.println(c[0] + c[1]);// 97+98=195
		
		//Assignment -for each
		System.out.println("Assign:Char");
		for(char e:c) {
			System.out.println(e);
		}
		//Assignment -index based
		
		System.out.println("Length "+c.length);
		
		int charlen = c.length;
		for(int i=0;i<charlen;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println(Arrays.toString(c));

		// 4.String Array
System.out.println("String Array :");
		String emp[] = new String[3];

		emp[0] = "Sushma";
		emp[1] = "Vijay";
		emp[2] = "Adhvik";

		for (String e : emp) {
			System.out.println(e);
		}

		System.out.println(Arrays.toString(emp)); // [Sushma, Vijay,Adhvik]
		//Assignment index based for loop
		
		System.out.println("String-Assign-index based for loop: ");
		
		int elen=emp.length;
		for(int i=0;i<elen;i++) {
			System.out.println(emp[i]);
		}
		
		// 5.Object Array

		Object st[] = new Object[5];// Object is a class where u can store all kinds of data
		st[0] = "Sushma";// String type of data
		st[1] = 30;// int
		st[2] = 35.55;// double
		st[3]= 'f';//char
		st[4]=true;//boolean
		
		for(Object e:st) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(st)); // [sushma,30,35.55,f,true]
		
			System.out.println("-----------");
			//another employee
			Object st1[]=new Object[5];
			st1[0]="Swathi";
			st1[1]=30;
			st1[2]=35.64;
			st1[3]='f';
			st1[4]=false;
			
			for(Object e:st1) {
				System.out.println(e);
			}
			
			System.out.println(Arrays.toString(st1));
							
			//So if we have 100 employees v have to add 100 data of employees.v might even 
			// need to add more data to each emp like phone n fax,address etc
			//to overcome this repetitive work creating more objects v can use dynamically 
			//using Arraylist and classes.
			
			//Assignment index based for loop
			
			System.out.println("Index based for: ");
			
			int stlen=st.length;
			for(int i=0;i<stlen;i++) {
				System.out.println(st[i]);
			}
			
			 
			//default values
			//int=0
			//double=0.0
			//boolean=false
			//char=space
			//string=null
			
		
		

	}

}
