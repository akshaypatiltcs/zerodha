package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
@Test(invocationCount = 5)
	public void TC() {
		Reporter.log("running to",true);
	}
}
