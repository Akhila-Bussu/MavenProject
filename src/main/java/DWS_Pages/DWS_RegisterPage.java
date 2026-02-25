package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_RegisterPage {

//	constructor
	
	public DWS_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(id="gender-male")
//	WebElement male;
	
	@FindBy(id="gender-female")
	WebElement female;
	
	@FindBy(id="FirstName")
	WebElement fname;
	
	@FindBy(id="LastName")
	WebElement lname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	
	@FindBy(id="register-button")
	WebElement registerbtn;
	
	public void clickGender() {
		female.click();
	}
	
	public void enterFname(String firstname) {
		fname.sendKeys(firstname);
	}
	public void enterLname(String lastname) {
		lname.sendKeys(lastname);
	}
	public void enterEmail(String emailval) {
		email.sendKeys(emailval);
	}
	public void enterpassword(String passwordval) {
		password.sendKeys(passwordval);
	}
	public void enterconfrimpassword(String confrimpasswordval) {
		confirmpassword.sendKeys(confrimpasswordval);
	}
	public void clickregister() {
		registerbtn.click();
	}
}
