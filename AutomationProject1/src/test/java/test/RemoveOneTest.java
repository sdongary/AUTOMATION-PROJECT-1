package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveOnePage;
import util.BrowserFactory;

public class RemoveOneTest {
	
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToGoToSite() throws InterruptedException {
		
		driver = BrowserFactory.startBrowser();
		driver.get("https://techfios.com/test/101/index.php");
		
		System.out.println("Before deleting"+ driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		RemoveOnePage oneCheckBox = PageFactory.initElements(driver, RemoveOnePage.class);
		oneCheckBox.userShouldBeAbleToDeleteOne();
		System.out.println("After deleting"+ driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		
		driver.close();
	}

}
