package moodle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoodleLogin {
	WebDriver driver;
	@Before
	public void Before()
	{
		System.setProperty("webdriver.chrome.driver", "/home/rohit/Downloads/chromedriver");
		driver= new ChromeDriver();
    	
	}
	
	@Test
	public void test() {
		driver.navigate().to("http://localhost/moodle/");
		WebElement logon=driver.findElement(By.xpath("//a[@href=\"http://localhost/moodle/login/index.php\"]"));
		logon.click();
		WebElement name=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		name.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("Admin@123");
		WebElement submit=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
		String str=driver.getTitle();
		System.out.println(str);
		String str1="Dashboard";
		assertEquals(str, str1);
		
	}

}