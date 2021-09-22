package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

	public WebDriver ldriver;

	public GoogleSearchPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@Class=\"gLFyf gsfi\"]")
	@CacheLookup
	WebElement GoogleSearchTextBox;

	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
	@CacheLookup
	WebElement btnGoogleSearchButton;

	@FindBy(xpath = "//h3[text()='J.P. Morgan | Official Website']")
	@CacheLookup
	WebElement firstlink;

	public void EnterSearchText(String keyword) {
		GoogleSearchTextBox.clear();
		GoogleSearchTextBox.sendKeys("J. P. Morgan");

	}

	public void clickSearchButton() {
		btnGoogleSearchButton.click();

	}

	public void clickfirstlink() {
		firstlink.click();

	}

}
