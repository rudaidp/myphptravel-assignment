package pageObjects;

import org.openqa.selenium.support.PageFactory;

public class Homepage extends ABasePageObjects {
	
	public Homepage() {
		initObjects();
		PageFactory.initElements(driver, this);
	}
	
	public void openHomepage() {
		driver.navigate().to("https://www.phptravels.net/");
	}
}
