package org.hex;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RadioButtonDemoSteps {
	WebDriver driver;

	@Given("The User is in Selenium home page to test the Radio button")
	public void the_User_is_in_Selenium_home_page_to_test_the_Radio_button() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Radio buttons Demo page")
	public void the_User_navigates_to_the_Radio_buttons_Demo_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[1]")).click();
	}

	@When("The user clicks the Female radio button")
	public void the_user_clicks_the_Female_radio_button() {
		driver.findElement(By.xpath("(//input[@value =\"Female\"])[1]")).click();
	}

	@When("The user click on the Get Checked Value button")
	public void the_user_click_on_the_Get_Checked_Value_button() {
		driver.findElement(By.id("buttoncheck")).click();
	}

	// @Then("The message Radio button is checked should display")
	// public void the_message_Radio_button_is_checked_should_display() {
	// // String actual = driver.findElement(By.xpath("//p[text()='Radio button
	// // 'Female' is checked']")).getText();
	// // Assert.assertEquals("Radio button 'Female' is checked", actual);
	//
	// }
	@Then("Get the Url and verify")
	public void get_the_Url_and_verify() {
		Assert.assertTrue("To verify the Radio button URL", driver.getCurrentUrl().contains("basic-radiobutton"));
	}
}
