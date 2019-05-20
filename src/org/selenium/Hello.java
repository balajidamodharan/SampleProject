package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hello {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement date_dropdown = driver.findElement(By.id("day"));
		Select date_dd=new Select(date_dropdown);
		date_dd.selectByIndex(29);
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		month_dd.selectByVisibleText("Dec");
		
		WebElement year_dropdown = driver.findElement(By.id("year"));
		Select year_dd=new Select(year_dropdown);
		year_dd.selectByValue("1991");
		
		
		WebElement getdate = date_dd.getFirstSelectedOption();
		String date = getdate.getText();
		WebElement getmonth = month_dd.getFirstSelectedOption();
		String month = getmonth.getText();
		WebElement getyear = year_dd.getFirstSelectedOption();
		String year = getyear.getText();
		
		System.out.println(date + month + year);
		
		
		List<WebElement> total_months = month_dd.getOptions();
		int totalcount = total_months.size();
		System.out.println("total number of months is : "+totalcount);
		
		for (WebElement gettomon : total_months) {
			System.out.println(gettomon.getText());
		}
		}
	}

