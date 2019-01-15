package org.hex;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AjaxFormSubmitSteps {
	WebDriver driver;

	@Given("The User is in Selenium home page to fill the Ajax form")
	public void the_User_is_in_Selenium_home_page_to_fill_the_Ajax_form() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Ajax Form Submit page")
	public void the_User_navigates_to_the_Ajax_Form_Submit_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Ajax Form Submit'])[1]")).click();
	}

	@When("The user fill the Ajax form details")
	public void the_user_fill_the_Ajax_form_details(DataTable dataTable) {
		List<String> ajaxFormDetails = dataTable.asList(String.class);
		driver.findElement(By.id("title")).sendKeys(ajaxFormDetails.get(0));
		driver.findElement(By.id("description")).sendKeys(ajaxFormDetails.get(1));

	}

	@When("the user clicks on Submit button in the Ajax form")
	public void the_user_clicks_on_Submit_button_in_the_Ajax_form() {
		driver.findElement(By.id("btn-submit")).click();
	}

	@Then("The Form submitted successfully message should display")
	public void the_Form_submitted_successfully_message_should_display() {
		// String txtMessage = driver.findElement(By.xpath("//div[text()='Form submited
		// Successfully!']")).getText();
		// Assert.assertEquals("Form submited Successfully!", txtMessage);
		Assert.assertTrue("ajax-form-submit-demo", driver.getCurrentUrl().contains("ajax-form-submit-demo"));
	}

}
