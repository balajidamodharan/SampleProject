package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
WebElement multiple = driver.findElement(By.id("selenium_commands"));
Select s=new Select(multiple);
boolean multiple2 = s.isMultiple();
System.out.println(multiple2);
List<WebElement> options = s.getOptions();
for (WebElement opt : options) {
	String text = opt.getText();
	System.out.println(text);
	if(text.equals("Browser Commands")|text.equals("Wait Commands")) {
		s.selectByVisibleText(text);
		
	}
	System.out.println("get all selected option");
	List<WebElement> allselopt = s.getAllSelectedOptions();
	for (WebElement getallselopt : allselopt) {
		String text2 = getallselopt.getText();
		s.selectByVisibleText(text2);
		System.out.println(text2);
	}
}
}
}