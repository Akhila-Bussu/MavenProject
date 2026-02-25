package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {

//Constructor
public DWS_LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

@FindBy(id="Email")
WebElement username;

@FindBy(name="Password")
WebElement password;

@FindBy(xpath="(//input[@type='submit'])[2]")
WebElement submit;

public void enterEmail(String usernameval) {
	username.sendKeys("usernameval");
}
public void enterpassword(String passwordval) {
	password.sendKeys("passwordval");
}
public void clickSubmit() {
	submit.click();
}
	
	
}
