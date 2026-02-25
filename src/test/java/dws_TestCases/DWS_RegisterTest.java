package dws_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;
import DWS_Pages.DWS_RegisterPage;

public class DWS_RegisterTest {

	
	@Test
	public void registerPage() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
//		Create object of HomePAGE
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.clickRegister();
		
//		create object of RegisterPage
		DWS_RegisterPage reg=new DWS_RegisterPage(driver);
		reg.clickGender();
		reg.enterFname("Akhila");
		reg.enterLname("Reddi");
		reg.enterEmail("akki@gmail.com");
		reg.enterpassword("12345");
		reg.enterconfrimpassword("12345");
		reg.clickregister();
		
		driver.close();
	}
}
