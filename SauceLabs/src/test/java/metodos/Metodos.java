package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void usuarioValido(By locator) {
		String texto = "standard_user";
		driver.findElement(locator).sendKeys(texto);
	}

	public void senhaválida(By locator) {
		String texto = "secret_sauce";
		driver.findElement(locator).sendKeys(texto);
	}

	public void escrever(By locator, String texto) {
		driver.findElement(locator).sendKeys(texto);
	}

	public void clicar(By locator) {
		driver.findElement(locator).click();

	}

	public void validarTexto(By locator, String textoEsperado) {
		String textoCapturado = driver.findElement(locator).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

	public void validarUrl(By locator, String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlCapturada, urlEsperada);
	}

}
