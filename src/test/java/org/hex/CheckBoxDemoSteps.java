package org.hex;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckBoxDemoSteps {

	WebDriver driver;

	@Given("The User is in Selenium home page screen")
	public void the_User_is_in_Selenium_home_page_screen() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Checkbox Demo page")
	public void the_User_navigates_to_the_Checkbox_Demo_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		// driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Checkbox Demo'])[1]")).click();
	}

	@When("The user select the checkbox")
	public void the_user_select_the_checkbox() {
		driver.findElement(By.id("isAgeSelected")).click();
	}

	@Then("The Success message should display")
	public void the_Success_message_should_display() {
		String txtMessage = driver.findElement(By.xpath("//div[text()='Success - Check box is checked']")).getText();
		Assert.assertEquals("Success - Check box is checked", txtMessage);
	}
}
