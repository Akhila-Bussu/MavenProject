package dws_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;

public class DWS_SearchTest {

	@Test
	public void searchText() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
//		Create an object of Home page and call the methods
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.enterSearchText("mobiles");
		hp.clickButton();
		
		
		driver.close();
	}
}
