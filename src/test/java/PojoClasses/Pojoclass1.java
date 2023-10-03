package PojoClasses;

import org.baseclass.BaseclassCreation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass1 extends BaseclassCreation {

	public Pojoclass1() {
		PageFactory.initElements(driver, this);
	}
	
		
	
	@CacheLookup
	@FindBy(id="search-field")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	@FindBy(xpath="(//h2[@class='nhsuk-heading-xs nhsuk-u-margin-bottom-2'])[1]")
	private WebElement FirstLink;

	public WebElement getFirstLink() {
		return FirstLink;
	}
	

	@FindBy(xpath="//a[contains(text(),'stomach ')]")
	private WebElement click;

	public WebElement getClick() {
		return click;
	
	}
}
