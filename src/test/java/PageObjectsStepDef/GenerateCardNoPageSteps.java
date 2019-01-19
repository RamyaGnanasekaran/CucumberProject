package PageObjectsStepDef;

import cucumber.api.java.en.Given;
import pageobjects.GenerateCardNoPage;

public class GenerateCardNoPageSteps {
	public static String getCreditCard;
	public static String getExpDate;
	public static String getCvv;
	public static String getCreditLimit;
	@Given("the User gets the card details Card number, Cvv, Exp, Credit Limit")
	public void the_User_gets_the_card_details_Card_number_Cvv_Exp_Credit_Limit() throws InterruptedException {
		Thread.sleep(3000);
		GenerateCardNoPage generateCard = new GenerateCardNoPage();
	 getCreditCard = generateCard.getGetCardNo().getText();
		System.out.println(getCreditCard);
	 getExpDate = generateCard.getGetExp().getText();
		System.out.println(getExpDate);
		 getCvv = generateCard.getGetCvv().getText();
		System.out.println(getCvv);
		 getCreditLimit = generateCard.getGetCreditLimit().getText();
		System.out.println(getCreditLimit);
		generateCard.getBtnCart().click();
	}
}
