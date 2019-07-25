package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PropertyHandler;

public class AccountPage extends ABasePageObjects {
	
	@FindBy(xpath="//h3[@class='RTL']")
	WebElement greeting;
	
	
	public AccountPage() {
		initObjects();
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyAccountPage() {
		
		String accountgreet = "Hi, " + PropertyHandler.getValue("firstname") + " " + PropertyHandler.getValue("lastname");
		
		if (greeting.getText().contentEquals(accountgreet)) {
			return true;
		} else 
			return false;
	}
	
	
}
