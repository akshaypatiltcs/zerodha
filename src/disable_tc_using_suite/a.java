package disable_tc_using_suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a {
	@Test
	public void TC1() {
		Reporter.log("hi",true);
	}

	@Test
	public void TC2() {
		Reporter.log("hi",true);
	}

	@Test
	public void TC3() {
		Reporter.log("hi",true);
	}
}
