 package javasessionpackage;

public class StringConcat {

	public static void main(String[] args) {

		String x = "Hello";
		String y = "World";
		System.out.println(x+y);
		
		int a = 100;
		int b = 200;
		double d1 = 12.33;
		double d2 = 23.44;
		
		System.out.println(a+b);
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//HelloWorld100200 because the execution starts from left to right
		System.out.println(x+y+(a+b));//HelloWorld300
		System.out.println(d1+d2);
		System.out.println(b-a);
		System.out.println(b/a);
		System.out.println(a*b);
		System.out.println(x+y+d1+d2+a+b);//concatination 
		System.out.println(x+y+(d1-d2+a+b));
		
		int h12 = 10;
		int p	= 2;
		System.out.println(h12/p);
		System.out.println(9/3);
		System.out.println(9.0/3);//3.0 // either of one is decimal or float value
		System.out.println(9.0/3.0);//3.0
		System.out.println(9/3.0);
	//	System.out.println(9/0); //Arithmetic exception 
		System.out.println(9.0/0);//Infinity divide a float or double value
		System.out.println(8.33/0);
		System.out.println(9/0.0);//infinity
	//	System.out.println(0/0);//Arithmetic exception
		System.out.println(0.0/0.0);//NaN Not a Number
		System.out.println(0/9);//0
		System.out.println(0/12.33);// 0.0 one of the nuber is decimal
		System.out.println(0.0/9);//0.0 one of the number is decimal or float
		System.out.println(8%2);//0
		System.out.println(9%2);//1 reminder of 9 mod 2
		System.out.println(901%2);//1 
		System.out.println(9.2%2);//1.1999999999993  ideally it should be 1 but this is precision
		//error problem with decimal
		System.out.println(0.1+0.3);
		System.out.println(0.2+0.3);
		System.out.println(0.1+0.4);
		System.out.println(0.1+0.2);//0.3000000000000004 decimal precision error 
		//with all programming languages
		
		
		
		
		
		
				
				
	}

}
 