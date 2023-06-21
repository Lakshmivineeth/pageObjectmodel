package com.projectObjectmodel.Scripts;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.projectObjectmodel.Base.TestBase;
import com.projectObjectmodel.Pages.FlightPage;
import com.projectObjectmodel.Pages.LoginPage;
import com.projectObjectmodel.constants.Constants;

public class FlightTest extends TestBase {
	
	 FlightPage objFlight;
	 @Test(priority=5,description="validating round trip selector",groups= {"smoke"},retryAnalyzer=com.projectObjectmodel.listeners.RetryAnalyzer.class)
	  
	  public void checkRoundTripdefault()
	  {
		 
		  
		  objFlight=new FlightPage(driver);
		  objFlight.clickflights();
		  
		  Assert.assertTrue(objFlight.roundTripSelection(),"Round trip is not selected");
	  }
	 
	 @Test(priority=6,description="validating oneway selector" ,groups= {"smoke"})
	  
	  public void onewaySelect()
	  {
		 objFlight=new FlightPage(driver);
		 objFlight.oneWaySelection();
		 Assert.assertFalse(objFlight.oneWaySelection(),"not selected");
		 
	  }
	 @Test(priority=7,groups= {"smoke"})
	 public void clickOnewaybutton()
	 {
		 objFlight=new FlightPage(driver);
		
		 Assert.assertFalse(objFlight.oneWaySelection(),"not selected ");
	 }
	 @Test(priority=8,groups= {"smoke"})
	 public void clickOnewaybuttonclick()
	 {
		 objFlight=new FlightPage(driver);
		 objFlight.clickOneway();
		 
		 Assert.assertTrue(objFlight.oneWaySelection(),"not selected after clicking");
	 }
	 
	 @Test(priority=9,description="validating passenger drop down",groups= {"smoke"})
	 public void passengerdrop()
	 {
		  objFlight=new FlightPage(driver);
		  objFlight.dropDownSelection(Constants.PASSENGERINDEX);
		  Assert.assertEquals(objFlight.gettingTextofdropdown(), Constants.PASSENGERTEXT);
	 }
	 @Test(priority=10,groups= {"smoke"})
	
	 public void departdrop1()
	 {
		 objFlight=new FlightPage(driver); 
		 objFlight.departdrop(Constants.DEPARTINDEX);
		Assert.assertEquals(objFlight.getTextDeparture(),Constants.DEPARTVALUE);
	 }
	 @Test(priority=11,groups= {"smoke"})
		
	 public void monthSelect()
	 {
		 objFlight=new FlightPage(driver); 
		 objFlight.selectMonth(Constants.MONTHINDEX);
		 Assert.assertEquals(objFlight.montText(),Constants.MONTHTEXT);
	 }
}
  