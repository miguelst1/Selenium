package selenium.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SeleniumMain3 {

	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox firefox = new DriverSeleniumFirefox();

		try {

			firefox.getDriver().get("http://www.eltiempo.es");

			firefox.getDriver().findElement(By.id("inputSearch")).sendKeys("Écija");

			firefox.getDriver().findElement(By.id("inputSearch")).sendKeys(Keys.ENTER);

			firefox.esperarElementoEsteVisibleById("Écija, Sevilla");

			List<WebElement> lista = firefox.getDriver().findElements(By.className("m_table_weather_day_temp_wrapper"));

			for (WebElement webElement : lista) {
				if (webElement.getAttribute("outerHTML").contains("25 May, 14:00")) {
					webElement.click();
				}
			}

			List<WebElement> lista2 = firefox.getDriver().findElements(By.className("table_tooltip_wrapper"));

			for (WebElement webElement : lista2) {
				System.out.println(webElement.getText());
			}

		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("No se ha encontrado el elemento");
		} finally {
			firefox.cerrarProceso();
		}
	}

}
