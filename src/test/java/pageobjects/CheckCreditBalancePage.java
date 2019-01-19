package pageobjects;

import org.hex.Hook1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckCreditBalancePage {
	public CheckCreditBalancePage() {
		PageFactory.initElements(Hook1.driver, this);
	}

	@FindBy(id = "card_nmuber")
	private WebElement txtCardNumber;

	@FindBy(xpath = "//input[@value=\"submit\"]")
	private WebElement btnSubmit;

	@FindBy(xpath = "//h4[text()='Credit Card Balance ']")
	private WebElement getCreditBalance;

	public WebElement getGetCreditBalance() {
		return getCreditBalance;
	}

	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}
