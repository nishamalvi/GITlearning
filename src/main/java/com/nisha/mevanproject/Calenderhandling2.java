package com.nisha.mevanproject;

import java.awt.Rectangle;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calenderhandling2 {

	// private static final JavascriptExecutor JavascriptExecutor(driver); = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setAcceptInsecureCerts(true);
				
		WebDriver driver = Helper.getChromeDriver(chromeOptions);
		driver.get("https://www.path2usa.com/travel-companion/");

		WebElement element = driver.findElement(By.id("form-field-travel_comp_date"));
		
		WebElement focusedElement = Helper.scrollToElement(element, driver);
		new Actions(driver).moveToElement(focusedElement).perform();
		focusedElement.click();
		// Thread.sleep(3000);

		// List<WebElement> dates =
		// driver.findElements(By.cssSelector("span[tabindex=\"-1\"]"));
		/*int count = driver.findElements(By.cssSelector("span[tabindex=\"-1\"]")).size();
		System.out.println(count);

		while (!driver.findElement(By.cssSelector("div[class='flatpickr-current-month']")).getText().contains("June")) {
			Thread.sleep(3000);
			WebElement element3 = driver
					.findElement(By.cssSelector("span[class=\"flatpickr-next-month\"] svg[version=\"1.1\"]"));

			element3.click();
		}

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("span[tabindex=\"-1\"]")).get(i).getText();
			if (text.equalsIgnoreCase("25")) {
				driver.findElements(By.cssSelector("span[tabindex=\"-1\"]")).get(i).click();
				break;
			}
		}*/

	}

}
