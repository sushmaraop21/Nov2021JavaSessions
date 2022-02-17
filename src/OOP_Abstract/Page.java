package OOP_Abstract;

//Page is extending webpage and page is implementing W3C
public abstract class Page extends WebPage implements W3C{

	// 0 to 100% abstraction (where as Interface 100% abstarction with default
	// method)
	// 0%-> no abstract methods
	// 100%only abstract methods
	// partial abstraction
	// cannot create the object of abstract class(just like interface)
	//but can create the constructor of abstract class and it will be invoked when u create the object of child class.
	
	public Page() { // 
		System.out.println("Page --default const---"); //parent adn then child const called
	}
	public Page(int i) {
		System.out.println("Page--one param const---"+i); 
	}
	public abstract void title();

	public abstract void url();

	public void doLogin(String un, String pwd) {
		System.out.println("Page ..login...");
	}

	//cannot be overridden
	// this made static->v can avoid creating the object and v dont this copy to go
	// to each page ,same logo everywhere has to be maintained
	public static void logo() {
		System.out.println("Page----logo");
	}

	//this is final because one copy can be given to each page and can be prevented from overriding
	public final void calculatePrice() {
		System.out.println("Page---calculate price----");
	}
	@Override
	public void loading() {
	System.out.println("page--loading---");	
	}
	@Override
	public final void javascriptLoading() {
		System.out.println("Page--jsloading---");
		
	}

}
