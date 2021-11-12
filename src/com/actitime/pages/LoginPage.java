package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project1.BaseTest;

public class LoginPage {
   //Declaration
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath="//div[text()='Login']") private WebElement LoginBtn;
	
	//Initialization
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	//Utilization
	public WebElement getUntb()
	{
		return untb;
	}
	public void setUntb(String un)
	{
		untb.sendKeys(un);
	}
	public WebElement getPwd()
	{
		return pwtb;
	}
	public void setPwtb(String pwd)
	{
		pwtb.sendKeys(pwd);
	}
	public WebElement getLoginBtn()
	{
		return LoginBtn;
	}
	public void clickLoginBtn()
	{
		LoginBtn.click();
	}
	public void login(String un, String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		LoginBtn.click();
	}
}
