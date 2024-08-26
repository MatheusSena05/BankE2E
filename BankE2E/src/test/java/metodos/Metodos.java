package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By locator, String texto) {
		driver.findElement(locator).sendKeys(texto);
	}

	public void clicar(By locator) {
		driver.findElement(locator).click();
	}

	public void validarTexto(By locator, String textoEsperado) {
		String textoCapturado = driver.findElement(locator).getText();
		assertEquals(textoCapturado, textoEsperado);
	}
	
	public void validarUrl(String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlCapturada, urlEsperada);
	}
	
	public void esperarElemento(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void esperarElemento(By locator, int timer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timer));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
