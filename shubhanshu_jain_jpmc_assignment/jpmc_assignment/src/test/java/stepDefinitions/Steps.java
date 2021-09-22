package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.GoogleSearchPage;
import pageObjects.JPMCHomePage;

public class Steps {

	public WebDriver driver;
	public GoogleSearchPage googleSearchPage;
	public JPMCHomePage jPMCHomePage;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		googleSearchPage = new GoogleSearchPage(driver);
		jPMCHomePage = new JPMCHomePage(driver);

	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@When("search for {string}")
	public void search_for(String searchkeyword) {
		googleSearchPage.EnterSearchText(searchkeyword);
	}
	
	@When("click on Search Button")
	public void click_on_Search_Button() {
		googleSearchPage.clickSearchButton();

	}

	@When("click on first link")
	public void click_on_first_link() {

		googleSearchPage.clickfirstlink();
	}
	
	@Then("Validate Logo")
	public void Validate_Logo() {

		jPMCHomePage.ValidateLogo();

	}

}
