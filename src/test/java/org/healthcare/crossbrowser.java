package org.healthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser {

	WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc1(String name) throws InterruptedException {
		if (name.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} 
		else if (name.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
			
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		driver.get("https://www.nhs.uk/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("search-field"));
		search.sendKeys("pregnancy");
		Thread.sleep(8000);
		WebElement btnclk = driver.findElement(By.xpath("//button[@type='submit']"));
		btnclk.click();
		
		long id = Thread.currentThread().getId();
		System.out.println("tc1 : "+ id);
		}
	

		}
	

