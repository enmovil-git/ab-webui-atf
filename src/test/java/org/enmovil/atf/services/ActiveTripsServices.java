package org.enmovil.atf.services;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.enmovil.atf.config.BrowserDriver;
import org.enmovil.atf.pageobjects.ActiveTripsPageContainer;
import org.openqa.selenium.support.PageFactory;

public class ActiveTripsServices {
	
	public static ActiveTripsPageContainer activeTripsPageContainer;
	private static Logger log = Logger.getLogger(ActiveTripsServices.class);
	
	public ActiveTripsServices clickKPI() {
		
		BrowserDriver.wait(5);
		 activeTripsPageContainer.getKpiConsignments().click();
		 String counterConsignments = activeTripsPageContainer.getKpiConsignments().getText();
			System.out.println("Count of KPI Consignments: " + counterConsignments);
			BrowserDriver.scrollDown();
			String gridText = activeTripsPageContainer.getGridCount().getText();
			System.out.println("grid count for the KPI: " + gridText);
		assertEquals(counterConsignments, gridText);
		
		return this;
		
	
	}
	
	public static void init() {
		activeTripsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ActiveTripsPageContainer.class);
	}

}
