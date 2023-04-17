package com.nisha.mevanproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) {
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver= Helper.getChromeDriver(chromeoptions);
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
