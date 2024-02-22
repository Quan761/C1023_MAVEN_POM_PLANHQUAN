package testcases.com.risefairsketch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actions.Risefairsketch.HomePage;
import actions.Risefairsketch.InputLoginPage;
import actions.Risefairsketch.InputValuePage;
import actions.commons.AbstractTest;
import actions.commons.DataProviderFactory;

public class BT01_Create3Tasks extends AbstractTest{
	WebDriver driver;
	String uniqueTitle;
	
	@Parameters({ "browser", "version"})
	@BeforeMethod
	public void beforeMethod(String browser, String version) {
		driver = openMultiBrowsers(browser, version);
		uniqueTitle = randomEmail();
	}

	@Test(dataProvider = "inputValue01", dataProviderClass = DataProviderFactory.class)
	public void TC01_Create3Tasks(String RelatedTo, String Project, String Points, String Milestone, String AssignTo, String Collaborators, String Status, String Priority, String Labels){
		inputLoginPage = new InputLoginPage(driver);

		log.info("Step 01 - Login to application");
		inputLoginPage.openLoginPage("https://rise.fairsketch.com/");
		inputLoginPage.loginWithEmailAndPassword();

		homePage = new HomePage(driver);
		log.info("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		log.info("Step 02 - Open page Tasks");
		homePage.selectMenu("tasks");

		inputValuePage = new InputValuePage(driver);
		
		log.info("Step 03 - Add a new task");
		
		inputValuePage.clickAddTask();
		
		inputValuePage.inputAllInformation(RelatedTo, Project, Points, Milestone, AssignTo, Collaborators, Status, Priority, Labels);

		log.info("VP - Verify Task is added successfully");
		inputValuePage.verifyTaskIsAddedSuccessfully();
	}
	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

	private InputLoginPage inputLoginPage;
	private HomePage homePage;
	private InputValuePage inputValuePage;
}
