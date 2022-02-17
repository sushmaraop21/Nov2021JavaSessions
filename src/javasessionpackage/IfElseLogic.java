package javasessionpackage;

public class IfElseLogic {

	public static void main(String[] args) {

		String browser = "Chrome";// if Opera is passed here then it goes to the last else condition
		if (browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		} else if (browser.equals("ff")) {
			System.out.println("Launch ff");
		} else if (browser.equals("Safari")) {
			System.out.println("Launch Safari");

		} else if (browser.equals("ie")) {
			System.out.println("Launch ie");
		} else {
			System.out.println("Pass the right browser");
		}

	}

}
