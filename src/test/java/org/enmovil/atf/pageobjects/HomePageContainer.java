package org.enmovil.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageContainer {
	
	@FindBy(xpath="//img[@id='sidebar-toggle']")
	private WebElement sidebarToggle;
	
	@FindBy(xpath="//a[text()=\"FTL Consignments\"]")
	private WebElement ftlConsignments;
	
	@FindBy(xpath="//a[@href=\"/prtconsignments\"]")
	private WebElement activeTrips;
	
	@FindBy(xpath="//a[@href=\"/prtdeliveredconsignments\"]")
	private WebElement deliveredTrips;
	
	@FindBy(xpath="//a[@href=\"/prtallconsignments\"]")
	private WebElement allTrips;
	
	@FindBy(xpath="//a[text()=\"Courier Consignments\"]")
	private WebElement courierConsignments;
	
	@FindBy(xpath="//a[@href=\"/activecourierconsignments\"]")
	private WebElement courierActiveTrips;
	
	@FindBy(xpath="//a[@href=\"/deliveredcourierconsignments\"]")
	private WebElement courierDeliveredTrips;
	
	@FindBy(xpath="//a[@href=\"/courierconsignments\"]")
	private WebElement courierAllTrips;
	
	

	public WebElement getSidebarToggle() {
		return sidebarToggle;
	}

	public void setSidebarToggle(WebElement sidebarToggle) {
		this.sidebarToggle = sidebarToggle;
	}



	public WebElement getActiveTrips() {
		return activeTrips;
	}

	public void setActiveTrips(WebElement activeTrips) {
		this.activeTrips = activeTrips;
	}

	public WebElement getDeliveredTrips() {
		return deliveredTrips;
	}

	public void setDeliveredTrips(WebElement deliveredTrips) {
		this.deliveredTrips = deliveredTrips;
	}

	public WebElement getAllTrips() {
		return allTrips;
	}

	public void setAllTrips(WebElement allTrips) {
		this.allTrips = allTrips;
	}

	public WebElement getFtlConsignments() {
		return ftlConsignments;
	}

	public void setFtlConsignments(WebElement ftlConsignments) {
		this.ftlConsignments = ftlConsignments;
	}

	public WebElement getCourierConsignments() {
		return courierConsignments;
	}

	public void setCourierConsignments(WebElement courierConsignments) {
		this.courierConsignments = courierConsignments;
	}

	public WebElement getCourierActiveTrips() {
		return courierActiveTrips;
	}

	public void setCourierActiveTrips(WebElement courierActiveTrips) {
		this.courierActiveTrips = courierActiveTrips;
	}

	public WebElement getCourierDeliveredTrips() {
		return courierDeliveredTrips;
	}

	public void setCourierDeliveredTrips(WebElement courierDeliveredTrips) {
		this.courierDeliveredTrips = courierDeliveredTrips;
	}

	public WebElement getCourierAllTrips() {
		return courierAllTrips;
	}

	public void setCourierAllTrips(WebElement courierAllTrips) {
		this.courierAllTrips = courierAllTrips;
	}
	



	

	


	
	
	

}
