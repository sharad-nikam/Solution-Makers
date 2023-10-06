package com.sm.RedBus.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import com.sm.RedBus.factory.DriverFactory;
import com.sm.RedBus.pages.CabRentalPage;
import com.sm.RedBus.pages.HomePage;
import com.sm.RedBus.pages.RedBusFooter2;
import com.sm.RedBus.pages.TrainTicketPage;

public class Base {

	protected HomePage hmPage;
	protected RedBusFooter2 footert2Page;
	protected TrainTicketPage ttPage;
	protected CabRentalPage crPage;

	WebDriver driver;
	protected DriverFactory df;
	protected Properties prop;
	protected SoftAssert softAssert;

	@Parameters({ "browser", "browserversion" })
	@BeforeTest
	public void setup(String browserName, String browserVersion) {
		df = new DriverFactory(); // obj of DriverFactory class in SrcMainJava
		prop = df.initProp();
		if (browserName != null) {
			prop.setProperty("browser", browserName);
			prop.setProperty("browserversion", browserVersion);
		}
		driver = df.initDriver(prop);

		hmPage = new HomePage(driver);
		ttPage = new TrainTicketPage(driver);
		crPage = new CabRentalPage(driver);
		// loginPage = new LoginPage(driver);
		softAssert = new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
