package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Course {
	
	private static final By cname = By.xpath("//input[@name=\"name\"]");
	private static final By CID = By.xpath("//input[@id=\"id_idnumber\"]");
	private static final By description = By.xpath("//*[@id=\"id_description_editoreditable\"]");
	private static final By submitButton = By.xpath("//input[@id=\"id_submitbutton\"]");
	
	
	
	public static WebElement getName(WebDriver driver){
		return driver.findElement(cname);
	}
	
	public static WebElement getCID(WebDriver driver){
		return driver.findElement(CID);
	}
	
	public static WebElement getDescription(WebDriver driver){
		return driver.findElement(description);
	}
	
	public static WebElement getSubmitButton(WebDriver driver){
		return driver.findElement(submitButton);
	}
}
