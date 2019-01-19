package pageobjects;

import org.hex.Hook1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessPurchaseToyPage {
	public ProcessPurchaseToyPage() {
		PageFactory.initElements(Hook1.driver, this);
	} 

	@FindBy(name = "card_nmuber")
	private WebElement txtCardNumber;
	
	@FindBy(id = "month")
	private WebElement selectMonth;
	
	@FindBy(id = "year")
	private WebElement selectYear;
	
	@FindBy(id = "cvv_code")
	private WebElement txtCvvCode;
	
	@FindBy(name = "submit")
	private WebElement btnSubmit;

	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getTxtCvvCode() {
		return txtCvvCode;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}
