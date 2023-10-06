package com.sm.RedBus.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sm.RedBus.utils.AppConstants;
import com.sm.RedBus.utils.ElementUtil;
import com.sm.RedBus.utils.JavaScriptUtil;

public class TrainTicketPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsu;
	Properties prop = new Properties();

	// 1. const. of the page class
	public TrainTicketPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
		jsu = new JavaScriptUtil(this.driver);
	}

	// 2. by locators:

	private By raillogo = By.xpath("//img[@alt='rails logo']");
	private By from = By.xpath("//input[@id='src']");
	private By to = By.xpath("//input[@id='dst']");
	private By searchbtn = By.xpath("//button[normalize-space()='SEARCH TRAINS']");
	private By headerHome = By.xpath("//a[normalize-space()='Home']");
	private By ttbookingTitle = By.xpath("//span[@class='text']");
	private By radiobuttonoftb = By.xpath("//div[@class='radio-button-outer red-border-radio']");
	private By radiobuttonofPNR = By.xpath("//div[@class='radio-button-outer false']");
	private By calender = By.xpath("//div[@class='home_date_wrap']");
	private By irctcTitle = By.xpath("//*[@id=\\\"root\\\"]/section[1]/div[2]/div[1]/div[2]/span[1]");
	private By irctcLogo = By.xpath("//img[@alt='irctc logo']");

	public String getTrainTicketPageTitle() {
		return eleUtil.waitForTitleIsAndCapture(AppConstants.TRAINTICKECT_PAGE_TITLE_VALUE,
				AppConstants.MEDIUM_DEFAULT_WAIT);
	}

	public boolean isHomedisplay() {
		return eleUtil.checkElementIsDisplayed(headerHome);
	}

	public boolean isLogoExist() {
		return eleUtil.checkElementIsDisplayed(raillogo);

	}

	public boolean irctcTitle() {
		return eleUtil.checkElementIsDisplayed(irctcTitle);
	}

	public boolean isirctcLogoExist() {
		return eleUtil.checkElementIsDisplayed(irctcLogo);

	}

	public boolean isBookttRadiodisplay() {
		return eleUtil.checkElementIsDisplayed(radiobuttonoftb);
	}

	public boolean isPNRdisplay() {
		return eleUtil.checkElementIsDisplayed(radiobuttonofPNR);
	}

	public boolean isfromtextboxdisplay() {
		return eleUtil.checkElementIsDisplayed(from);
	}

	public boolean istotextboxdisplay() {
		return eleUtil.checkElementIsDisplayed(to);
	}

	public boolean iscalenderdisplay() {
		return eleUtil.checkElementIsDisplayed(calender);
	}

	public TrainTicketPage ttPageSearchBtnTest() {
		eleUtil.checkElementIsDisplayed(searchbtn);
		return new TrainTicketPage(driver);
	}

}