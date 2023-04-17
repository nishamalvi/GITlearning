package com.nisha.mevanproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		//mouse hover
		a.moveToElement(driver.findElement(By.cssSelector("a[id=\"nav-link-accountList\"]"))).build().perform();
		//enter all uppercase letters in textbox 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//select the text with mouse double click
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("a[id=\"nav-link-accountList\"]"))).contextClick().build().perform();
		

		
	
	}
}
