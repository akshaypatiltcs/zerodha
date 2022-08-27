package assert_class_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asser_not_equals {
	@Test
	public void TC1() {
		Reporter.log("Tc1 is running",true);
		String expR="Anky";
		String actR="Anky";
		Assert.assertNotEquals(expR, actR);
}
}