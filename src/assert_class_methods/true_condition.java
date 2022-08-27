package assert_class_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class true_condition {
	@Test
	public void TC3() {
		Reporter.log("running TC3",true);
		boolean actR=true;
		Assert.assertTrue(actR);
}
}
