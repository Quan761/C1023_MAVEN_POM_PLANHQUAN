package actions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import interfaces.guru99bank.HomePageInterface;
import actions.commons.AbstractPage;

public class HomePage extends AbstractPage{
	WebDriver driver;
	
	public HomePage(WebDriver driver_){
		driver = driver_;
	}

	public void verifyHomePageIsDisplayed(String user) {
		// verifyPassed(isElementDispalyed(driver,
		// HomePageInterfaces.TXT_USERNAME), "Home page is displayed", "HomePage
		// is NOT displayed");
		String actualTitle = getTitle(driver);
		String expectedTitle = "HomePage";
		verifyEqual(actualTitle, expectedTitle, "Home Page is displayed", "Home Page is NOT displayed");
	}
	
	public void selectMenu(String menu) {
		clickToElement(driver, String.format(HomePageInterface.TXT_WELCOME, menu));
	}

}
