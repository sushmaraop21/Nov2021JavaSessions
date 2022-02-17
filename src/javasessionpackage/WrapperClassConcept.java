package javasessionpackage;

public class WrapperClassConcept {

	// Assignment =>write a function which takes mesg n returns orderid
	
	public static String getOrderID(String message) {
		
		String orderID1= message.substring(message.indexOf("is")+3);
		return orderID1;	
		
	}
	

	public static void main(String[] args) {

//		String x1="100";
//		x1=x1+30;
//		System.out.println(x1);//10030

		String x = "100";
		System.out.println(x + 20);// 10020->stringconcat

		int i = Integer.parseInt(x); // Integer is a class and parseInt is a static method=>v call static methods
										// with class names
		System.out.println(i + 20);

//		String y="100A";
//		int k=Integer.parseInt(y);
//		System.out.println(k+30); //number format exception

		// Assignment=> remove A from the above 100A
		System.out.println("--Assignment----");
		String y = "100A";
		String y1 = y.substring(0, 3);
		System.out.println(y1);

		// string to double
		String total = "123.33";
		double d = Double.parseDouble(total);
		System.out.println(d + 10.33);

		// String to boolean
		String flag = "true";
		boolean fg = Boolean.parseBoolean(flag);
		if (fg) {
			System.out.println("run ur test");
		}

		// int to string-not with wrapper class

		int bal = 500;
		String b = String.valueOf(bal);
		System.out.println(b + 30);// string=>50030

		// substring
		String mesg = "Your order id is 12345";
		System.out.println(mesg.indexOf("is")); // 14
		// System.out.println(mesg.substring(mesg.indexOf("is")+1+1+1)); //is 12345
		String OrderId = mesg.substring(mesg.indexOf("is") +3);
		System.out.println(OrderId);

		String m1 = mesg.substring(1, 11); // =>this will include 1 to 10 and exclude 11->so gives 1 to 10
		System.out.println(m1);// our order

		
		//Assignment 
		String ordID= getOrderID("Your order id is 45678");
		System.out.println(ordID);
	}

}
