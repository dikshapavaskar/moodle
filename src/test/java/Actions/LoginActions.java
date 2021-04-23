package Actions;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;

public class LoginActions {

	private WebDriver driver;

	public LoginActions(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String name, String password) {
		LoginPage.getLoginLink(driver).click();
		LoginPage.getName(driver).sendKeys(name);
		LoginPage.getPassword(driver).sendKeys(password);
		LoginPage.getSubmit(driver).click();
	}

}
