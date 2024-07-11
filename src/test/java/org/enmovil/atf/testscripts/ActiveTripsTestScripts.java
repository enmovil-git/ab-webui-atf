package org.enmovil.atf.testscripts;

import org.enmovil.atf.config.BrowserDriver;
import org.enmovil.atf.config.PropertyLoader;
import org.enmovil.atf.data.DataConfig;
import org.enmovil.atf.data.LoginData;
import org.enmovil.atf.services.ActiveTripsServices;
import org.enmovil.atf.services.HomePageService;
import org.enmovil.atf.services.LoginPageService;
import org.enmovil.atf.util.BaseListener;
import org.enmovil.atf.validations.ActiveTripsPageValidations;
import org.enmovil.atf.validations.LoginPageValidations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActiveTripsTestScripts extends BaseListener {
	
	LoginPageService loginService = null;
	LoginData logindata = null;
	HomePageService homePageService = null;
	LoginPageValidations loginPageValidations = null;
	ActiveTripsServices activeTripsServices = null;
	ActiveTripsPageValidations activeTripsPageValidations = null;
	
	@BeforeClass
	public void init() {
		
		loginService = new LoginPageService();
		homePageService = new HomePageService();
		logindata = new DataConfig().getLoginData();
		loginPageValidations = new LoginPageValidations();
		activeTripsServices = new ActiveTripsServices();
		activeTripsPageValidations = new ActiveTripsPageValidations();
		InitializeViews.init();
		logger = extent.createTest("VE:: Data Verification");
//		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getVEUrl());
//		loginService.loginToAMNSApplication(logindata.getUserName(), logindata.getPassWord());
	}
	
	@Test(description="Validate the KPIs Count",priority=0)
	public void validateCount() {
	   activeTripsServices.clickKPI();
	}
	@AfterClass
    public void closeBrowser() {
		BrowserDriver.closeBrowser();
    	
    }
}
