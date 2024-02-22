package testcases.com.risefairsketch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import actions.Risefairsketch.HomePage;
import actions.Risefairsketch.LoginPage;
import actions.Risefairsketch.TasksPage;
import actions.commons.AbstractTest;

public class ss9_BtPOM extends AbstractTest {
	WebDriver driver;
	String uniqueTitle;

	@Parameters({ "browser", "version" })
	@BeforeTest
	public void beforeTest(String browser, String version) {
		driver = openMultiBrowsers(browser, version);
		uniqueTitle = randomEmail();
	}

	public void TC01_CreateTaskByList() {
		loginPage = new LoginPage(driver);

		System.out.println("Step 01 - Login to application");
		loginPage.openLoginPage("https://rise.fairsketch.com/");
		loginPage.loginWithEmailAndPassword("admin@demo.com", "riseDemo");

		homePage = new HomePage(driver);
		System.out.println("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		System.out.println("Step 02 - Open page Tasks");
		homePage.selectMenu("tasks");

		tasksPage = new TasksPage(driver);
		System.out.println("Step 03 - Click Add task");
		tasksPage.clickAddTask();

		System.out.println("Step 04 - Add a new task");
		tasksPage.inputAllInformation(uniqueTitle);

		System.out.println("VP - Verify Task is added successfully");
		tasksPage.verifyTaskIsAddedSuccessfully();
	}
	
	public void TC02_CreateTaskByKanban(){
		loginPage = new LoginPage(driver);

		System.out.println("Step 01 - Login to application");
		loginPage.openLoginPage("https://rise.fairsketch.com/");
		loginPage.loginWithEmailAndPassword("admin@demo.com", "riseDemo");

		homePage = new HomePage(driver);
		System.out.println("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		System.out.println("Step 02 - Open page Tasks");
		homePage.selectMenu("tasks");

		tasksPage = new TasksPage(driver);
		
		System.out.println("Step 03 - Click Add task");
		tasksPage.clickAddTask();

		System.out.println("Step 04 - Add a new task");
		tasksPage.inputAllInformation(uniqueTitle);

		System.out.println("VP - Verify Task is added successfully");
		tasksPage.verifyTaskIsAddedSuccessfully();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

	private LoginPage loginPage;
	private HomePage homePage;
	private TasksPage tasksPage;

}
