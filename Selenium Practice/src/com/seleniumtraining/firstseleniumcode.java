package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumcode {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		   driver.findElement(By.id("txtName")).sendKeys("Manisha Tajne");
		   driver.findElement(By.name("txtEmail")).sendKeys("manisha.tajne@gmail.com");
		   driver.findElement(By.name("txtContact")).sendKeys("9820035250");
		   
	}

}
  