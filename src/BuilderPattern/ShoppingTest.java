package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		//user1
		EcommApp e1=new EcommApp();
//		e1.Login();
//		e1.search("Imac"); v can achieve this with builder pattern 
		
		
		// in the below pattern  v r creating the object only once->chain of actions 	
		
		//v r creating multiple usecase cos u never know when the user wants to login n other stuff
		//uc1
		e1.login("naveen.gmail.com","test123") // mouseover-> returning current class object
			.search("imac")
				.addToCart("imac")
					.doPayment("123 333 222 222", 212)
						.generateOrder()
							.sendOrderViaEmail()
								.logOut();
		
		//uc2- this time user already logged in- so not logging with credentials
		e1.login()
			.search("nike Shoes")
				.logOut(); // i dint like any product so user just logged out 
		
		//uc3:
		e1.login("admin", "test12")
			.logOut();
		
		//uc4:
		int id=e1.login("Tom@gmail.com", "tom123")
			.search("macbook pro")
				.addToCart("macbook pro")
					.search("ipad")
						.addToCart("ipad")
							.search("apple pencil")
								.doPayment("naveen@hdfc")//upi
									.generateOrder()
										.sendOrderViaEmail()
											.logOut()
												.getOrderId(); //this s breaking the chain
													System.out.println(id);
				
		//user 2 - every user is different and v need to create a diff object
		EcommApp e2=new EcommApp();
		
	}

}
