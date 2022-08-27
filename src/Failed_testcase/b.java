package Failed_testcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class b {
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
	
	//fot making testcase fail use assert.fail
		Assert.fail();
	
	
	}
}
