package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.ToggleAllPage;
import util.BrowserFactory;

public class ToggleAllTest {
	
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToGoToSite() {
		driver = BrowserFactory.startBrowser();
		
		driver.get("http://techfios.com/test/101/");
		
		ToggleAllPage toggleAll = PageFactory.initElements(driver, ToggleAllPage.class);
		
		toggleAll.toToggleAll();
		Boolean result = toggleAll.isToggleAllCheckboxSelected();
		System.out.println("All select boxes are checked" + result);
		
		if(!result) {
			toggleAll.toToggleAll();
			Assert.assertTrue("Box selected",result);
		}
		
		Assert.assertTrue("All boxes are selected", toggleAll.checkAllBoxesIfSelected());
		WebElement checkbox = driver.findElement(By.name("allbox"));
		Assert.assertEquals(true, checkbox.isSelected());
		
		driver.close();
		
		
		
	}

}
