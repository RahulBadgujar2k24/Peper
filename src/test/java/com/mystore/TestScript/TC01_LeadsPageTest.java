package com.mystore.TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pepercloud.pom.LeadsModule_01;

public class TC01_LeadsPageTest extends baseclassTC {

	@Test()
	public void creatlead() throws IOException {

		driver.manage().window().maximize();

		LeadsModule_01 lp = new LeadsModule_01(driver);
		lp.enterEmail_ID("qa-tester@peppercloud.io");
		logger.info("enter valid uid");
		lp.clickonNextButton();
		logger.info("click on login button");
		lp.enterPassword("Demo_PC*123");
		logger.info("enter valid pass");
		lp.clickonLoginButton();;
		logger.info("click on login button");
		lp.createleadbutton();
		logger.info("click on create lead button");
		lp.enterFirstName("rahul");
		logger.info("enter first name");
		lp.enterLastName("rdj");
		logger.info("enter last name");
		lp.entercompanyName("pepercloud");
		
		logger.info("enter company name");
		lp.enterDesignation("QA");
		logger.info("enter designation ");
		lp.enteremailaddress("abcdrddddgt@gmail.com");
		logger.info("enter email address");
		lp.enteremobilenumber("+917559127923");
		logger.info("enter mobile number");
		lp.clickonsavebutton();
		logger.info("click on save button");
	

	}

}
