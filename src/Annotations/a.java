package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a {
	@BeforeClass
public void openbrowser() {
	Reporter.log("open the browser",true);
}
	
	@BeforeMethod
	public void loginApp() {
		Reporter.log("login to app",true);
	}
	
	@Test
	public void verifyID() {
		Reporter.log("verify username",true);
	}
	
	
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the app",true);
	}
	
	
	
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the browser",true);
	}
	
	
	
	
}
