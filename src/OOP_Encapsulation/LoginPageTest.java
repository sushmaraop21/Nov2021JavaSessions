package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {

		// user1-naveen
		LoginPage u1 = new LoginPage("naveenauto", "test123");
		System.out.println(u1.getUsername());
		System.out.println(u1.getPassword());

		// user2 -sushma
		LoginPage u2 = new LoginPage("sushma", "sushma123");
		System.out.println(u2.getUsername());
		System.out.println(u2.getPassword());

		// sushma user wants to chnage/update pwd
		u2.setPassword("selemium123");
		System.out.println(u2.getUsername());
		System.out.println(u2.getPassword()); // selenium123

		u2.doLogin(u2.getUsername(), u2.getPassword()); // user chnaged pwd and trying to login again, so v calling buss
														// method
		LoginPage u3 = new LoginPage("naveenauto", "test123");
		u3.doLogin();

		Browser br = new Browser();
		// br.launchBrowser(); // when the methods r public u can see everthying with
		// the object
		br.launchBrowser(); // now the methods r made private in the browser class so v get to see access
							// the public method
	}

}
