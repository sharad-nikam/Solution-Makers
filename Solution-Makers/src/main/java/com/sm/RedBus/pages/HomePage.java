package com.sm.RedBus.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sm.RedBus.utils.*;

public class HomePage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsu;
	Properties prop = new Properties();

	// 1. const. of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
		jsu = new JavaScriptUtil(this.driver);
	}

	// 2. by locators:
	private By logo = By.xpath("//*[@id=\"main_header_new\"]/div/img");
	private By account = By.xpath("//*[@id=\"account_dd\"]/div[1]/span");
	private By from = By.id("src");
	private By to = By.cssSelector("#dest");
	private By search = By.xpath("//*[@id=\"search_button\"]");
	private By bustkt = By.xpath("//img[@alt='Bus Tickets']");
	private By cabrental = By.cssSelector("#cab_rental_vertical");
	private By traintkt = By.cssSelector("#rail_tickets_vertical");
	private By help = By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/ul[2]/li[1]/div[1]");
	private By aboutus = By.cssSelector("#about_us_footer");
	private By contactus = By.partialLinkText("Contact");
	private By terms_conditions = By.xpath("//a[@id='terms_n_conditions_footer']");
	private By faq = By.partialLinkText("FAQ");
	private By india_site = By.xpath("//a[@id=\"India_site_footer\"]");
	private By colombia_site = By.xpath("//a[@id=\"colombia_site_footer\"]");
	private By route = By.xpath("(//a[normalize-space()='Pune to Bangalore Bus'])[1]");

	// footer1
	private By toprtc = By.cssSelector("#top_bus_routes_seo");
	private By toprtList = By.xpath("//li[@id='top_rtc_seo']");
	private By apsrt = By.cssSelector("#top_rtc_seo_apsrtc");
	private By msrtc = By.cssSelector("#top_rtc_seo_msrtc");
	private By topBusRoute = By.xpath("//h3[contains(text(),'Top bus routes')]");
	private By hyd_benRoute = By.xpath("//a[@id='top_bus_routes_seo_hyd_to_blr']");
	private By ben_cheRoute = By.xpath("//a[@id='top_bus_routes_seo_blr_to_chn']");
	private By top_cities = By.cssSelector("#top_cities_seo");
	private By hyd_bustkt = By.cssSelector("#top_cities_seo_hyd");
	private By ben_bustkt = By.cssSelector("#top_cities_seo_blr");
	private By tempo_tra = By.cssSelector("#tempo_traveller_seo");
	private By tempo_mum = By.cssSelector("#tempo_traveller_seo_mum");
	private By tempo_ahm = By.cssSelector("#tempo_traveller_seo_ahm");

	// private footer = By.cssSelector(".rb_footer");

	private String searchPageUrl = "\"https://www.redbus.in/bus-tickets/kolhapur-maharashtra-to-pune?fromCityName=Kolhapur(Maharashtra)&fromCityId=76079&srcCountry=IND&toCityName=Pune&toCityId=130&destCountry=IND&onward=10-Aug-2023&opId=0&busType=Any\"";
	private By searchPage = By.linkText(
			"https://www.redbus.in/bus-tickets/kolhapur-maharashtra-to-pune?fromCityName=Kolhapur(Maharashtra)&fromCityId=76079&srcCountry=IND&toCityName=Pune&toCityId=130&destCountry=IND&onward=10-Aug-2023&opId=0&busType=Any");

	// 3. page actions:
	public String getHomePageTitle() {
		return eleUtil.waitForTitleIsAndCapture(AppConstants.HOME_PAGE_TITLE_VALUE, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public boolean isLogoExist() {
		return eleUtil.checkElementIsDisplayed(logo);
	}

	public void isbustktclickable() {
		eleUtil.checkElementIsDisplayed(bustkt);
		eleUtil.checkElementClickable(bustkt, AppConstants.SHORT_DEFAULT_WAIT);

	}

	public void iscabrentalclickable() {
		eleUtil.checkElementIsDisplayed(cabrental);
		eleUtil.checkElementClickable(cabrental, AppConstants.SHORT_DEFAULT_WAIT);

	}

	public void istraintktclickable() {
		eleUtil.checkElementIsDisplayed(traintkt);
		eleUtil.checkElementClickable(traintkt, AppConstants.SHORT_DEFAULT_WAIT);

	}

	public void ishelpbtnclickable() {
		eleUtil.checkElementIsDisplayed(help);
		eleUtil.checkElementClickable(help, AppConstants.SHORT_DEFAULT_WAIT);

	}

	public void isaccountclickable() {
		// eleUtil.checkElementIsDisplayed(account);
		eleUtil.checkElementClickable(account, AppConstants.SHORT_DEFAULT_WAIT);

	}

	public boolean isfromtextboxdisplay() {
		return eleUtil.checkElementIsDisplayed(from);
	}

	public boolean istotextboxdisplay() {
		return eleUtil.checkElementIsDisplayed(to);
	}

	public boolean issearchbtndisplay() {
		return eleUtil.checkElementIsDisplayed(search);
	}

	public void movingToFooter() {
		jsu.scrollPageDown();

	}

	public void isTopRTCsdisplay() {

		eleUtil.IsElementDisplayed(toprtc);
	}

	public void isAsprtcClickable() {

		eleUtil.checkElementClickable(apsrt, AppConstants.SHORT_DEFAULT_WAIT);

	}

	public void isMsrtcClickable() {
		eleUtil.checkElementClickable(msrtc, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isTopBusRouteDisplay() {
		eleUtil.checkElementIsDisplayed(topBusRoute);
	}

	public void isHydBenRouteClickable() {
		eleUtil.checkElementClickable(hyd_benRoute, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isBenCheRouteClickable() {
		eleUtil.checkElementClickable(ben_cheRoute, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isTopCitiesDisplay() {
		eleUtil.checkElementIsDisplayed(top_cities);
	}

	public void isHydBusTktClickable() {
		eleUtil.checkElementClickable(hyd_bustkt, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isBenBusTktClickable() {
		eleUtil.checkElementClickable(ben_bustkt, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isTempoTravDisplay() {
		eleUtil.checkElementIsDisplayed(tempo_tra);
	}

	public void isTempoMumIsClickable() {
		eleUtil.checkElementClickable(tempo_mum, AppConstants.MEDIUM_DEFAULT_WAIT);
	}

	public void isTempoAhmIsClickable() {
		eleUtil.checkElementClickable(tempo_ahm, AppConstants.MEDIUM_DEFAULT_WAIT);
	}

	public WebElement isaboutusclickable() {
		// private jsu = new JavaScriptUtil();

		eleUtil.checkElementIsDisplayed(aboutus);
		return eleUtil.checkElementClickable(aboutus, AppConstants.MEDIUM_DEFAULT_WAIT);
		// driver.navigate().to("https://www.redbus.in/");
		// driver.switchTo().window(getHomePageTitle());

	}

	public void iscontactusclickable() {
		eleUtil.checkElementIsDisplayed(contactus);
		eleUtil.checkElementClickable(contactus, AppConstants.MEDIUM_DEFAULT_WAIT);
	}

//	public void istermconditionsclickable() {
//		eleUtil.checkElementIsDisplayed(terms_conditions);
//	   eleUtil.checkElementClickable(terms_conditions, AppConstants.SHORT_DEFAULT_WAIT);
//	}
	// change
	public boolean istermconditionsdisplayclickable() {
		return eleUtil.checkvisibleandclickable(terms_conditions);
	}

	public void isfaqclickable() {
		eleUtil.checkElementIsDisplayed(faq);
		eleUtil.checkElementClickable(faq, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void isindia_siteclickable() {
		eleUtil.checkElementIsDisplayed(india_site);
		eleUtil.checkElementClickable(india_site, AppConstants.SHORT_DEFAULT_WAIT);
	}

	public void iscolombia_siteclickable() {
		eleUtil.checkElementIsDisplayed(colombia_site);
		eleUtil.checkElementClickable(colombia_site, AppConstants.SHORT_DEFAULT_WAIT);

	}
	
	public RedBusFooter2 footerListSetUp() {
		eleUtil.checkElementIsDisplayed(aboutus);
		return new RedBusFooter2(driver);
	}
	
	public TrainTicketPage navigateTottPage() {
		eleUtil.doClick(traintkt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
		return new TrainTicketPage(driver);

	}
	
	public CabRentalPage navigateToCabPage() {
		eleUtil.doClick(cabrental);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		return new CabRentalPage(driver);

}

}
