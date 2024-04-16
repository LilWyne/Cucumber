package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static class Base_Class {

		public static WebDriver driver = Browser_Lanuch("chrome");

		public static WebDriver Browser_Lanuch(String Browser) {

			if (Browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ADMIN\\eclipse-workspace\\MAVENEXP\\Chrome\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			return driver;

		}

		public static void Get_Url(String value) {
			driver.get(value);
		}

		public static void Send_Key(WebElement element, String value) {
			element.sendKeys(value);
		}

		public static void Click(WebElement element) {
			element.click();
		}

		public static void Double_Click(WebElement element) {
			Actions doubleclick = new Actions(driver);
			doubleclick.doubleClick(element);
		}

		public static void DropDown(WebElement element, String value) {
			Select m = new Select(element);
			m.selectByValue(value);
		}

		public static void DropDownINT(WebElement element, int value) {
			Select n = new Select(element);
			n.selectByIndex(value);
		}

		public static void Move_On_Element(WebElement value) {
			Actions p = new Actions(driver);
			p.moveToElement(value);
		}

		public static void alert_accept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		public static void alert_dismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public static void ScrollDown(WebElement element) {
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("window.scroll(0,1000)");
		}

		public static void Screen_Shot() throws IOException {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File m = screen.getScreenshotAs(OutputType.FILE);
			File n = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MAVENEXP\\Screenshot\\as.png");
			FileUtils.copyFile(m, n);
		}

	}

}
