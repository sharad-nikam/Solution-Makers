package com.sm.RedBus.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sm.RedBus.utils.AppConstants;
import com.sm.RedBus.base.Base;

public class RedBusFooter2Test extends Base {

	@BeforeTest
	public void footerTestSetUp() {
		footert2Page = hmPage.footerListSetUp();
	}

	@Test(priority = 1)
	public void f2PageFootersTopRTCsTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForTopRTCs();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_TOP_RTCS_FOOTERS_LIST,
				"Link is not present in the list");
	}

	@Test(priority = 2)
	public void f2PageFootersOtherTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForOther();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_OTHER_FOOTERS_LIST, "Link is not present in the list");
	}

	@Test(priority = 3)
	public void f2PageFootersTopBusRoutesTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForTopBusRoutes();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_TOP_BUS_ROUTES_FOOTERS_LIST,
				"Link is not present in the list");
	}

	@Test(priority = 4)
	public void f2PageFootersTopCitiesTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForTopCities();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_TOP_CITIES_FOOTERS_LIST,
				"Link is not present in the list");
	}

	@Test(priority = 5)
	public void f2PageFootersTempoTravellersInCitiesTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForTempoTravellersInCities();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_TEMPO_TRAVELLER_IN_CITIES_FOOTERS_LIST,
				"Link is not present in the list");
	}

	@Test(priority = 6)
	public void f2PageFootersAboutRedBusTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForAboutRedBus();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_ABOUT_REDBUS_FOOTERS_LIST,
				"Link is not present in the list");
	}

	@Test(priority = 7)
	public void f2PageFootersInfoTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForInfo();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_INFO_FOOTERS_LIST, "Link is not present in the list");
	}

	@Test(priority = 8)
	public void f2PageFootersGlobleSitesTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForGlobleSites();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_GLOBAL_SITES_FOOTERS_LIST,
				"Link is not present in the list");
	}

	@Test(priority = 9)
	public void f2PageFootersOurPartnersTest() {
		List<String> actAccHeadersList = footert2Page.getFooterLinksListForOurPartners();
		Assert.assertEquals(actAccHeadersList, AppConstants.EXP_OUR_PARTNERS_FOOTERS_LIST,
				"Link is not present in the list");
	}

}
