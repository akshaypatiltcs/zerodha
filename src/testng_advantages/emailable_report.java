package testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report {
	@Test
public void TC() {
	Reporter.log("Hii",true);
}
}
