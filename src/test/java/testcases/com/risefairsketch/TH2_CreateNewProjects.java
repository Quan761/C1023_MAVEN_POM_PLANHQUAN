package testcases.com.risefairsketch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actions.Risefairsketch.HomePage;
import actions.Risefairsketch.InputLoginPage;
import actions.Risefairsketch.ProjectsPage;
import actions.commons.AbstractTest;
import actions.commons.DataProviderFactory;

public class TH2_CreateNewProjects extends AbstractTest {
	WebDriver driver;
	String uniqueTitle;

	@Parameters({ "browser", "version" })
	@BeforeMethod
	public void beforeMethod(String browser, String version) {
		driver = openMultiBrowsers(browser, version);
		uniqueTitle = randomEmail();
	}

	@Test(dataProvider = "inputManageLabels", dataProviderClass = DataProviderFactory.class)
	public void TC01_Add2Labels(String label) {

		inputLoginPage = new InputLoginPage(driver);

		log.info("Step 01 - Login to application");
		inputLoginPage.openLoginPage("https://rise.fairsketch.com/");
		inputLoginPage.loginWithEmailAndPassword();

		homePage = new HomePage(driver);

		log.info("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		log.info("Step 02 - Open page Projects");
		homePage.selectMenu("Projects");

		projectsPage = new ProjectsPage(driver);

		log.info("Step 03 - Create 2 label");

		projectsPage.clickManageLabels();

		projectsPage.InputManageLabels(label);

		projectsPage.ClickClose();
	}

//	@Test(dataProvider = "inputAddProject", dataProviderClass = DataProviderFactory.class)
	public void TC02_Add5Project(String title, String description, String price, String projecttype, String client,
			String labels) {
		projectsPage = new ProjectsPage(driver);

		log.info("Add 5 projects");

		projectsPage.clickAddProject();

		projectsPage.InputAddProjects(title, description, price, projecttype, client, labels);
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

	private InputLoginPage inputLoginPage;
	private HomePage homePage;
	private ProjectsPage projectsPage;

}
