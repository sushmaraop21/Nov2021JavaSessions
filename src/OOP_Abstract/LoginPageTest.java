package OOP_Abstract;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.doLogin("admin", "admin");
		lp.forgotPwd();
		lp.calculatePrice();// inherited method
		lp.loading();//overridden so goes to page--loading---
		//no the lp class also has overriddenmethod so it goes to LP loading
		lp.javascriptLoading();
		
		Page.logo(); // static so with classname
		

//	Page p=new Page(); //objects cannot be created for Abstract class and interfaces

		// top casting
		Page p = new LoginPage();
		p.url();
		p.title();
		p.doLogin("admin", "admin");
		p.calculatePrice();
		// p.forgotpwd(); type ref check

		//down casting: u cant create the objecrt itself for abstract class

	}

}
