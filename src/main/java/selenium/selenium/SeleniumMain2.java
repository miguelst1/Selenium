package selenium.selenium;

import java.io.IOException;

import org.openqa.selenium.By;

public class SeleniumMain2 {

	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox firefox = new DriverSeleniumFirefox();

		try {

			firefox.getDriver().get("http://www.google.es");

			firefox.getDriver().findElement(By.id("lst-ib")).sendKeys("primefaces showcase");

			firefox.getDriver().findElement(By.name("btnK")).click();
			// firefox.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

			firefox.getDriver().findElement(By.partialLinkText("PrimeFaces ShowCase")).click();

			firefox.getDriver().findElement(By.id("SubMenu-Data")).click();

			firefox.getDriver().findElement(By.partialLinkText("DataTable")).click();

			System.out.println(firefox.getDriver().findElement(By.id("j_idt115_head")).getText());

		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("No se ha encontrado el elemento");
		} finally {
			firefox.cerrarProceso();
		}
	}

}
