package com.nisha.mevanproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\NISHA\\Workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = Helper.getChromeDriver();
		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D:\\NISHA\\testscreenshot.png"));

	}

}
