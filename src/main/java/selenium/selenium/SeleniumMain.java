package selenium.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumMain {

	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox firefox = new DriverSeleniumFirefox();

		firefox.getDriver().get("http://www.google.es");

		firefox.getDriver().findElement(By.id("lst-ib"))
				.sendKeys("lista convocados selección española mundial 2018 rtve");

		firefox.getDriver().findElement(By.name("btnK")).click();
		// firefox.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

		System.out.println(firefox.getDriver().findElement(By.id("resultStats")).getText());

		firefox.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE.es")).click();

		List<WebElement> lista = firefox.getDriver().findElements(By.className("cartela"));

		for (WebElement webElement : lista) {
			System.out.println(webElement.getText());
		}

		firefox.cerrarProceso();
	}

}
