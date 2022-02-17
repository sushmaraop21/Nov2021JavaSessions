package javasessionpackage;

public class SwitchCaseLogic {

	public static void main(String[] args) {

		String browser = " CHR OME ";// Negative test scenario pass Opera it goes to default
		// in this case Chrome can be passed in caps or with spaces
		// we dont need to use trim if we are using replace function
		switch (browser.toLowerCase().trim().replace(" ", "")) {
		// switch(key) ..so case key is browser and case wud be Chrome
		case "chrome":
			System.out.println("Launch chrome");
			break;// if you dont break the case it goes to each and every case and even default
		case "ff":
			System.out.println("Launch ff");
			break;
		case "Safari":
			System.out.println("Launcg Safari");
			break;
		case " ie":
			System.out.println("Launch ie");
			break;

		default:
			System.out.println("Please pass the right browser " + browser);// its not mandatory to write a break
			break;
		}

		int total = 100; // test passing 90,80 but not for 79..so switch is ineffective such scenarios
		switch (total) {
		case 100:
			System.out.println("A++");
			break;
		case 90:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		default:
			System.out.println("FAIL");
			break;
		}
		// we cannot use conditions and or operators in switch cases.So if else case
		// would be
		// ideal in this scenario to print grades.else v need to

		// Switch case real world examples
		// user level Arbac / permission
		// different test environments
		// Cross browser logic
		// Cross devices mobile testing diff devices etc
		// Cross cloud:MS, AWS,Local,Docker,GCP
		// localization multi languages

		String x = "Admin";// this is my example

		switch (x) {
		case "Admin":
			System.out.println("Admin");
			break;
		case "User":
			System.out.println("User");
			break;
		default:
			System.out.println("Select appropriate user level");
			break;
		}

	}

}
