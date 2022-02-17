package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "chrome";// if ie s passed here

		// ChromeDriver driver=new ChromeDriver(); // this is 1st type of top casting
		// FireFoxDriver driver=new FireFoxDriver(); //usability->same methods
		// SafariDriver driver=new SafariDriver();
		// unnecessary commenting ->instead v can use top casting

		WebDriver driver = null;
		//RemoteWebDriver driver=null;//this is assignment with RWD ref var
//cross browser logic with top casting .. parallel execution is always best with top casting
		if (browser.equals("chrome")) {
			driver = new ChromeDriver(); // this is 2nd top casting->WebDriver driver=new ChromeDriver();
		//	driver=new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FireFoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else
			System.out.println("please pass the right browser..");

			
		driver.get("http://www.amazoncom"); // if IE is passed then it goes to else n driver=null..so we get NPE
		String title = driver.getTitle();
		System.out.println("page title :" + title);

		String url = driver.geturl();
		System.out.println("url :" + url);

		driver.findElement();
		driver.findElements();

		driver.sendKeys("naveen.gmail.com");
		driver.sendKeys("test123");
		driver.click();

		driver.close();

	}

}
