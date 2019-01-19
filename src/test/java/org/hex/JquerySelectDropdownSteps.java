package org.hex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JquerySelectDropdownSteps {
	WebDriver driver;

	@Given("The User is in Selenium home page to select the Jquery dropdown")
	public void the_User_is_in_Selenium_home_page_to_select_the_Jquery_dropdown() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Jquery page")
	public void the_User_navigates_to_the_Jquery_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='JQuery Select dropdown'])[1]")).click();
	}

	@When("The user fill in the details in the Jquery page")
	public void the_user_fill_in_the_details_in_the_Jquery_page() {
		// WebElement dDnCountry =
		// driver.findElement(By.xpath("(//span[@class=\"select2-selection
		// select2-selection--single\"])[1]"));
		WebElement dDnCountry = driver.findElement(By.xpath("//span[@aria-labelledby=\"select2-country-container\"]"));
		Select s = new Select(dDnCountry);
		s.selectByVisibleText("India");
			}

	// @Then("The Verify the Jquery page Url")
	// public void the_Verify_the_Jquery_page_Url() {
	// // Write code here that turns the phrase above into concrete actions
	// throw new cucumber.api.PendingException();
	// }
}
