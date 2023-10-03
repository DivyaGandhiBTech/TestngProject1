package org.healthcare;

import java.util.Date;

import org.baseclass.BaseclassCreation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import PojoClasses.Pojoclass2;

public class Loginpage extends BaseclassCreation {

	@BeforeClass(alwaysRun = true)
	private void BrowserOpen() {
		openEdge();
		maxwindow();
		launchUrl("https://www.nhs.uk/");

	}

	@BeforeMethod
	private void startTime() {

		Date d = new Date();

		System.out.println(d);
		applyImplicitWait();

	}

	@Test(priority = 1)

	private void lognemail() {
		Pojoclass2 p2 = new Pojoclass2();

		WebElement clklgn = p2.getClklgn();
		toClick(clklgn);

		WebElement toclk = p2.getToclk();
		toClick(toclk);

		WebElement txtemail = p2.getTxtemail();
		fillTextBox(txtemail, "abcd@gmail.com");

		WebElement btnck = p2.getBtnck();
		toClick(btnck);

		WebElement beginbtn = p2.getBeginbtn();
		toClick(beginbtn);
String current = driver.getCurrentUrl();

Assert.assertTrue(current.contains("remover"), "Invalid curencial");

System.out.println("lognemail pass");
		
	System.out.println("lognemail:"+Thread.currentThread().getId());

	}

}
