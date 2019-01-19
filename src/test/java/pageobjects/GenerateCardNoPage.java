package pageobjects;

import org.hex.Hook1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateCardNoPage {
	public GenerateCardNoPage() {
		PageFactory.initElements(Hook1.driver, this);
	}

	@FindBy(xpath = "(//h4[@style=\"text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;\"])[1]")
	private WebElement getCardNo;

	@FindBy(xpath = "(//h4[@style=\"text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;\"])[2]")
	private WebElement getCvv;

	@FindBy(xpath = "(//h4[@style=\"text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;\"])[3]")
	private WebElement getExp;

	@FindBy(xpath = "(//h4[@style=\"text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;\"])[4]")
	private WebElement getCreditLimit;

	@FindBy(xpath = "//a[text()='Cart']")
	private WebElement btnCart;
	
	public WebElement getGetCardNo() {
		return getCardNo;
	}

	public WebElement getGetCvv() {
		return getCvv;
	}

	public WebElement getGetExp() {
		return getExp;
	}

	public WebElement getGetCreditLimit() {
		return getCreditLimit;
	}

	public WebElement getBtnCart() {
		return btnCart;
	}

}	