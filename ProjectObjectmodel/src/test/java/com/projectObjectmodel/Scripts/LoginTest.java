package com.projectObjectmodel.Scripts;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.projectObjectmodel.Base.TestBase;
import com.projectObjectmodel.Pages.LoginPage;
import com.projectObjectmodel.constants.Constants;
import com.projectObjectmodel.utilities.ExcelRead;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
	LoginPage objLogin;
	@Test(dataProvider="invalidUserinvalidPassword",priority=1,groups= {"smoke"},retryAnalyzer=com.projectObjectmodel.listeners.RetryAnalyzer.class)
	public void verifySignIninvalidUserinvalidPassword(String userName,String password1) {

		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(userName);
		  objLogin.setpassword(password1);
		  objLogin.clicksignin();
		  SoftAssert assert1=new SoftAssert();
		  assert1.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
		  assert1.assertAll();
		  
	}
	@Test(dataProvider="validUserinvalidPassword",priority=2,groups= {"smoke"})
	public void verifySignInvalidUserinvalidPassword(String userName,String password1) {

		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(userName);
		  objLogin.setpassword(password1);
		  objLogin.clicksignin();
		  SoftAssert assert1=new SoftAssert();
		  assert1.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
		  assert1.assertAll();
		  
	}
  @Test(dataProvider="invalidUservalidPassword",priority=3,groups= {"smoke"})
  public void verifySignIninvalidUservalidPassword(String userName,String password1) {
 
	  objLogin=new LoginPage(driver);
	  objLogin.setUsername(userName);
	  objLogin.setpassword(password1);
	  objLogin.clicksignin();
	  SoftAssert assert1=new SoftAssert();
	  assert1.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
	  assert1.assertAll();
	  
  }
 @Test(dataProvider="validUservalidPassword",priority=4,groups= {"smoke"})
  public void verifySignInvalidUservalidPassword(String userName,String password1) {

  	  objLogin=new LoginPage(driver);
  	  objLogin.setUsername(userName);
  	  objLogin.setpassword(password1);
  	  objLogin.clicksignin();
  	  SoftAssert assert1=new SoftAssert();
  	  assert1.assertEquals(driver.getTitle(), Constants.HOMETITLE);
  	  assert1.assertAll();
  	  
  }








@DataProvider
public Object[][] invalidUserinvalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(0, 0,Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(0, 1,Constants.Sheet1);
	  return data;
}
@DataProvider
public Object[][] validUserinvalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(1, 0,Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(1, 1,Constants.Sheet1);
  return data;
}
@DataProvider
public Object[][] invalidUservalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(2, 0,Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(2, 1,Constants.Sheet1);
	  return data;
}
@DataProvider
public Object[][] validUservalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(3, 0, Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(3, 1,Constants.Sheet1);
	  return data;
}
}




