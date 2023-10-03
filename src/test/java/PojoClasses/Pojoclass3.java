package PojoClasses;

import org.baseclass.BaseclassCreation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass3 extends BaseclassCreation {
	public Pojoclass3() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup

	@FindBy(xpath = "(//a[@class='nhsuk-card__link'])[2]")
	private WebElement bloodclk;

	@FindBy(xpath = "(//button[@class='main-navigation__toggle-btn js-navigation-trigger-btn'])[2]")
	private WebElement giveblood;

	@FindBy(xpath = "//a[text()='How blood is used']")
	private WebElement blooduse;

	public WebElement getBloodclk() {
		return bloodclk;

	}

	public WebElement getGiveblood() {
		return giveblood;
	}

	public WebElement getBlooduse() {
		return blooduse;
	}

}
