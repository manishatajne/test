package com.seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Formfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   WebDriverWait wait = new WebDriverWait(driver,60); 
		   driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		   //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   //driver.findElement(By.id("txtName")).sendKeys("Manisha Tajne");
		   //WebElement namelink = (WebElement)wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"txtName\"]")));
		   //namelink.sendKeys("Manisha Tajne");
		   //driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys("Manisha Tajne");
		   //driver.findElement(By.name("txtEmail")).sendKeys("manisha.tajne@gmail.com");
		   //driver.findElement(By.name("txtContact")).sendKeys("9820035250");
		   //driver.findElement(By.name("txtMessage")).sendKeys("This is Testing");
		   
		   Select myselect = new Select(driver.findElement(By.id("ddlSubject")));		
		    
		   myselect.selectByVisibleText("Feedback");		   
		   driver.findElement(By.name("btnSubmit")).click();*/
		
		
		System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   //WebDriverWait wait = new WebDriverWait(driver,60); 
		   driver.get("http://demo.guru99.com/test/guru99home/");
		   driver.manage().window().maximize();
		   driver.switchTo().frame("a077aa5e");
		   driver.findElement(By.xpath("/html/body/a/img")).click();
	}

}
