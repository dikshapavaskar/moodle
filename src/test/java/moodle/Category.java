package moodle;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Actions.CategoryAction;
import Actions.LoginActions;
import PageObject.Navigation.CourseNavigation;
import PageObject.Navigation.UserNavigation;
import net.bytebuddy.utility.RandomString;

public class Category extends AbstractClas {
	CourseNavigation courseNavigation;
	

	@Test
	public void addCategory() {
		LoginActions loginAction = new LoginActions(driver);
		loginAction.login("Admin", "Admin@123");

		WebElement text = driver.findElement(By.linkText("Site administration"));
		text.click();

		courseNavigation = new CourseNavigation(driver);
		courseNavigation.addCategory().click();
		
		CategoryAction category = new CategoryAction(driver);
		String categoryName = "Network1" + RandomString.make(5);
		category.add("Top", categoryName, RandomString.make(10),
				"here we are introducing different type off languages");

		Assert.assertEquals(categoryName, driver.findElement(By.linkText(categoryName)).getText());
	}
	
	@Test
	public void addCategoryVerifyReqField() {
		courseNavigation.addCategory().click();
		
		CategoryAction category = new CategoryAction(driver);
		String categoryName = "Network1" + RandomString.make(5);
		category.add("Top", "", RandomString.make(10),
				"here we are introducing different type off languages");

		Assert.assertEquals(categoryName, driver.findElement(By.linkText(categoryName)).getText());
		
	}
}