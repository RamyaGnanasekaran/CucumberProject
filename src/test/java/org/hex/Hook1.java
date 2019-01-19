package org.hex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook1 {
	public static WebDriver driver;

	@Before
	public static void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		driver = new ChromeDriver();

	}
	// @After
	// public static void afterMethod() {
	// driver.close();
	// driver.quit();
	// }
}
