package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Contactuspage {
	
	//By nameParamByXpath = By.xpath("//*[@id=\"txtName\"]");
	//By nameParamById = By.xpath("//*[@id=\"txtName\"]");
	//By emailParam = By.name("txtEmail");
	//By phoneParam = By.name("txtContact");
	//By emailParam = By.name("txtEmail");
	//By messageParam = By.name("txtMessage");
	//By buttonParam = By.name("btnSubmit");
	//By subjectParam = By.id("ddlSubject");
	
	
	@FindBy(xpath="//*[@id=\"txtName\"]")
	WebElement nameParamByXpath;
	
	@FindBy(name="txtEmail")
	WebElement emailParam;
	

	@FindBy(name="txtContact")
	WebElement phoneParam;
	
	@FindBy(name="txtMessage")
	WebElement messageParam;
	
	@FindBy(name="btnSubmit")
	WebElement buttonParam;
	
	@FindBy(id ="ddlSubject")
	WebElement subjectParam;
	
	
	public void setusername(String name)
	{
		//driver.findElement(c).sendKeys(name);
		nameParamByXpath.sendKeys(name);
		
	}
	
	public void setemail(String email)
	{
		emailParam.sendKeys(email);
	}
	
	public void setphone( String phone)
	
	{
		phoneParam.sendKeys(phone);
	}
	
	public void setmessage(String messsage)
	{
		messageParam.sendKeys(messsage);
	}
	
	public void clickbutton()
	{
		buttonParam.click();
	}
	
	public void setselect(Select myselect, String text)
	
	{
		Select mySelect = new Select(subjectParam);		
		mySelect.selectByVisibleText(text);
	}
	
}


