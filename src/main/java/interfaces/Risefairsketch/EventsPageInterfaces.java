package interfaces.Risefairsketch;

public class EventsPageInterfaces {
	public static final String BTN_EVENTS = "//span[normalize-space()='Events']";
	public static final String BTN_ADDEVENT = "//a[@class='btn btn-default add-btn']";
	public static final String TXB_TITLE = "//input[@id='title']";
	public static final String TXB_DESCRIPTION = "//textarea[@id='description']";
	public static final String DDL_STARTDATE = "//input[@id='start_date']";
	public static final String RDB_20 = "//td[contains(text(),'20')]";
	public static final String DDL_STARTTIME = "//input[@id='start_time']";
	public static final String DDL_ENDDATE = "//input[@id='end_date']";
	public static final String RDB_30 = "//td[contains(text(),'30')]";
	public static final String DDL_ENDTIME = "//input[@id='end_time']";
	public static final String TXB_LOCATION = "//input[@id='location']";
	public static final String TXB_LABELS = "//label[@for='event_labels']/following::div[@id='s2id_event_labels']";
	public static final String BTN_SAVE = "//button[normalize-space()='Save']";
}
