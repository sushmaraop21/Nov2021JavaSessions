package javasessionpackage;

//Method overloading

//when we have diff methods
//1.within the same class
//2.with the same name
//3.with diff parameters
//4.with diff seq/order of  parameters

//Method overloading is also called as polymorphism ->compiled time /static polymorphism

public class Ecomm {

	public int test() {
		System.out.println("test method");
		return 10;
	}

	public void test(int i) { // this is allowed
		System.out.println("test method: " + i);
		// return "IBM";
	}

	public void test(String i) { // this is allowed
		System.out.println("test method: " + i);

	}

	public void test(int i, int j) { // this is allowed
		System.out.println("test method: " + (i + j));

	}

//	public void test(int j, int i) { // this is  not allowed
//		System.out.println("test method: "+(i+j));
//
//	}
	public void test(int i, double j) { // this is allowed
		System.out.println("test method: " + (i + j));

	}

	public void test(int i, String j) { // this is allowed
		System.out.println("test method: " + (i + j));

	}

	public void test(String i, int j) { // this is allowed
		System.out.println("test method: " + (i + j));

	}

	// practical eg: ecomm for method overloading
	public void login() {

	}

	public void login(String userName, String pwd) {

	}

	public void login(String userName, String pwd, String userRole) {

	}

	public void login(String userName, String pwd, long phoneNumber) {

	}

	public void login(String socialMEdiaAcc, int otp) {

	}

	// search
	public void search() {

	}

	public void search(String prodName) {

	}

	public void search(String prodName, String color) {

	}

	public void search(String prodName, String color, int price) {

	}

	// payment
	public void doPayment(String upi) {

	}

	public void doPayment(String upi, int otp) {

	}

	public void doPayment(String cc, String pwd) {

	}

	public void doPayment(String payPal, String pwd, int otp) {

	}

	// uber booking
	public void booking() {

	}

	public void booking(String st, String end) {// location start n end

	}
	public void booking(String st, String end, String carType) {

	}
	public void booking(String st, String end, String carType,int users) {

	}
	
	public static void main(String[] args) {
		Ecomm obj = new Ecomm();
		int n = obj.test();
		System.out.println(n);
		
	}

}
