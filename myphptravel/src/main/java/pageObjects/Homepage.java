package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends ABasePageObjects {
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//b[@class='lightcaret mt-2 go-left']")
	WebElement btn_myaccount;
	
	@FindBy(xpath="//li[@class='open']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")
	WebElement btn_signup;
	
	public Homepage() {
		initObjects();
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}
	
	public void openHomepage() {		
		driver.navigate().to("https://www.phptravels.net/");		
	}
	
	public void clickSignup() {
		btn_myaccount.click();
		btn_signup.click();
	}
	
}

