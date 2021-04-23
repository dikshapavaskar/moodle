package Actions;

import org.openqa.selenium.WebDriver;

import PageObject.Category;
import net.bytebuddy.utility.RandomString;

public class CategoryAction {

	private WebDriver driver;

	public CategoryAction(WebDriver driver) {
		this.driver = driver;
	}

	public void add(String name, String CID, String description) {
		Category.getName(driver).sendKeys(name);
		Category.getCID(driver).sendKeys(CID);
		Category.getDescription(driver).sendKeys(description);
		Category.getSubmitButton(driver).click();
	}
}
