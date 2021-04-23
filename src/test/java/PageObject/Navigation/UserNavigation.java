package PageObject.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserNavigation {

	public static final By tab = By.xpath("//a[@href=\"#linkusers\"]");
	public static final By addUser = By.linkText("Add a new user");
			

	public UserNavigation(WebDriver driver) {
		userMainTab(driver).click();
	}
	
	public static WebElement userMainTab(WebDriver driver){
		return driver.findElement(tab);
	}
	
//	public UserNavigation user(WebDriver driver){
//		userMainTab(driver).click();
//		return this;
//	}
	
	
	public static WebElement addUser(WebDriver driver){
		System.out.println("In njks User");
		return driver.findElement(addUser);
	}
			

	
	public static WebElement uploadUser(WebDriver driver){
		System.out.println("In Upload User");
		return driver.findElement(addUser);
	}
	
	public static WebElement deleteUser(WebDriver driver){
		System.out.println("In Delete User");
		return driver.findElement(addUser);
	}
	

}
