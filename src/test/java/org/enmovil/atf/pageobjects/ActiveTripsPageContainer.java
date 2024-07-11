package org.enmovil.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveTripsPageContainer {
	
	@FindBy(xpath="(//span[@class='counter']//span)[1]")
	private WebElement kpiConsignments;
	
	@FindBy(xpath="(//span[@class='counter']//span)[2]")
	private WebElement kpiTransitDelays;
	
	@FindBy(xpath="(//span[@class='counter']//span)[3]")
	private WebElement kpiOverspeed;
	
	@FindBy(xpath="(//span[@class='counter']//span)[4]")
	private WebElement kpiStoppages;
	
	@FindBy(xpath="(//span[@class='ag-name-value-value'])[1]")
	private WebElement gridCount;

	public WebElement getKpiConsignments() {
		return kpiConsignments;
	}

	public void setKpiConsignments(WebElement kpiConsignments) {
		this.kpiConsignments = kpiConsignments;
	}

	public WebElement getKpiTransitDelays() {
		return kpiTransitDelays;
	}

	public void setKpiTransitDelays(WebElement kpiTransitDelays) {
		this.kpiTransitDelays = kpiTransitDelays;
	}

	public WebElement getKpiOverspeed() {
		return kpiOverspeed;
	}

	public void setKpiOverspeed(WebElement kpiOverspeed) {
		this.kpiOverspeed = kpiOverspeed;
	}

	public WebElement getKpiStoppages() {
		return kpiStoppages;
	}

	public void setKpiStoppages(WebElement kpiStoppages) {
		this.kpiStoppages = kpiStoppages;
	}

	public WebElement getGridCount() {
		return gridCount;
	}

	public void setGridCount(WebElement gridCount) {
		this.gridCount = gridCount;
	}
	
	
	
	
	

}
