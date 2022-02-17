package OOP_Encapsulation;

public class Browser {
	public void launchBrowser() {
		System.out.println("trying to launch chrome..");
		checkOSCompatible(); // methodchaining, can call methods in the same class
		checkBrowserVersion();
		enoughRAM();
		isBrowseUpgraded();
		System.out.println("Chrome is launched..");
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void enoughRAM() {
		System.out.println("enoughRAM");
	}

	private void isBrowseUpgraded() {
		System.out.println("isBrowseUpgraded");
	}
}
