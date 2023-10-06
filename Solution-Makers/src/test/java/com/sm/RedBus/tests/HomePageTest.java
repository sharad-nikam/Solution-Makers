package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sm.RedBus.base.Base;
import com.sm.RedBus.utils.AppConstants;

public class HomePageTest extends Base {

	@Test(priority = 1)
	public void hmPageTitleTest() {
		String actTitle = hmPage.getHomePageTitle();
		Assert.assertEquals(actTitle, AppConstants.HOME_PAGE_TITLE_VALUE);
	}

	@Test(priority = 2)
	public void hmPageLogoTest() {
		Assert.assertTrue(hmPage.isLogoExist());

	}

	@Test(priority = 3)
	public void hmPageBusTktTest() {
		hmPage.isbustktclickable();

	}

	@Test(priority = 4)
	public void hmPageCabRentalTest() {
		hmPage.iscabrentalclickable();

	}

	@Test(priority = 5)
	public void hmPageTrainTktTest() {
		hmPage.istraintktclickable();

	}

	@Test(priority = 6)
	public void hmPageHelpBtnTest() {
		hmPage.ishelpbtnclickable();

	}

	@Test(priority = 7)
	public void hmPageAccountBtnTest() {
		hmPage.isaccountclickable();

	}

	@Test(priority = 8)
	public void hmPageFromTextBoxTest() {
		Assert.assertTrue(hmPage.isfromtextboxdisplay());

	}

	@Test(priority = 9)
	public void hmPageToTextBoxTest() {
		Assert.assertTrue(hmPage.istotextboxdisplay());

	}

	@Test(priority = 10)
	public void hmPageSearchBtnTest() {
		Assert.assertTrue(hmPage.issearchbtndisplay());
	}

	@Test(priority = 11)
	public void hmPageFooterRtcTest() {
		hmPage.movingToFooter();
		hmPage.isTopRTCsdisplay();
	}

	@Test(priority = 12)
	public void hmPageFooterApsrtTest() {
		hmPage.isAsprtcClickable();
	}

	@Test(priority = 13)
	public void hmPageFooterMsrtcTest() {
		hmPage.isMsrtcClickable();
	}

	@Test(priority = 14)
	public void hmPageFooterTopBusRoutes() {
		hmPage.isTopBusRouteDisplay();
	}

	@Test(priority = 15)
	public void hmPageFooterHydBenRoute() {
		hmPage.isHydBenRouteClickable();
	}

	@Test(priority = 16)
	public void hmPageFooterBenCheRoute() {
		hmPage.isBenCheRouteClickable();
	}

	@Test(priority = 17)
	public void hmPageFooterTopCities() {
		hmPage.isTopCitiesDisplay();
	}

	@Test(priority = 18)
	public void hmPageFooterHydBusTkt() {
		hmPage.isHydBusTktClickable();
	}

	@Test(priority = 20)
	public void hmPageFooterBenBusTkt() {
		hmPage.isBenBusTktClickable();
	}

	@Test(priority = 21)
	public void hmPageTempoDisplay() {
		hmPage.isTempoTravDisplay();
	}

	@Test(priority = 22)
	public void hmPageMumTempoTest() {
		hmPage.isTempoMumIsClickable();
	}

	@Test(priority = 23)
	public void hmPageAhmTempoTest() {
		hmPage.isTempoAhmIsClickable();
	}

	@Test(priority = 24)
	public void hmPageAboutUsTest() {
		hmPage.isaboutusclickable();

	}

	@Test(priority = 25)
	public void hmPageContactUsTest() {
		hmPage.iscontactusclickable();
	}

	@Test(priority = 26)
	public void hmPagetermsandsconditionsTest() {
		Assert.assertTrue(hmPage.istermconditionsdisplayclickable());
	}

	@Test(priority = 27)
	public void hmPagefaqTest() {
		hmPage.isfaqclickable();
	}

	@Test(priority = 28)
	public void hmPageindia_siteTest() {
		hmPage.isindia_siteclickable();
	}

	@Test(priority = 29)
	public void hmPagecolombia_siteTest() {
		hmPage.iscolombia_siteclickable();
		
	}

}