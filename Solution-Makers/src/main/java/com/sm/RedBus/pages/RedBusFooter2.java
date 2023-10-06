package com.sm.RedBus.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sm.RedBus.utils.AppConstants;
import com.sm.RedBus.utils.ElementUtil;
import com.sm.RedBus.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class RedBusFooter2 {
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsu;

	public RedBusFooter2(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
		jsu = new JavaScriptUtil(this.driver);
	}

	private By topRTCsFooterList = By.xpath("//li[@id='top_rtc_seo']");
	private By otherFooterList = By.xpath("//li[@id='other_seo']");
	private By topBusRoutesFooterList = By.xpath("//li[@id='top_bus_routes_seo']");
	private By topCitiesFooterList = By.xpath("//li[@id='top_cities_seo']");
	private By tempoTravellersInCitiesFooterList = By.xpath("//li[@id='tempo_traveller_seo']");

	private By aboutRedBusFooterList = By.xpath("//li[@id='about_redbus_title_footer']");
	private By infoFooterList = By.xpath("//li[@id='info_title_footer']");
	private By globalSitesFooterList = By.xpath("//li[@id='global_sites_title_footer']");
	private By ourPartnersFooterList = By.xpath("//li[@id='our_partners_title_footer']");

	@Step("getting footer links For Top RTC's list")
	public List<String> getFooterLinksListForTopRTCs() {
		WebElement footerContainer = eleUtil.waitForElementVisible(topRTCsFooterList, AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For other list")
	public List<String> getFooterLinksListForOther() {
		WebElement footerContainer = eleUtil.waitForElementVisible(otherFooterList, AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For top bus routes list")
	public List<String> getFooterLinksListForTopBusRoutes() {
		WebElement footerContainer = eleUtil.waitForElementVisible(topBusRoutesFooterList,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For top cities list")
	public List<String> getFooterLinksListForTopCities() {
		WebElement footerContainer = eleUtil.waitForElementVisible(topCitiesFooterList,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For tempo travellers in cities list")
	public List<String> getFooterLinksListForTempoTravellersInCities() {
		WebElement footerContainer = eleUtil.waitForElementVisible(tempoTravellersInCitiesFooterList,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For About RedBus list")
	public List<String> getFooterLinksListForAboutRedBus() {
		WebElement footerContainer = eleUtil.waitForElementVisible(aboutRedBusFooterList,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For Info list")
	public List<String> getFooterLinksListForInfo() {
		WebElement footerContainer1 = eleUtil.waitForElementVisible(infoFooterList, AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer1.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links For Globle sites list")
	public List<String> getFooterLinksListForGlobleSites() {
		WebElement footerContainer = eleUtil.waitForElementVisible(globalSitesFooterList,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}

	@Step("getting footer links for Our Partners List")
	public List<String> getFooterLinksListForOurPartners() {
		WebElement footerContainer = eleUtil.waitForElementVisible(ourPartnersFooterList,
				AppConstants.MEDIUM_DEFAULT_WAIT);
		List<WebElement> footerLinksList = footerContainer.findElements(By.tagName("a"));
		List<String> footerTextList = new ArrayList<String>();
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			footerTextList.add(text);
		}
		return footerTextList;
	}
}
