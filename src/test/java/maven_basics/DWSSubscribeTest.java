package maven_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWSSubscribeTest {
	
	@Test
	public void subscribeTest() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("newsletter-email")).sendKeys("akhila@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
	}

}
