package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Medopluslogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		   
		
		driver.get("http://medopsplus.techcanvass.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys("avinash");
		driver.findElement(By.id("txtPassword")).sendKeys("avinash");
		driver.findElement(By.id("LoginButton")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtBillNo\"]")).sendKeys("120");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtFName\"]")).sendKeys("Manisha");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLName\"]")).sendKeys("Tajne");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtAge\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtContactNo\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddldoctorname\"]")).click();
		
		Select myselect = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddldoctorname\"]")));
		
		myselect.selectByVisibleText("Dr. Pankesh Yadav");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtRefDoct\"]")).sendKeys("Saurabh");
		
		
		
		
	}

}
