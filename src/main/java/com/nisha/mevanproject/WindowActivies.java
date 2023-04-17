package com.nisha.mevanproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close();
	}

}
