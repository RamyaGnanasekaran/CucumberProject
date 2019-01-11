package org.hex;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddTariffPlanSteps {
	WebDriver driver;

	@Given("The User is in gurantetelecom Demo Site")
	public void the_User_is_in_gurantetelecom_Demo_Site() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The User navigates to add tariff plans page")
	public void the_User_navigates_to_add_tariff_plans_page() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user should enter all the details")
	public void the_user_should_enter_all_the_details(DataTable dataTable) {
		Map<String, String> addTariff = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(addTariff.get("rental1"));
		driver.findElement(By.id("local_minutes")).sendKeys(addTariff.get("local_minutes"));
		driver.findElement(By.id("inter_minutes")).sendKeys(addTariff.get("inter_minutes"));
		driver.findElement(By.id("sms_pack")).sendKeys(addTariff.get("sms_pack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(addTariff.get("minutes_charges"));
		driver.findElement(By.id("inter_charges")).sendKeys(addTariff.get("inter_charges"));
		driver.findElement(By.id("sms_charges")).sendKeys(addTariff.get("sms_charges"));
	}

	@When("The User click on submit button")
	public void the_User_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The Tariff plan should be added for the user")
	public void the_Tariff_plan_should_be_added_for_the_user() {
		String txtTariffMessage = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"))
				.getText();
		Assert.assertEquals("Congratulation you add Tariff Plan", txtTariffMessage);
	}
}
