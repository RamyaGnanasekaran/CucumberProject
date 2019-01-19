package PageObjectsStepDef;

import org.junit.Assert;

import cucumber.api.java.en.Then;

import pageobjects.GenerateCardNoPage;
import pageobjects.GenerateOrderIdPage;

public class GenerateOrderIdPageSteps {
	public  GenerateOrderIdPage sucessVerify;

	@Then("Verify the order successful message")
	public void verify_the_order_successful_message() {
		// GenerateOrderIdPage orderID = new GenerateOrderIdPage();
		sucessVerify = new GenerateOrderIdPage();
		String actual = sucessVerify.getGetPaymentSuccess().getText();
		Assert.assertEquals("Payment successfull!", actual);

	}
}
