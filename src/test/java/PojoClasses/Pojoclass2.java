package PojoClasses;

import org.baseclass.BaseclassCreation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass2 extends BaseclassCreation {

	public Pojoclass2() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath="//div[@class='nhsuk-account__login']")
	private WebElement clklgn;

	@FindBy(xpath = "//a[@class='nhsuk-button ']")
	private WebElement toclk;

	@FindBy(id = "user-email")
	private WebElement txtemail;

	@FindBy(xpath = "//button[text()=' Continue ']")
	private WebElement btnck;

	@FindBy(id = "amzn-captcha-verify-button")
	private WebElement beginbtn;

	public WebElement getClklgn() {
		return clklgn;
	}

	public WebElement getToclk() {
		return toclk;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getBtnck() {
		return btnck;
	}

	public WebElement getBeginbtn() {
		return beginbtn;
	}

}
