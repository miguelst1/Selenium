package selenium.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DriverSeleniumFirefox extends DriverSelenium {

	private static final String FIREFOX_PROFILE_DEFAULT = "TestUnitario";

	public DriverSeleniumFirefox() {

		final StringBuilder path = new StringBuilder();

		path.append("C:\\geckodriver.exe");

		System.setProperty("webdriver.gecko.driver", path.toString());

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

		final FirefoxOptions options = new FirefoxOptions();

		final ProfilesIni profilesIni = new ProfilesIni();

		options.setProfile(profilesIni.getProfile(FIREFOX_PROFILE_DEFAULT));

		driver = new FirefoxDriver(options);

		driver.manage().window().maximize();
	}
}
