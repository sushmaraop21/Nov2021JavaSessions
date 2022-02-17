package WebDriver_Arch;

public class RemoteWebDriver implements WebDriver {

	@Override
	public void findElement() {
		System.out.println("FE");
		
	}

	@Override
	public void findElements() {
		System.out.println("FEs");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Enter URL");
		
	}

	@Override
	public String getTitle() {
		
		return "someTitle";
	}

	@Override
	public String geturl() {
		// TODO Auto-generated method stub
		return "hhtps://www.abc.com";
	}

	@Override
	public void click() {
		System.out.println("Click on the element");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Enter URL"+value	);
		
	}

	@Override
	public void close() {
		System.out.println("Close the browser");
		
	}
	

}
