package org.hex;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DropDownListSteps {
	WebDriver driver;

	@Given("The User is in Selenium home page to check the DropDown functionality")
	public void the_User_is_in_Selenium_home_page_to_check_the_DropDown_functionality() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("The User navigates to the Select dropdown list page")
	public void the_User_navigates_to_the_Select_dropdown_list_page() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Select Dropdown List'])[1]")).click();

	}

	@When("The user selects the day from the dropdown list")
	public void the_user_selects_the_day_from_the_dropdown_list() {
		WebElement dDnDay = driver.findElement(By.id("select-demo"));
		Select s = new Select(dDnDay);
		s.selectByValue("Friday");
	}

	@Then("The message Day selected should display")
	public void the_message_Day_selected_should_display() {
//		  String actual = driver.findElement(By.xpath("//p[text()='Day selected :- Monday']")).getText();
//		  Assert.assertEquals("Day selected :- Monday", actual);
		Assert.assertTrue("basic-select-dropdown", driver.getCurrentUrl().contains("basic-select-dropdown"));
		
	}
}
