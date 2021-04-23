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

public class MoodleLogin extends AbstractClas {

//	@Test
//	public void addCategory() {
//		LoginActions loginAction = new LoginActions(driver);
//		loginAction.login("Admin", "Admin@123");
//
//		WebElement text = driver.findElement(By.linkText("Site administration"));
//		text.click();
//
//		CourseNavigation CourseNavi = new CourseNavigation(driver);
//		CourseNavi.addCategory().click();
//
//		CategoryAction category = new CategoryAction(driver);
//		String categoryName = "Network1" + RandomString.make(5);
//		category.add("Top", categoryName, RandomString.make(10),
//				"here we are introducing different type off languages");
//
//		Assert.assertEquals(categoryName, driver.findElement(By.linkText(categoryName)).getText());
//	}

//	@Test
//	public void addCourse() {
//		LoginActions loginAction = new LoginActions(driver);
//		loginAction.login("Admin", "Admin@123");
//
//		WebElement text = driver.findElement(By.linkText("Site administration"));
//		text.click();
//		WebElement course = driver.findElement(By.xpath("//*[@href=\"#linkcourses\"]"));
//		course.click();
//		WebElement addcourse = driver
//				.findElement(By.cssSelector("li a[href=\"http://localhost/moodle/course/edit.php?category=0\"]"));
//		addcourse.click();
//		WebElement fname = driver.findElement(By.xpath("//input[@name=\"fullname\"]"));
//		fname.sendKeys("Java" + RandomString.make(5));
//		WebElement sname = driver.findElement(By.cssSelector("#id_shortname"));
//		sname.sendKeys("Java" + RandomString.make(5));
//		WebElement ccategory = driver.findElement(By.cssSelector("#id_category"));
//		Select select = new Select(ccategory);
//		select.selectByIndex(1);
//		WebElement visibility = driver.findElement(By.cssSelector("#id_category"));
//		Select select1 = new Select(visibility);
//		select1.selectByIndex(1);
//		WebElement calendar = driver
//				.findElement(By.cssSelector("#id_startdate_calendar.visibleifjs > i[title=\"Calendar\"]"));
//		calendar.click();
//		System.out.print("asasas");
//		sleep(2000);
//
//		List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"yui3-calendar-grid\"]/thead/tr"));
//		int total_node = dates.size();
//		for (int i = 0; i < total_node; i++) {
//			String date = dates.get(i).getText();
//
//			if (date.equals("28")) {
//				sleep(8000);
//				dates.get(i).click();
//				break;
//			}
//		}
//		System.out.print("Course");
//
//	}

}