package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPMCHomePage {

	public WebDriver ldriver;

	public JPMCHomePage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class='logo-mobile-only']//img[contains(@src,'logos-cb-jpm')]")
	@CacheLookup
	WebElement validateLogo;

	public void ValidateLogo() {
		validateLogo.isDisplayed();

	}

}
