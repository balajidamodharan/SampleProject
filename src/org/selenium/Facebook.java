package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("balaji");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("bala");
	WebElement btn = driver.findElement(By.id("loginbutton"));
	btn.click();
	driver.quit();
}
}
