package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sm.RedBus.base.Base;
import com.sm.RedBus.utils.AppConstants;

public class TrainTicketPageTest extends Base {

	@BeforeTest
	public void TrainTicketPageSetup() {
		hmPage.navigateTottPage();
	}

	@Test(priority = 1)
	public void ttPageTitleTest() {
		String actTitle = ttPage.getTrainTicketPageTitle();
		Assert.assertEquals(actTitle, AppConstants.TRAINTICKECT_PAGE_TITLE_VALUE);
	}

	@Test(priority = 2)
	public void ttPageLogoTest() {
		Assert.assertTrue(ttPage.isLogoExist());

	}

	@Test(priority = 3)
	public void HomeTest() {
		Assert.assertTrue(ttPage.isHomedisplay());
	}

	@Test(priority = 4)
	public void irctcLogoTest() {
		Assert.assertTrue(ttPage.isirctcLogoExist());

	}

	@Test(priority = 5)
	public void BookTrainBtnTest() {
		Assert.assertTrue(ttPage.isBookttRadiodisplay());

	}

	@Test(priority = 6)
	public void PNRTest() {
		Assert.assertTrue(ttPage.isPNRdisplay());

	}

	@Test(priority = 7)
	public void ttPagefromTextBoxTest() {
		Assert.assertTrue(ttPage.isfromtextboxdisplay());

	}

	@Test(priority = 8)
	public void ttPageToTextBoxTest() {
		Assert.assertTrue(ttPage.istotextboxdisplay());

	}

	@Test(priority = 9)
	public void calenderTest() {
		Assert.assertTrue(ttPage.iscalenderdisplay());

	}

	@Test(priority = 10)
	public void checkSearchIsDisplayed() {
		ttPage = ttPage.ttPageSearchBtnTest();
		// Assert.assertTrue(srcPage.clickSearchButton());
	}
}
