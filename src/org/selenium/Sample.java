package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement btn = driver.findElement(By.id("Click"));
btn.click();
String text = btn.getText();
System.out.println(text);
driver.switchTo().defaultContent();

driver.switchTo().frame(1);
driver.switchTo().frame("frame2");
driver.findElement(By.id("Click1")).click();

driver.switchTo().defaultContent();

List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
int size = totalframes.size();
System.out.println(size);
}
}


