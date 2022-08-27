package POM_DDF_with_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome {
	//declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement ID;
		
		//initialization
		public KiteHome(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		//utilization
		
		
		
		//below 3 lines method is called as method with returntype 
		public String verifyID() {

		String actID = ID.getText();
		return actID;
		
	}
	}

