package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class RemoveOnePage {

	WebDriver driver;
	public RemoveOnePage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBys(@FindBy(how = How.XPATH, using = "//input[@type='checkbox']"))
	List<WebElement> checkboxes;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[5]/input") WebElement CheckboxChecked; 
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]" ) WebElement Remove;
	
	public boolean userShouldBeAbleToDeleteOne() throws InterruptedException {
		CheckboxChecked.click();
		Thread.sleep(3000);
		Remove.click();
		return false;
		
	}
	
}
