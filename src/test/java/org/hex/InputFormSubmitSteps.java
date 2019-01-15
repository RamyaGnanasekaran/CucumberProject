package org.hex;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class InputFormSubmitSteps {
	WebDriver driver;

	@Given("The User is in Selenium home page to submit Input form")
	public void the_User_is_in_Selenium_home_page_to_submit_Input_form() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Input Form Submit page")
	public void the_User_navigates_to_the_Input_Form_Submit_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Input Form Submit'])[1]")).click();
	}

	@When("The user fill in the details in the input form Page")
	public void the_user_fill_in_the_details_in_the_input_form_Page(DataTable dataTable) {
		List<String> inputFormDetailsList = dataTable.asList(String.class);
		driver.findElement(By.name("first_name")).sendKeys(inputFormDetailsList.get(0));
		driver.findElement(By.name("last_name")).sendKeys(inputFormDetailsList.get(1));
		driver.findElement(By.name("email")).sendKeys(inputFormDetailsList.get(2));
		driver.findElement(By.name("phone")).sendKeys(inputFormDetailsList.get(3));
		driver.findElement(By.name("address")).sendKeys(inputFormDetailsList.get(4));
		driver.findElement(By.name("city")).sendKeys(inputFormDetailsList.get(5));
		WebElement dDnState = driver.findElement(By.name("state"));
		Select s = new Select(dDnState);
		s.selectByVisibleText("California");
		driver.findElement(By.name("zip")).sendKeys(inputFormDetailsList.get(6));
		driver.findElement(By.name("website")).sendKeys(inputFormDetailsList.get(7));
		driver.findElement(By.xpath("(//input[@name=\"hosting\"])[2]")).click();
		driver.findElement(By.name("comment")).sendKeys(inputFormDetailsList.get(8));

	}

	@When("the user clicks on Send button")
	public void the_user_clicks_on_Send_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("The success message should display")
	public void the_success_message_should_display() {
		Assert.assertTrue("To verify the Input form URL", driver.getCurrentUrl().contains("input-form"));
	}

}
