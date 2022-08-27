package POM_DDF_with_Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class KiteTest {
	
	//declared variable globally
	Sheet sh;
    WebDriver driver;
    KiteLogin1 log1;
    KiteLogin2 log2;
	KiteHome home;
    
    
    
	@BeforeClass  //open the browser
	public void openBrowser() throws Throwable{
		FileInputStream fis=new FileInputStream("C:\\Users\\Good Day\\Desktop\\Book1.xlsx");
	 sh = WorkbookFactory.create(fis).getSheet("Book1");
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Good Day\\Desktop\\chromedriver_win32\\chromedriver.exe");
					
				 driver=new ChromeDriver();
					driver.get("https://kite.zerodha.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//call objects of POM class
				
				 log1=new KiteLogin1(driver);			
				 log2=new KiteLogin2(driver);
				 home=new KiteHome(driver);
				
	}
	@BeforeMethod
	public void logintoapp() {
		//un
		String username = sh.getRow(0).getCell(0).getStringCellValue();//dpg458
		log1.enteruserID(username);
		
		//enter pass
		String pass = sh.getRow(0).getCell(1).getStringCellValue();
		log1.enterPass(pass);
		//click on login button
		log1.clickLgnBtn();
		
		//enter pin
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		log2.enterPin(pin);
		
		//clcik on continue button
		log2.clickCtnBtn();
			
	}
	@Test
	public void verifyID() {
		Reporter.log("running verify user ID",true);
		
		String actID = home.verifyID();
		String expID=sh.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(expID, actID,"both are different");
	}
	@AfterMethod
	public void logoutApplication() {
		Reporter.log("logout the application",true);
		
	}
	
	@AfterClass
	public void closetheBrowser() {
		Reporter.log("close the browser",true);
		driver.close();
	}
	
	
	
	
	
	
}
