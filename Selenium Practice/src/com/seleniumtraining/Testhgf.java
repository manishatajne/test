package com.seleniumtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Testhgf {
	
	 WebDriver driver; 
	 Select myselect; 
  
	 @Test
	 
  public void fillform() {
		 
	//	 Contactuspage cp = new Contactuspage();
		 
		 Contactuspage cp = PageFactory.initElements(driver, Contactuspage.class);
		 
	   
		 driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	   
	    /* cp.setusername(driver, "Manisha");
		 cp.setemail(driver, "manisha.tajne@gmail.com");
		 cp.setphone(driver, "9820035250");
		 cp.setmessage(driver, "This is Testing");*/
		 
	     cp.setusername("Manisha");
		 cp.setemail( "manisha.tajne@gmail.com");
		 cp.setphone("9820035250");
		 cp.setmessage("This is Testing");
		 
	   //driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys("Manisha Tajne");
	   //driver.findElement(By.name("txtEmail")).sendKeys("manisha.tajne@gmail.com");
	   //driver.findElement(By.name("txtContact")).sendKeys("9820035250");
	   //driver.findElement(By.name("txtMessage")).sendKeys("This is Testing");
	   
	   //Select myselect = new Select(driver.findElement(By.id("ddlSubject")));		
	   //myselect.selectByVisibleText("Feedback");		   
	   
	   //driver.findElement(By.name("btnSubmit")).click();
	   
	   cp.setselect(myselect, "Feedback");
	   cp.clickbutton();
  
}

	 @Test
	 public void login() {
		   driver.get("http://lms.techcanvass.co.in/Login.aspx");
		   driver.findElement(By.id("txtLoginid")).sendKeys("Manisha Tajne");
		   driver.findElement(By.id("txtpassword")).sendKeys("Manisha Tajne");
		   driver.findElement(By.name("btnLogin")).click();
		   driver.switchTo().alert().accept();
		   driver.findElement(By.id("txtLoginid")).clear();
		   driver.findElement(By.id("txtpassword")).clear();
	 }

	 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "E://Selenium/chromedriver_win32//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	   
  }

}
