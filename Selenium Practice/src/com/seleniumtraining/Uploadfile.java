package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("http://demo.guru99.com/selenium/upload/");
		   driver.manage().window().maximize();
		   //uploadfile_0  terms
		   driver.findElement(By.id("uploadfile_0")).sendKeys("E://Selenium//test.txt");
		   driver.findElement(By.id("terms")).click();
	}

}
