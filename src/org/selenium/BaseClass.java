package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static WebDriver launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
return driver;
}
	public static void type(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void click(WebElement e) {
		e.click();

	}
	public static void quit(WebDriver d) {
		d.quit();

	}
}
