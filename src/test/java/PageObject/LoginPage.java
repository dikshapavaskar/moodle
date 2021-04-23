package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static final By loginlink = By.xpath("//a[@href=\"http://localhost/moodle/login/index.php\"]");

	public static final By name = By.xpath("//input[@id=\"username\"]");
	public static final By password = By.xpath("//input[@id=\"password\"]");
	public static final By submit = By.xpath("//button[@type=\"submit\"]");

	public static WebElement getLoginLink(WebDriver driver) {
		return driver.findElement(loginlink);
	}

	public static WebElement getName(WebDriver driver) {
		return driver.findElement(name);
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(password);
	}

	public static WebElement getSubmit(WebDriver driver) {
		return driver.findElement(submit);
	}

}