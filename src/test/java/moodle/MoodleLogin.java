package moodle;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import Actions.CategoryAction;
import Actions.LoginActions;
import PageObject.Category;
//import PageObject.Navigation.NavigationPage;
import PageObject.Navigation.UserNavigation;
import net.bytebuddy.utility.RandomString;

public class MoodleLogin extends AbstractClas {

//		String str=driver.getTitle();
//		System.out.println(str);
//		String str1="Dashboard";
//		assertEquals(str, str1);
	// Thread tread=new Thread();

	@Test
	public void addCategory() {
		LoginActions loginAction = new LoginActions(driver);
		loginAction.login("Admin", "Admin@123");
//login();
		WebElement text = driver.findElement(By.linkText("Site administration"));
		text.click();
		
//		NavigationPage nP = new NavigationPage();
//		nP.user(driver).addUser(driver).click();
		UserNavigation uN = new UserNavigation(driver);
		uN.addUser(driver);
//		WebElement course = driver.findElement(By.xpath("//*[@href=\"#linkcourses\"]"));
//		course.click();
		WebElement addcategory = driver
				.findElement(By.xpath("//*[@href=\"http://localhost/moodle/course/editcategory.php?parent=0\"]"));
		addcategory.click();
		WebElement pcategory = driver.findElement(By.xpath("//select[@id=\"id_parent\"]"));
		Select select = new Select(pcategory);
		select.selectByIndex(1);

		CategoryAction category = new CategoryAction(driver);
		category.add("Network1" + RandomString.make(5), "1235456" + RandomString.make(5),
				"here we are introducing different type off languages");
//		Category.getName(driver).sendKeys("Network1" + RandomString.make(5));
//		Category.getCID(driver).sendKeys("1235456"+ RandomString.make(5));
//		Category.getDescription(driver).sendKeys("here we are introducing different type off languages");
//		Category.getSubmitButton(driver).click();

//		WebElement cname=driver.findElement(By.xpath("//input[@name=\"name\"]"));
//		cname.sendKeys("Network1" + RandomString.make(5));
//		WebElement CID=driver.findElement(By.xpath("//input[@id=\"id_idnumber\"]"));
//		CID.sendKeys("1235456"+ RandomString.make(5));
//		WebElement Desc=driver.findElement(By.xpath("//*[@id=\"id_description_editoreditable\"]"));
//		Desc.sendKeys("here we are introducing different type off languages");
//		WebElement ccategory=driver.findElement(By.xpath("//input[@id=\"id_submitbutton\"]"));
//		ccategory.click();

		List<WebElement> allProduct = driver.findElements(By.xpath("//*[@id=\"subcategoryof1\"]/li"));
		System.out.println(allProduct.size());
		ArrayList<String> strAA = new ArrayList();
		for (WebElement product : allProduct) {
			strAA.add(product.findElement(By.cssSelector("div:first-child a")).getText());

//			System.out.println(product.findElement(By.cssSelector("div:first-child a")).getText());
		}
		if (strAA.contains("Language")) {
			System.out.println("Exists");

		} else {
			System.out.println("Not Exists");
		}
		// dikshapavaskar

		// table[id="users"] tbody tr:nth-child(1) td:nth-child(6)
		//// table[@id="users"]/tbody/tr[1]/td[1]
	}

	@Test
	public void addCourse() {
		LoginActions loginAction = new LoginActions(driver);
		loginAction.login("Admin", "Admin@123");

		WebElement text = driver.findElement(By.linkText("Site administration"));
		text.click();
		WebElement course = driver.findElement(By.xpath("//*[@href=\"#linkcourses\"]"));
		course.click();
		WebElement addcourse = driver
				.findElement(By.cssSelector("li a[href=\"http://localhost/moodle/course/edit.php?category=0\"]"));
		addcourse.click();
		WebElement fname = driver.findElement(By.xpath("//input[@name=\"fullname\"]"));
		fname.sendKeys("Java" + RandomString.make(5));
		WebElement sname = driver.findElement(By.cssSelector("#id_shortname"));
		sname.sendKeys("Java" + RandomString.make(5));
		WebElement ccategory = driver.findElement(By.cssSelector("#id_category"));
		Select select = new Select(ccategory);
		select.selectByIndex(1);
		WebElement visibility = driver.findElement(By.cssSelector("#id_category"));
		Select select1 = new Select(visibility);
		select1.selectByIndex(1);
		WebElement calendar = driver
				.findElement(By.cssSelector("#id_startdate_calendar.visibleifjs > i[title=\"Calendar\"]"));
		calendar.click();
		// xpath=//a[@id="id_startdate_calendar"]/i
		// xpath=html//a[@id="id_startdate_calendar"]
		// xpath=//a[@id="id_startdate_calendar"]/i[@title="Calendar"]
		sleep(2000);

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"yui3-calendar-grid\"]/thead/tr"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();

			if (date.equals("28")) {
				sleep(8000);
				dates.get(i).click();
				break;
			}
		}

	}

}