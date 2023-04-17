package com.nisha.mevanproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		// To check UI element enabled or disabled?
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("its disabled");
			Assert.assertTrue(false);
		}
		
		
	}
}
