package PageObjectsStepDef;

import org.junit.Assert;

import cucumber.api.java.en.Then;

import pageobjects.CheckCreditBalancePage;

public class CheckCreditBalancePageSteps {

	public static GenerateCardNoPageSteps card;
	public static CheckCreditBalancePage finalBal;

	@Then("the user check the Credit card limit")
	public void the_user_check_the_Credit_card_limit() throws InterruptedException {
		card = new GenerateCardNoPageSteps();
		finalBal = new CheckCreditBalancePage();
		Thread.sleep(3000);
		CheckCreditBalancePage balance = new CheckCreditBalancePage();
		balance.getTxtCardNumber().sendKeys(card.getCreditCard);
		balance.getBtnSubmit().click();
		String actual1 = balance.getGetCreditBalance().getText();
		Assert.assertEquals(finalBal.getGetCreditBalance(), actual1);

	}
}
