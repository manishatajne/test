package com.seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://techcanvass.com/");
		   driver.manage().window().maximize();
		   //driver.findElement(By.id("txtName")).sendKeys("Manisha Tajne");
		   Actions action = new Actions(driver);
		   
		  // Thread.sleep(1000);
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		   WebElement ce = driver.findElement(By.linkText("Courses"));
		  // Thread.sleep(1000);
		   action.moveToElement(ce).build().perform();
		   //Thread.sleep(1000);
		   
		   WebElement au = driver.findElement(By.linkText("Automation Testing Courses"));
		   //Thread.sleep(1000);
		   action.moveToElement(au).build().perform();
		  // Thread.sleep(1000);
		   
		   WebElement se = driver.findElement(By.linkText("Selenium Training"));
		  // Thread.sleep(1000);
		   action.moveToElement(se).build().perform();
		   se.click();		   	   
	}
	

}
