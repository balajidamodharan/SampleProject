package org.selenium;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Good extends BaseClass{
	LocatorClass l=new LocatorClass();
@BeforeClass
public static void launchbrowser() {
	WebDriver driver=launchBrowser("https://www.facebook.com/");

}

@Before
public void startTime() {
    Date d=new Date();
    System.out.println(d);

}
@After
public void endTime() {
	Date d=new Date();
	System.out.println(d);

}
/*@AfterClass
public static void closeBrowser() {
	quit(driver);

}*/
@Test
public void aloginDetails() {
	type(l.getTxtEmail(), "Balaji");
	type(l.getTxtpass(), "bala");
	
}
@Test
public void bcreateAccount() {
	type(l.getGetfirstname(), "Balaji");
	type(l.getGetlastname(), "Damodharan");
	type(l.getGetmailid(), "trybala29@gmail.com");
	type(l.getGetpassword(), "bala29121991");
	Dropdown(l.getDay(), "1");
	Dropdown(l.getMonth(), "Feb");
	Dropdown(l.getYear(), "1991");
}
@Test
public void clickLogin() {
	click(l.getBtn());

}


}
