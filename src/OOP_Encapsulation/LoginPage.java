package OOP_Encapsulation;

public class LoginPage {

	private String username;
	private String password;

	public LoginPage(String username, String password) {

		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// business feature:public method:
	public void doLogin(String username, String password) {
		System.out.println("Enter username " + username);
		System.out.println("Enter password " + password);
		System.out.println("click on login button");
		System.out.println("login is done");
	}
	public void doLogin() { 
		System.out.println("Enter username " +this.username);
		System.out.println("Enter password " + this.password);
		System.out.println("click on login button");
		System.out.println("login is done");
	}
	
}
