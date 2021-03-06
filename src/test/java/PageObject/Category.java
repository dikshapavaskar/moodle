package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Category {
	
	private static final By parentCategory = By.xpath("//select[@id=\"id_parent\"]");
	private static final By cname = By.xpath("//input[@name=\"name\"]");
	private static final By CID = By.xpath("//input[@id=\"id_idnumber\"]");
	private static final By description = By.xpath("//*[@id=\"id_description_editoreditable\"]");
	private static final By submitButton = By.xpath("//input[@id=\"id_submitbutton\"]");
	
	
	public static WebElement getParentCategory(WebDriver driver){
		return driver.findElement(parentCategory);
	}
	
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
	
	public static void setParentCategory(WebDriver driver, String parentName){
		Select select = new Select(getParentCategory(driver));
		select.selectByVisibleText(parentName);
	}
}
