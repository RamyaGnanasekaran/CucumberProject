package org.hex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class SimpleFromDemoSteps {
	WebDriver driver;

	@Given("The User is in Selenium home page")
	public void the_User_is_in_Selenium_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Single input field page")
	public void the_User_navigates_to_the_Single_input_field_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'][1]")).click();
		driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[1]")).click();
	}

	@When("The user enters the message")
	public void the_user_enters_the_message(DataTable dataTable) {
		List<String> sampleDemoList = dataTable.asList();
		driver.findElement(By.id("user-message")).sendKeys(sampleDemoList.get(0));
	}
	
	 @When("the User click on Show message button")
	 public void the_User_click_on_Show_message_button() {
		 driver.findElement(By.xpath("(//button[text()='Show Message']")).click();
	 }
	
	 @Then("The Entered message should display")
	 public void the_Entered_message_should_display() {
			String txtMessage = driver.findElement(By.xpath("//span[text()='Hello']")).getText();
			Assert.assertEquals("Hello", txtMessage);
	 }
}
