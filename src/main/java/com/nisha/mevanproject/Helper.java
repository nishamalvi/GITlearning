package com.nisha.mevanproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public final class Helper {
	
	public static ChromeDriver getChromeDriver() {
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setAcceptInsecureCerts(true);
	    chromeOptions.addArguments("--start-maximized");
	    chromeOptions.addArguments("--remote-allow-origins=*");
	    return new ChromeDriver(chromeOptions);
	}
	
	public static ChromeDriver getChromeDriver(ChromeOptions chromeOptions) {
	    chromeOptions.addArguments("--start-maximized");
	    chromeOptions.addArguments("--remote-allow-origins=*");
	    return new ChromeDriver(chromeOptions);
	}
	
	public static WebElement scrollToElement(WebElement elementToScroll, WebDriver webDriver) {

	    Rectangle rect = elementToScroll.getRect();
	    int deltaY = rect.y + rect.height;
	    new Actions(webDriver)
	      .scrollByAmount(0, deltaY)
	      .perform();
	    return elementToScroll;

	}
}
