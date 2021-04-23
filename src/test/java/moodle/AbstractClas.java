package moodle;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractClas {

	WebDriver driver;

	@BeforeMethod
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "/home/rohit/Downloads/ChromeDriver89/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost/moodle/");
//		driver.get("https://google.com");
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void after() {
//		driver.close();
	}

}
