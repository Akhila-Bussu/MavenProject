package dws_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;
import DWS_Pages.DWS_LoginPage;

public class DWS_LoginTest {

	
	@Test
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
//		Create object from HomePage
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.clickRegister();
		
//		create object for LoginPage
		DWS_LoginPage lp=new DWS_LoginPage(driver);
		lp.enterEmail("akki@gmail.com");
		lp.enterpassword("12345");
		lp.clickSubmit();
		
		driver.close();
	}
}
