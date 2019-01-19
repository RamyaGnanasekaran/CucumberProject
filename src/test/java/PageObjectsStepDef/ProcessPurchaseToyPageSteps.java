package PageObjectsStepDef;

import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.ProcessPurchaseToyPage;

public class ProcessPurchaseToyPageSteps {
	public static GenerateCardNoPageSteps generate;

	@When("The user Clicks on Cart fill in the details and click on Buy now button")
	public void the_user_Clicks_on_Cart_fill_in_the_details_and_click_on_Buy_now_button() {
		HomePage buy = new HomePage();
		buy.getBtnBuyNow().click();
	}

	@When("The user navigates to the payment process page and fill in the card details and click on Pay button")
	public void the_user_navigates_to_the_payment_process_page_and_fill_in_the_card_details_and_click_on_Pay_button() throws InterruptedException {
		ProcessPurchaseToyPage purchaseToy = new ProcessPurchaseToyPage();
		Thread.sleep(3000);
		generate = new GenerateCardNoPageSteps();
		String creditCard = generate.getCreditCard;
		String[] c = creditCard.split(" ");
		purchaseToy.getTxtCardNumber().sendKeys(c[2]);
		String date = generate.getExpDate;
		String[] d = date.split(" ");
		String[] mY = d[1].split("/");
		purchaseToy.getSelectMonth().sendKeys(mY[0]);
		purchaseToy.getSelectYear().sendKeys(mY[1]);
		String cvv = generate.getCvv;
		String[] cv = cvv.split(" ");
		purchaseToy.getTxtCvvCode().sendKeys(cv[1]);
		purchaseToy.getBtnSubmit().click();

	}

}
