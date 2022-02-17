package OOP_Abstract;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("LP---default const..");
	}
	public LoginPage(int i) {
		System.out.println("LP--one param const---"+i); 
	}
	@Override
	public void title() {
		System.out.println("LoginPage----Title");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage----url");
		
	}
	@Override //override has to maintain same number of paramters
	public void doLogin(String un,String pwd) { 
		System.out.println("LoginPage ..login...");
	}
	public void forgotPwd() {
		System.out.println("forgot pwd...");
	}
	@Override
	public void loading() {
	System.out.println("LP--loading in 10 secs---");	
	}
//	@Override
//	public void javascriptLoading() { //cannot override as it was made final in page.so it just can be inherited
//		System.out.println("LP--jsloading---");
//		
//	}

}
