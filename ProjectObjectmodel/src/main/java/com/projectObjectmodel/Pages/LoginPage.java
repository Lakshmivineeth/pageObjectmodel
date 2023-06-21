package com.projectObjectmodel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	//instead of driver.findlt(pom with page factory ie @findby) objt repository kooti vaykuka 
	@FindBy(xpath="//input[@name='userName']")
	WebElement user;//ithil driver.findelemt und
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='submit']")
	WebElement login;
	
	
	//constructor declare
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//inside pagefactry mtd named mtsd driver lotu valu epass aakan
	
	}
	public void setUsername(String userName)//excel
	{
		user.sendKeys(userName);
	}
	public void setpassword(String password1)
	{
		password.sendKeys(password1);
	}
	public void clicksignin()
	{
		login.click();
	
	}
	
}
