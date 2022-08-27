package POM_DDF_with_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2 {
	//declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement Pin;
		@FindBy(xpath="//button[.='Continue ']")private WebElement CtnBtn;
		
		
		//initialization
		public KiteLogin2(WebDriver driver) {
		PageFactory.initElements( driver ,this);
		
	}
		
		//utilization
		public void enterPin(String pin) {
			Pin.sendKeys(pin);
			
			
		}
	public void clickCtnBtn() {
		CtnBtn.click();
	}
	}

