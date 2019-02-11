package org.hex;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InputFormsSteps {
	WebDriver driver;
	@Given("The User is in gurantetelecom home page to submit the Input Form")
	public void the_User_is_in_gurantetelecom_home_page_to_submit_the_Input_Form() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to Input Form page")
	public void the_User_navigates_to_Input_Form_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Input Form Submit'])[1]")).click();
	}
	public void the_user_fill_in_the_Input_Form_details(String fname, String lname, String email, String phone, String address, String city, String pincode, String domain, String desc) {
	   driver.findElement(By.name("first_name")).sendKeys(fname);
	   driver.findElement(By.name("last_name")).sendKeys(lname);
	   driver.findElement(By.name("email")).sendKeys(email);
	   driver.findElement(By.name("phone")).sendKeys(phone);
	   driver.findElement(By.name("address")).sendKeys(address);
	   driver.findElement(By.name("city")).sendKeys(city);
	   driver.findElement(By.name("zip")).sendKeys(pincode);
	   driver.findElement(By.name("website")).sendKeys(domain);
	   driver.findElement(By.name("comment")).sendKeys(desc);
	   
	}

	@When("the User clicks the send button")
	public void the_User_clicks_the_send_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("Verify the from submited Url")
	public void verify_the_from_submited_Url() {
		Assert.assertTrue("To verify the Input form URL", driver.getCurrentUrl().contains("input-form"));
	}



}
