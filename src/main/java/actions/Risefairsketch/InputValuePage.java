package actions.Risefairsketch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import actions.commons.AbstractPage;
import interfaces.Risefairsketch.TasksPageInterfaces;

public class InputValuePage extends AbstractPage{
	WebDriver driver;

	public InputValuePage(WebDriver driver_) {
		driver = driver_;
	}

	public void clickAddTask() {
		clickToElement(driver, TasksPageInterfaces.BTN_ADDTASK);
	}

	public void selectValueInDropdownlist(String combobox, String value) {
		clickToElement(driver, TasksPageInterfaces.DROPDOWNLISTS, combobox);
		clickToElement(driver, TasksPageInterfaces.OPTIONS, value);
	}

	public void selectValueInCombobox(String combobox, String value) {
		clickToElement(driver, TasksPageInterfaces.COMBOBOX, combobox);
		clickToElement(driver, TasksPageInterfaces.OPTIONS, value);
	}
	
	public void inputAllInformation(String RelatedTo, String Project, String Points, String Milestone, String AssignTo, String Collaborators, String Status, String Priority, String Labels) {

		WebElement txbTitle = findAnElement(driver, TasksPageInterfaces.TXB_TITLE);
		WebElement description = findAnElement(driver, TasksPageInterfaces.TXA_DESCRIPTION);
		WebElement startdate = findAnElement(driver, TasksPageInterfaces.TXB_STARTDATE);
		WebElement deadline = findAnElement(driver, TasksPageInterfaces.TXB_DEADLINE);
		WebElement save = findAnElement(driver, TasksPageInterfaces.BTN_SAVE);

		log.info("Input Title data");
		txbTitle.sendKeys("Title");

		log.info("Input Description data");
		description.sendKeys("Description");

		log.info("Select Related to with value Project");
		selectValueInDropdownlist("Related to", RelatedTo);

		log.info("Select Project with value Online Course Creation and Launch");
		selectValueInDropdownlist("Project", Project);

		log.info("Select Points with value 1 Point");
		selectValueInDropdownlist("Points", Points);

		log.info("Select Milestone with value Release");
		selectValueInDropdownlist("Milestone", Milestone);

		log.info("Select Assign to with value John Doe");
		selectValueInDropdownlist("Assign to", AssignTo);

		log.info("Select Collaborators with value John Doe");
		selectValueInCombobox("Collaborators", Collaborators);

		log.info("Select Status with value To do");
		selectValueInDropdownlist("Status", Status);

		log.info("Select Priority with value Minor");
		selectValueInDropdownlist("Priority", Priority);

		log.info("Select Labels with value Feedback");
		selectValueInCombobox("Labels", Labels);

		log.info("Enter Start date");
		startdate.sendKeys("12-12-2020");

		log.info("Enter Deadline");
		deadline.sendKeys("12-12-2021");

		log.info("Click Save");
		save.click();
	}
	
	public void verifyTaskIsAddedSuccessfully(){
		waitForElementInvisible(driver, TasksPageInterfaces.PUP_MODAL);
//		Assert.assertTrue(driver.findElements(By.xpath(TasksPageInterfaces.PUP_MODAL)).size() < 0);
	}
	
	public void searchWithKeyword(String keyword){
		sendkeyToElement(driver, TasksPageInterfaces.TXB_SEARCH, keyword);
	}
	
	public void clickTaskView(){
		clickToElement(driver, TasksPageInterfaces.LNK_VIEWTASK);
	}
	
	public void verifyInfoTaskPopupDisplays(){
		waitForElementVisible(driver, TasksPageInterfaces.PUP_INFOTASK);
		Assert.assertTrue(driver.findElement(By.xpath(TasksPageInterfaces.PUP_INFOTASK)).isDisplayed());
	}
	
	public void addComments(String comment){
//		sendkeyToElement(driver, TasksPageInterfaces.TXA_COMMENT, comment);
//		clickToElement(driver, TasksPageInterfaces.BTN_ADDCOMMENT);
	}
	
	public void verifyCommentIsAddedSuccessfully(){
//		waitForElementVisible(driver, TasksPageInterfaces.MSG_POSTCOMMENTSUCCESSFULLY);
//		Assert.assertTrue(driver.findElement(By.xpath(TasksPageInterfaces.MSG_POSTCOMMENTSUCCESSFULLY)).isDisplayed());
	}

}
