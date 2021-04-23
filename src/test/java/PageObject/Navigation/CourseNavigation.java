package PageObject.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseNavigation {
	private WebDriver driver;
	public static final By tab = By.xpath("//a[@href=\"#linkcourses\"]");
	public static final By addCourse = By
			.xpath("//*[@href=\"http://localhost/moodle/course/editcategory.php?parent=0\"]");
	public static final By addCategory = By.linkText("Add a category");

	public CourseNavigation(WebDriver driver) {
		this.driver = driver;
		courseMainTab().click();
	}

	public WebElement courseMainTab() {
		return driver.findElement(tab);
	}

	public WebElement addCategory() {
		return driver.findElement(addCategory);
	}

	public WebElement addCourse() {
		return driver.findElement(addCourse);
	}
}
