package org.selenium;

import org.openqa.selenium.WebDriver;

public class ExecutableClass2 extends BaseClass {
public static void main(String[] args) {
	WebDriver driver = launchBrowser("https://www.facebook.com/");
	LocatorClass l=new LocatorClass();
	type(l.getTxtEmail(), "Balaji");
	type(l.getTxtpass(), "bala");
	click(l.getBtn());
	quit(driver);
	
}
}
