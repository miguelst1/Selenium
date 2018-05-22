package selenium.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSelenium {

	static protected WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void cerrarProceso() throws IOException {

		if (getDriver() instanceof DriverSeleniumFirefox) {

			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");

		} else {

			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");

		}

		System.out.println("Prueba finalizada");

	}

	public void esperarElementoEsteVisibleById(String id) {
		final WebDriverWait wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(id))).click();
	}
}
