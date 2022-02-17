package FinalizeMethod;

public class Company {

	String cName;
	@Override
	public void finalize() { // this method will be called by java
		System.out.println("Finalize method....Company");
	}
	
	//practical usecase
	//DB connection
	//make the db connection -connected
	//hit the sql query- exception
	//get the result from db -exception 
	//finally{
	//close the db connection -(db connection shloud be closed so incase of exception or success v shud close this
	//}
	
	//finalize():
	//launch a browser:
	//fill the form on login page
	//driver=null
	//finalize{
		//clean up activity or
		//reinitialize the driver(driver=new driver) or
		//driver.quit() or
		//shut down the selenium server
		//}

}
