package com.actitime.Tasks;

import org.testng.annotations.Test;

import com.actitime.TimeTrack.ValidLoginTest;
import com.actitime.pages.EnterTimeTrackPage;

import Project1.BaseTest;

public class verifyTaskListPageTest extends BaseTest {
	
	@Test
	public void verifyTasks() throws Throwable
	{
		ValidLoginTest vl = new ValidLoginTest();
		vl.LoginToApp();
		EnterTimeTrackPage et = new EnterTimeTrackPage();
		
	}
	

}
