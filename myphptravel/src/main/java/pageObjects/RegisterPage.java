package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PropertyHandler;

public class RegisterPage extends ABasePageObjects {
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement txt_mobilenumb;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement txt_confirmpass;
	
	@FindBy(xpath="//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
	WebElement btn_signup;
	
	//PropertyHandler datainput = new PropertyHandler();
	
	
	public RegisterPage () {
		initObjects();
		// state that those elements are part of this page class //
		PageFactory.initElements(driver, this);
	}
	
	public void fillregistration() {
		txt_firstname.sendKeys(PropertyHandler.getValue("firstname"));
		txt_lastname.sendKeys(PropertyHandler.getValue("lastname"));
		txt_mobilenumb.sendKeys(PropertyHandler.getValue("mobilenumb"));
		txt_email.sendKeys(PropertyHandler.getValue("email"));
		txt_password.sendKeys(PropertyHandler.getValue("password"));
		txt_confirmpass.sendKeys(PropertyHandler.getValue("password"));
	}
	
	public void submitdata() {
		btn_signup.click();
	}
	
}
