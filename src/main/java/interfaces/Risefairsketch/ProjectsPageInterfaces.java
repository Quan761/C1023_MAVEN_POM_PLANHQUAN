package interfaces.Risefairsketch;

public class ProjectsPageInterfaces {
	public static final String BTN_MANAGELABELS = "//a[normalize-space()='Manage labels']";
	public static final String TXB_LABEL = "//input[@id='title']";
	public static final String BTN_SAVE = "//button[normalize-space()='Save']";
	public static final String BTN_CLOSE = "//form[@role='form']//button[@type='button'][normalize-space()='Close']";
	public static final String BTN_ADDPROJECT = "//a[@title='Add project']";
	public static final String DROPDOWNLISTS = "//label[normalize-space(text())='%s']/following-sibling::div//a";
	public static final String COMBOBOX = "//label[normalize-space(text())='%s']/following-sibling::input";
	public static final String OPTIONS = "//div[@id='select2-drop']//li[contains(.,'%s')]";
	public static final String TXB_TITLE = "//input[@name='title']";
	public static final String TXA_DESCRIPTION = "//textarea[@name='description']";
	public static final String TXB_STARTDATE = "//input[@name='start_date']";
	public static final String TXB_DEADLINE = "//input[@name='deadline']";
	public static final String TXB_PRICE = "//input[@id='price']";
	public static final String BTN_ADDPROJECTSAVE = "//button[@type='submit']";
}
