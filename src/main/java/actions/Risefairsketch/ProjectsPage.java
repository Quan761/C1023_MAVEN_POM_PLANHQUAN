package actions.Risefairsketch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.commons.AbstractPage;
import interfaces.Risefairsketch.ProjectsPageInterfaces;

public class ProjectsPage extends AbstractPage {
	WebDriver driver;

	public ProjectsPage(WebDriver driver_) {
		driver = driver_;
	}

	public void clickManageLabels() {
		clickToElement(driver, ProjectsPageInterfaces.BTN_MANAGELABELS);
	}

	public void selectValueInDropdownlist(String combobox, String value) {
		clickToElement(driver, ProjectsPageInterfaces.DROPDOWNLISTS, combobox);
		clickToElement(driver, ProjectsPageInterfaces.OPTIONS, value);
	}

	public void selectValueInCombobox(String combobox, String value) {
		clickToElement(driver, ProjectsPageInterfaces.COMBOBOX, combobox);
		clickToElement(driver, ProjectsPageInterfaces.OPTIONS, value);
	}

	public void InputManageLabels(String label) {
		WebElement txbLabel = findAnElement(driver, ProjectsPageInterfaces.TXB_LABEL);
		WebElement btnSave = findAnElement(driver, ProjectsPageInterfaces.BTN_SAVE);

		log.info("Input label");
		txbLabel.sendKeys(label);

		log.info("Click Save");
		btnSave.click();
	}

	public void ClickClose() {
		WebElement btnClose = findAnElement(driver, ProjectsPageInterfaces.BTN_CLOSE);
		log.info("Click Close");
		btnClose.click();
	}
	
	public void clickAddProject(){
		clickToElement(driver, ProjectsPageInterfaces.BTN_ADDPROJECT);
	}

	public void InputAddProjects(String title, String description, String price, String projecttype, String client,
			String labels) {
		WebElement txbTitle = findAnElement(driver, ProjectsPageInterfaces.TXB_TITLE);
		WebElement txaDescription = findAnElement(driver, ProjectsPageInterfaces.TXA_DESCRIPTION);
		WebElement txbPrice = findAnElement(driver, ProjectsPageInterfaces.TXB_PRICE);
		WebElement startdate = findAnElement(driver, ProjectsPageInterfaces.TXB_STARTDATE);
		WebElement deadline = findAnElement(driver, ProjectsPageInterfaces.TXB_DEADLINE);
		WebElement save = findAnElement(driver, ProjectsPageInterfaces.BTN_ADDPROJECTSAVE);

		log.info("Input Title data");
		txbTitle.sendKeys(title);

		log.info("Select Project type");
		selectValueInDropdownlist("Project type", projecttype);

		log.info("Select Client");
		selectValueInDropdownlist("Client", client);

		log.info("Input Description data");
		txaDescription.sendKeys(description);

		log.info("Enter Start date");
		startdate.sendKeys("12-12-2020");

		log.info("Enter Deadline");
		deadline.sendKeys("12-12-2021");

		log.info("Enter Price data");
		txbPrice.sendKeys(price);

		log.info("Select Labels");
		selectValueInDropdownlist("Labels", labels);

		log.info("Click Save");
		save.click();
	}

}
