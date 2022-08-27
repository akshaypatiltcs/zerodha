package POM_DDF_with_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1 {
	// declaration
		@FindBy(xpath="//input[@id='userid']")private WebElement userID;
		@FindBy(xpath="//input[@id='password']")private WebElement Pass;
		@FindBy(xpath="//button[.='Login ']")private WebElement LgnBtn;
		
		//Initialisation
		public KiteLogin1(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
		
		//Utilisation
		public void enteruserID(String userid) {
			userID.sendKeys(userid);
		}
		public void enterPass(String password) {
		Pass.sendKeys(password);	
	}
		public void clickLgnBtn() {
		LgnBtn.click();

		
	}
	}

