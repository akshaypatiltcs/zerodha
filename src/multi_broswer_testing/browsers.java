package multi_broswer_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browsers {
	@Parameters("browsername")  //annotation
	@Test
	public void TC(String browsername) {  //parametrized method
		
		//declare global variable
		WebDriver driver=null;  //runtime polymorphism
		//aaply conditions
		if(browsername.equals("Chrome")) {
		
		//for chropme browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Good Day\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("https://google.com");

	}
		else if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Good Day\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
	 driver=new FirefoxDriver();
			driver.get("https://amazon.com");

		}
			
		}
		
		
	
	
	
	
	
	
	
	
	
	
}
