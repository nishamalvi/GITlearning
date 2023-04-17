package com.nisha.mevanproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = Helper.getChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size()); // to get all the links count on the page
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size()); // geting links count only on footer of
																				// the webpage
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size()); // getting links only on one column
		// click on all the links of column n check is it opening
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String pressCtrlEnter = Keys.chord(Keys.CONTROL, Keys.ENTER); // press control n enter will open the links
																			// in different tabs
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(pressCtrlEnter);
			Thread.sleep(5000);
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
