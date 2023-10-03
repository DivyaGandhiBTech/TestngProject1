package org.healthcare;


import java.util.Date;

import org.baseclass.BaseclassCreation;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PojoClasses.Pojoclass1;
import PojoClasses.Pojoclass2;
import PojoClasses.Pojoclass3;


public class healthcaretest extends BaseclassCreation {
	@BeforeClass(alwaysRun=true)
	private void BrowserOpen() {
		openEdge();
		maxwindow();

	}

	@BeforeMethod
	private void startTime() {
		launchUrl("https://www.nhs.uk/");
		Date d = new Date();
		System.out.println(d);
		applyImplicitWait();

	}

	@Test(enabled = true,priority = -2,groups="orange")
	
	private void Searchanyone() {
		Pojoclass1 p = new Pojoclass1();

		WebElement search = p.getSearch();
		fillTextBox(search, "cancer");

		WebElement searchbtn = p.getSearchbtn();
		toClick(searchbtn);

		WebElement firstLink = p.getFirstLink();
		toClick(firstLink);

		WebElement click = p.getClick();
		toClick(click);

	System.out.println("Searchanyone:"+Thread.currentThread().getId());
		String currentUrl = driver.getCurrentUrl();
	SoftAssert s=new SoftAssert();
	s.assertTrue(currentUrl.contains("login"), "check the credential");
	System.out.println("Hello how are you");
	s.assertAll();
	System.out.println("check");
																						

	}
	

	
	@Test(enabled = true, priority = -7,groups={"smoke" ,"sanity"})
	private void loginbutton() {
		Pojoclass2 p2 = new Pojoclass2();

		WebElement clklgn = p2.getClklgn();
		toClick(clklgn);

		WebElement toclk = p2.getToclk();
		toClick(toclk);

		WebElement txtemail = p2.getTxtemail();
		fillTextBox(txtemail, "renu123@gmail.com");

		WebElement btnck = p2.getBtnck();
		toClick(btnck);

		WebElement beginbtn = p2.getBeginbtn();
		toClick(beginbtn);

		long id = Thread.currentThread().getId();
		System.out.println("loginbutton:"+id);
		

	}

	
	@Test(invocationCount = 3, priority = 10,groups="sanity")
	private void saveblood() {
		Pojoclass3 p3 = new Pojoclass3();

		WebElement bloodclk = p3.getBloodclk();
		toClick(bloodclk);

		WebElement giveblood = p3.getGiveblood();
		toClick(giveblood);

		WebElement blooduse = p3.getBlooduse();
		mousehovering(blooduse);
		toClick(blooduse);

		System.out.println("saveblood:"+Thread.currentThread().getId());
	}

}
