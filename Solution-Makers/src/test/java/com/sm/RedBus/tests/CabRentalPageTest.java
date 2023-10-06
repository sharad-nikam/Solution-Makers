package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sm.RedBus.base.Base;
import com.sm.RedBus.utils.AppConstants;

public class CabRentalPageTest extends Base {

	@BeforeTest
	public void cabRentalPageSetup() {
		hmPage.navigateToCabPage();
	}

	@Test(priority = 1)
	public void crPageTitleTest() {

		String actTitle = crPage.getCabRentalPageTitle();
		Assert.assertEquals(actTitle, AppConstants.CAB_RENTAL_URL_PAGE);
	}

	@Test(priority = 2)
	public void cabRentalManagebookingTest() {
		crPage.ismanageBookingClickable();
	}

	@Test(priority = 3)
	public void profileTest() {
		crPage.isProfileClickable();
	}

	@Test(priority = 4)
	public void outstationTest() {
		crPage.isoutstationclickable();
	}

	@Test(priority = 5)
	public void hourlyRentalTest() {
		crPage.isHourlyRentalClickable();
	}

	@Test(priority = 6)
	public void airportTransferTest() {
		crPage.isHourlyRentalClickable();
	}

	@Test(priority = 7)
	public void pickUpLocationTest() {
		crPage.isPickUpboxdisplay();
	}

	@Test(priority = 8)
	public void switchiconTest() {
		crPage.isSwitchClickable();
	}

	@Test(priority = 9)
	public void destinationTest() {
		crPage.isDestinationboxdisplay();
	}

//	@Test(priority = 10)
//	public void pickUpDtandTm() {
//		crPage.isPickUpDtandTmboxdisplay();
//	}

	@Test(priority = 10)
	public void roundTrip() {
		crPage.isRoundTripdisplay();
	}

	@Test(priority = 11)
	public void searchButtonTest() {
		crPage.isSearchdisplay();

	}

}
