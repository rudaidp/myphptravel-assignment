package pageObjects;

import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class ABasePageObjects {
	
	protected WebDriver driver;
	
	protected WebDriver getDriver() {
		return WebDriverFactory.getInstance().getWebDriver();
	}
	
	protected void initObjects() {
		this.driver = getDriver();
	}
	
	public void driverquit () {
		driver.quit();
	}
}
