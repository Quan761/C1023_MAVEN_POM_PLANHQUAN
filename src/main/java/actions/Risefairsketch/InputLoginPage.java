package actions.Risefairsketch;

import org.openqa.selenium.WebDriver;

import actions.commons.AbstractPage;
import interfaces.Risefairsketch.LoginPageInterfaces;

public class InputLoginPage extends AbstractPage{
	WebDriver driver;

	public InputLoginPage(WebDriver driver_) {
		driver = driver_;
	}

	public void openLoginPage(String url) {
		openUrl(driver, url);
	}

	public void loginWithEmailAndPassword() {
		clearText(driver, LoginPageInterfaces.TXB_EMAIL);
		sendkeyToElement(driver, LoginPageInterfaces.TXB_EMAIL, "admin@demo.com");
		clearText(driver, LoginPageInterfaces.TXB_PASSWORD);
		sendkeyToElement(driver, LoginPageInterfaces.TXB_PASSWORD, "riseDemo");
		clickToElement(driver, LoginPageInterfaces.BTN_SIGNIN);
	}

}
