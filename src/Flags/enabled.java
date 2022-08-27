package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	public class Priority {
		@Test(priority = 4)
			public void TC2() {
				
				Reporter.log("hi",true);
				
			}
		@Test(priority = 3)
		public void TC1() {
			Reporter.log("how r u",true);
		}
		@Test(priority = 1)
		public void TC3() {
			Reporter.log("fine",true);
		}
		
		//enable=false is used
		@Test(enabled =false)
		public void TC4() {
			Reporter.log("bye",true);
		}
}
}
