package com.sm.RedBus.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sm.RedBus.utils.AppConstants;
import com.sm.RedBus.utils.ElementUtil;
import com.sm.RedBus.utils.JavaScriptUtil;

public class CabRentalPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsu;
	Properties prop = new Properties();

	// 1. const. of the page class
	public CabRentalPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
		jsu = new JavaScriptUtil(this.driver);
	}

//By Locaters

	 
	private By logo = By.xpath(" //html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	private By ryde = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
	private By managebooking = By.xpath(" //div[contains(text(),'Manage Booking')]");
	private By managebookicon = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]");
	private By profile = By.xpath("//*[@id=\"reactContentMount\"]/div/div[1]/div/div/div/div[2]/div[2]/div/img[1]");
	private By outstation = By.xpath("//div[contains(text(),'OUTSTATION')]");
	private By hourlyRental = By.xpath("//div[contains(text(),'HOURLY RENTAL')]");
	private By airportTranfer = By.xpath("//*[@id=\"reactContentMount\"]/div/div[4]/div/div/div[3]/div[1]/div[3]");
	private By pickUplocation = By.xpath("//input[@id='source']");
	private By switchicon = By.xpath(
			"//body/div[@id='reactContentMount']/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/img[1]");
	private By destination = By.xpath("//input[@id='destination']");
	//private By pickUpDtandTm = By.xpath(
			//"/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By roundTrip = By.xpath(
			"xpath-/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[6]/label[1]/span[2]");
	private By searchButton = By.xpath("//div[contains(text(),'SEARCH')]");

	// *[@id="reactContentMount"]/div/div[4]/div/div/div[3]/div[1]/div[3]
	// page actions
	public boolean isLogoExist() {
		return eleUtil.checkElementIsDisplayed(logo);
	}
//	public void iscontactusclickable() {
//		eleUtil.checkElementIsDisplayed(contactus);
//		eleUtil.checkElementClickable(contactus, AppConstants.MEDIUM_DEFAULT_WAIT);
	// }

	public void getCabRentalPage() {
		String actTitle = driver.getTitle();
		 eleUtil.waitForTitleIsAndCapture(AppConstants.CAB_RENTAL_URL_PAGE, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isRideclickable() {
		eleUtil.checkElementClickable(ryde, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public String getCabRentalPageTitle() {
		return eleUtil.waitForTitleIsAndCapture(AppConstants.CAB_RENTAL_URL_PAGE,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		
	}
	public void ismanageBookingClickable() {
		eleUtil.checkElementIsDisplayed(managebooking);
		eleUtil.checkElementClickable(managebooking, AppConstants.SHORT_DEFAULT_WAIT);
	}

//	public void ismanageBookingiconClickable() {
//		eleUtil.checkElementIsDisplayed(managebookicon);
//		eleUtil.checkElementClickable(managebookicon, AppConstants.SHORT_DEFAULT_WAIT);
//	}
	public boolean isProfileClickable() {
		return eleUtil.checkElementIsDisplayed(profile);
	}

	public void isoutstationclickable() {
		eleUtil.doClick(outstation);
	}

	public boolean isHourlyRentalClickable() {
		return eleUtil.checkElementIsDisplayed(hourlyRental);
	}

	public boolean isAirportTransferClickable() {
		return eleUtil.checkElementIsDisplayed(airportTranfer);
	}

	public boolean isPickUpboxdisplay() {
		driver.findElement(pickUplocation).sendKeys("Pune Railway Station, Agarkar Nagar, Pune, Maharashtra, India");
		return eleUtil.checkElementIsDisplayed(pickUplocation);
	}

	public boolean isSwitchClickable() {
		return eleUtil.checkElementIsDisplayed(switchicon);
	}

	public boolean isDestinationboxdisplay() {
		driver.findElement(destination).sendKeys("Pune Airport Departure, New Airport Road, Pune International Airport Area, Sanjay Park, Pune, Maharashtra, India");
		return eleUtil.checkElementIsDisplayed(destination);
	}

//	public boolean isPickUpDtandTmboxdisplay() {
//	//	driver.findElement(pickUpDtandTm).sendKeys("Thu 10 Aug, 02:52 AM");
//		return eleUtil.checkElementIsDisplayed(pickUpDtandTm);
	//}

	public boolean isRoundTripdisplay() {
		return eleUtil.checkElementIsDisplayed(roundTrip);
	}

	public boolean isSearchdisplay() {
		return eleUtil.checkElementIsDisplayed(searchButton);
	}

}


