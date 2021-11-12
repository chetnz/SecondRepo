package com.actitime.TimeTrack;

import org.testng.annotations.Test;

import com.actitime.pages.LoginPage;

import Project1.BaseTest;
import Project1.FileLib;
import Project1.WebDriverGenericMethods;

public class ValidLoginTest extends BaseTest {
	@Test
	public void LoginToApp() throws Throwable
	{
		LoginPage lp = new LoginPage();
		FileLib fb = new FileLib();
		lp.login(fb.readProperty(PROP_PATH, "username"), fb.readProperty(PROP_PATH, "password"));
		
		WebDriverGenericMethods wb = new WebDriverGenericMethods();
		wb.waitForTitle(fb.readProperty(PROP_PATH, "homeTitle"));
		wb.verify(fb.readProperty(PROP_PATH, "homeTitle"), wb.getPageTitle(), "Enter Time Track Page");
	}
	

}
