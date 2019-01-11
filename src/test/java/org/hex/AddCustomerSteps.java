package org.hex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddCustomerSteps {
	WebDriver driver;

	@Given("The User is in gurantetelecom home page")
	public void the_User_is_in_gurantetelecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The User navigates to add customer page")
	public void the_User_navigates_to_add_customer_page() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

	}

	@When("The user fill in the details")
	public void the_user_fill_in_the_details(DataTable dataTable) {
		List<String> customerDetailsList = dataTable.asList();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(customerDetailsList.get(0));
		driver.findElement(By.id("lname")).sendKeys(customerDetailsList.get(1));
		driver.findElement(By.id("email")).sendKeys(customerDetailsList.get(2));
		driver.findElement(By.xpath("//textarea[@placeholder=\"Enter your address\"]")).sendKeys(customerDetailsList.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(customerDetailsList.get(4));

	}

	@When("the User clicks the submit button")
	public void the_User_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The Customer ID should be generated for the user")
	public void the_Customer_ID_should_be_generated_for_the_user() {
		String textVerify = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']")).getText();
		Assert.assertEquals("Please Note Down Your CustomerID", textVerify);
	}
}
