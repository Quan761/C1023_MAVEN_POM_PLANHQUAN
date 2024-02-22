package actions.Risefairsketch;

import org.openqa.selenium.WebDriver;

import actions.commons.AbstractPage;
import interfaces.Risefairsketch.EventsPageInterfaces;

public class EventsPage extends AbstractPage {
	WebDriver driver;
	
	public EventsPage(WebDriver driver_){
		driver = driver_;
	}
	
	public void clickEvents(){
		clickToElement(driver, EventsPageInterfaces.BTN_EVENTS);
	}
	
	public void clickAddEvent(){
		clickToElement(driver, EventsPageInterfaces.BTN_ADDEVENT);
	}
	
	public void inputInformation(){
		sendkeyToElement(driver, EventsPageInterfaces.TXB_TITLE, "Event 01");
		sendkeyToElement(driver, EventsPageInterfaces.TXB_DESCRIPTION, "Event 01");
		
		clickToElement(driver, EventsPageInterfaces.DDL_STARTDATE);
		clickToElement(driver, EventsPageInterfaces.RDB_20);
		
		clickToElement(driver, EventsPageInterfaces.DDL_STARTTIME);
		
		clickToElement(driver, EventsPageInterfaces.DDL_ENDDATE);
		clickToElement(driver, EventsPageInterfaces.RDB_30);
		
		clickToElement(driver, EventsPageInterfaces.DDL_ENDTIME);
		
		sendkeyToElement(driver, EventsPageInterfaces.TXB_LOCATION, "Da Nang");
		sendkeyToElement(driver, EventsPageInterfaces.TXB_LABELS, "Event 01");
		
		clickToElement(driver, EventsPageInterfaces.BTN_SAVE);
	}

}
