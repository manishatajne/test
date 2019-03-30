package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMSLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("http://lms.techcanvass.co.in/Login.aspx");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("txtLoginid")).sendKeys("Manisha Tajne");
		   driver.findElement(By.id("txtpassword")).sendKeys("Manisha Tajne");
		   driver.findElement(By.name("btnLogin")).click();
		   driver.switchTo().alert().accept();
		   driver.findElement(By.id("txtLoginid")).clear();
		   driver.findElement(By.id("txtpassword")).clear();
		   //driver.findElement(By.id("txtLoginid")).sendKeys("manisha.tajn@gmail.com");
		   //driver.findElement(By.id("txtpassword")).sendKeys("@123");
		   //driver.findElement(By.name("btnLogin")).click();
		   
	}

}
