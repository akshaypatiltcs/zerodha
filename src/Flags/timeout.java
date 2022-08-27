package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {

	@Test(timeOut = 8000)
	public void TC() {
		Reporter.log("hi",true);
	}
}
