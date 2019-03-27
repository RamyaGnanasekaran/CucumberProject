package PageObjectsStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Ramya\\eclipse-workspace\\TestPrograms\\CucumberProject\\driver\\chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("http://shopping.rediff.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
}
