package com.Pepercloud.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadsModule_01 {

	WebDriver localdriver;

	public LeadsModule_01(WebDriver rdriver) {
		localdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfield;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement NextButton;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//button[@id='LF1']")
	WebElement createlead;
	
	@FindBy(name = "firstName")
	WebElement ufirstname;
	
	@FindBy(name = "lastName")
	WebElement ulastname;
	
	@FindBy(name = "company")
	WebElement Company;
	
	@FindBy(name = "designation")
	WebElement Designation;
	
	@FindBy(name = "email")
	WebElement emailaddress;
	
	@FindBy(name = "mobile")
	WebElement mobile;
	
	@FindBy(id = "SAVE")
	WebElement save;



	public void enterEmail_ID(String un) {
		emailfield.sendKeys(un);
	}

	public void clickonNextButton() {
		NextButton.click();
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickonLoginButton() {
		LoginButton.click();
	}
	public void createleadbutton() {
		createlead.click();
	}

	public void enterFirstName(String fn) {
		ufirstname.sendKeys(fn);
	}
	public void enterLastName(String ln) {
		ulastname.sendKeys(ln);
	}
	public void entercompanyName(String com) {
		Company.sendKeys(com);
	}
	public void enterDesignation(String des) {
		Designation.sendKeys(des);
	}
	public void enteremailaddress(String mail) {
		emailaddress.sendKeys(mail);
	}
	public void enteremobilenumber(String mo) {
		mobile.sendKeys(mo);
	}
	public void clickonsavebutton() {
		save.click();
	}
	
	
}
