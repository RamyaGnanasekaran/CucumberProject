package pageobjects;

import org.hex.Hook1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Hook1.driver, this);

	}

	@FindBy(name = "quantity")
	private WebElement selectQuantity;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement btnBuyNow;

	@FindBy(xpath = "(//a[text()='Generate Card Number'])[1]")
	private WebElement btnGenerateCardNo;

	@FindBy(xpath = "//a[text()='Check Credit Card Limit'")
	private WebElement btnCheckCardLimit;

	public WebElement getSelectQuantity() {
		return selectQuantity;
	}

	public WebElement getBtnBuyNow() {
		return btnBuyNow;
	}

	public WebElement getBtnGenerateCardNo() {
		return btnGenerateCardNo;
	}

	public WebElement getBtnCheckCardLimit() {
		return btnCheckCardLimit;
	}

}
