package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	//Abstract methods:
	public void get(String url) ;
	
	public String getTitle();
	
	public String geturl();
	
	public void click();
	
	public void sendKeys(String value);
	
	public void close();
	
	
}
