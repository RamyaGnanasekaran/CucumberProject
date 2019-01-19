package pageobjects;

import org.hex.Hook1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateOrderIdPage {
	public GenerateOrderIdPage() {
		PageFactory.initElements(Hook1.driver, this);
	}

	@FindBy(xpath = "//h2[text()='Payment successfull!']")
	private WebElement getPaymentSuccess;

	public WebElement getGetPaymentSuccess() {
		return getPaymentSuccess;
	}

}
