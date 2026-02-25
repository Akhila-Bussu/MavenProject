package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_HomePage {

	
//	constructor
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	webElements
	@FindBy(id="small-searchterms")
	WebElement searchtxt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbtn;
	
//	Register WebElement
	@FindBy(linkText="Register")
	WebElement register;
	
//	Login WebElement
	@FindBy(linkText="Log in")
	WebElement login;
	
	
//	Actions or Methods of webElements
	
	public void enterSearchText(String value) {
		searchtxt.sendKeys(value);
	}
	
	public void clickButton() {
		searchbtn.click();
	}
	
	public void clickRegister() {
		register.click();
	}
}
