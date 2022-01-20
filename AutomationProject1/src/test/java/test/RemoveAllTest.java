package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllPage;
import util.BrowserFactory;

public class RemoveAllTest {

	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToGoToSite() {
		driver = BrowserFactory.startBrowser();
		driver.get("https://techfios.com/test/101/");
		
		RemoveAllPage itemsList = PageFactory.initElements(driver, RemoveAllPage.class);
		itemsList.userShouldBeAbleToRemoveAllItems();
		Boolean result = itemsList.checkIfAllBoxesAreSelected();
		System.out.println("All Selected" + result);
    	if(!result) {
			itemsList.userShouldBeAbleToRemoveAllItems();
			Assert.assertTrue("All Deleted", itemsList.checkIfAllBoxesAreSelected());
		}
		driver.close();
	}
}
