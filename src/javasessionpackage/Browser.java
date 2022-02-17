package javasessionpackage;

public class Browser {

	// Launch a browser
	// input parameter:name(string):FF/CH/S/IE
	// return: boolean
	public boolean launchBrowser(String name) {
		System.out.println("Browser name is :" + name);
		if (name.equals("Chrome")) {
			System.out.println("Launch Chrome");
			return true;
		} else if (name.equals("FF")) {
			System.out.println("Launch FF");
			return true;

		} else if (name.equals("Safari")) {
			System.out.println("Launch Safari");
			return true;

		} else if (name.equals("IE")) {
			System.out.println("Launch IE");
			return true;
		} else {
			System.out.println("Please enter the right browser");
			return false;
		}

	}
	

	public static void main(String[] args) {
		Browser br = new Browser();
		// br.luanchBrowser("Chrome");// this method is void so v dont need any holding
		// parameter
		if (br.launchBrowser("Chrome")) { // if v pass opera here test will be failed
			System.out.println("Browser is launched");
		} else
			System.out.println("Test Failed");
		
		
		

	}

}
