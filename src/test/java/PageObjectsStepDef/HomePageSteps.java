package PageObjectsStepDef;

import java.util.Set;

import org.hex.Hook1;

import cucumber.api.java.en.Given;
import pageobjects.HomePage;

public class HomePageSteps {
	@Given("the user clicks on Generate Card Number")
	public void the_user_clicks_on_Generate_Card_Number() {
		Hook1.driver.get("http://demo.guru99.com/payment-gateway/index.php");
		HomePage home = new HomePage();
		home.getBtnGenerateCardNo().click();
		String parentWind = Hook1.driver.getWindowHandle();
		System.out.println(parentWind);
		Set<String> allWindow = Hook1.driver.getWindowHandles();
		System.out.println(allWindow);
		for(String x:allWindow) {
			if(x!=parentWind) {
			Hook1.driver.switchTo().window(x);
			}
		}
	}

}
