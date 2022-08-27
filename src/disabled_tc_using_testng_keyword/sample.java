package disabled_tc_using_testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {

	@Test
	public void TC1() {
		Reporter.log("hi",true);
	}

	@Test
	public void TC2() {
		Reporter.log("hi",true);
	}

	@Test(enabled = false) //class level change using testng keyword enable=false
	public void TC3() {
		Reporter.log("hi",true);
	}
}
