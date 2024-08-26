package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import page.Login;
import runner.Executa;

public class Teste {
	
	Login login = new Login();
	
	@BeforeEach
	public void abrirnavegador() {
		Executa.abrirNavegador();
	}
	
	
	@Test
	public void teste() {
		login.login();
		login.logout();
	}
	
	@AfterEach
	public void fecharNavegador() {
		//Executa.fecharNavegador();
	}

}
