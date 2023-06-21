package com.projectObjectmodel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectObjectmodel.utilities.PageUtilities;

public class FlightPage {
	public WebDriver driver;
	@FindBy(xpath="//a[text()='Flights']")
	WebElement flight;
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement roundtrip;
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passengerDropDown;
	@FindBy(xpath="//select[@name='passCount']//child::option[1]")
	WebElement passengerdropdownvalue1;
	@FindBy(xpath="//input[@value='oneway']")
	WebElement oneway1;
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement depart;
	@FindBy(xpath="//select[@name='fromPort']//child::option[4]")
	WebElement departselection;
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElement month;
	@FindBy(xpath="//select[@name='fromMonth']//child::option[4]")
	WebElement monthselection;
	@FindBy(xpath="//input[@value='Coach']")
	WebElement service;
	
	
	public  FlightPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickflights()
	{
		flight.click();
	
	}
	public boolean roundTripSelection()
	{
		
	boolean rounds=roundtrip.isSelected();
	return rounds;

	
	}

	public boolean oneWaySelection()
	{
		boolean onewaySelect=oneway1.isSelected();
		return onewaySelect;
	}
	public void clickOneway() {
		 oneway1.click();
	}
	
	
	public void dropDownSelection(int passCount)
	{
		PageUtilities.selectClassDropdown(driver,  passengerDropDown).selectByIndex(passCount);
	
		
	}

	public String gettingTextofdropdown()
	{
		return passengerdropdownvalue1.getText();
		
	
	}
	public void departdrop(int value)
	{
		PageUtilities.selectClassDropdown(driver, depart).selectByIndex(value);
	}
	public String getTextDeparture()
	{
	return departselection.getText();
	}
	public void selectMonth(int index) {
		PageUtilities.selectClassDropdown(driver, month).selectByIndex(index);
		
		
	}
	public String montText()
	{
		return monthselection.getText();
	}
	public boolean serviceClass()
	
	{
	boolean select=service.isSelected();
	
		return select;
	}
}

