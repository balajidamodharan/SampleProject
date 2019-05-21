package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass {
public static void main(String[] args) {
	WebDriver driver = launchBrowser("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	type(email, "balaji");
	WebElement password = driver.findElement(By.id("pass"));
	type(password, "balaji");
	WebElement btn = driver.findElement(By.id("loginbutton"));
	click(btn);	 
	quit(driver);
}
}		 
