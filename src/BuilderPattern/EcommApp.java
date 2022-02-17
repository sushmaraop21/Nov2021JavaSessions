package BuilderPattern;

public class EcommApp {
	private int orderId;

	public EcommApp login() { // this method is returning current class object
		System.out.println("Login to app");
		return this;//current class object 	-->new EcommApp(); return this; avoids creating so many objects
	}

	public EcommApp login(String un, String pwd) {
		System.out.println("Login to app: " + un + ":" + pwd);
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("searching the product: " + productName);
		return this;
	}

	public EcommApp search(String productName, int price) {
		System.out.println("searching the product: " + productName + ":" + price);
		return this;
	}

	public EcommApp clickOnProduct(String productName) {
		System.out.println("click on the product" + productName);
		return this;
		
	}

	public EcommApp addToCart(String productName) {
		System.out.println("add to cart-->product " + productName);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv) {
		System.out.println("do payment :" + cc + ":" + cvv);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv, int otp) {
		System.out.println("do payment :" + cc + ":" + cvv + otp);
		return this;
	}

	public EcommApp doPayment(String upi) {// upi- like googlepay
		System.out.println("do payment :" + upi);
		return this;
	}

	public EcommApp generateOrder() { // disadvan-> v have to return int here but v r returning the entire object
		// so v cant just change the return type as it cant participate in the chaining
		System.out.println("Order id is " + 12345);
		this.orderId=12345; //v r returning this id
		return this;
	}
	public int getOrderId() {
		return this.orderId; // this method wont be participating in the builder pattern.can be called at the end of the pattern
	}

	public EcommApp sendOrderViaEmail() {
		System.out.println("Send order via Email and orderid" + 12345);
		return this;
	}
	public EcommApp logOut() {
		System.out.println("Logout the app");
		return this;
	}
}
