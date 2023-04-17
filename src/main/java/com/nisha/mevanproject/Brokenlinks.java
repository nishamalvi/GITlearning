package com.nisha.mevanproject;

import org.openqa.selenium.WebDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = Helper.getChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
