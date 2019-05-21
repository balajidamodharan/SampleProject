package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorClass extends BaseClass {
public LocatorClass() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement txtEmail;
@FindBy(id="pass")
private WebElement txtpass;
@FindBy(xpath = "//input[@value='Log In']")
private WebElement btn;
@FindBy(id="u_0_j")
private WebElement getfirstname;
@FindBy(name="lastname")
private WebElement getlastname;
@FindBy(name="reg_email__")
private WebElement getmailid;
@FindBy(xpath="(//input[@type='password'])[2]")
private WebElement getpassword;
@FindBy(id="day")
private WebElement day;
@FindBy(id="month")
private WebElement month;
@FindBy(id="year")
private WebElement year;
public WebElement getTxtEmail() {
	return txtEmail;
}
public WebElement getTxtpass() {
	return txtpass;
}
public WebElement getBtn() {
	return btn;
}
public WebElement getDay() {
	return day;
}
public void setDay(WebElement day) {
	this.day = day;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getGetfirstname() {
	return getfirstname;
}
public WebElement getGetlastname() {
	return getlastname;
}
public WebElement getGetmailid() {
	return getmailid;
}
public WebElement getGetpassword() {
	return getpassword;
}
}
