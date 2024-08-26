package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import page.HomePage;
import page.LoginPage;
import runner.Executa;

public class Login {

	HomePage home = new HomePage();
	LoginPage login = new LoginPage();

	@BeforeEach
	public void abrirNavegador() {
		Executa.abrirNavegador();
	}

	@Test
	public void login() {
		login.loginValido("028.919.919-80", "12345");
	}

	@Test
	public void loginEmBranco() {
		login.loginEmBranco("Usuário ou senha incorretos");
	}
	
	@Test
	public void CancelarLogin() {
		login.CancelarLogin();
	}
	
	@Test
	public void loginSemSenha() {
		login.loginSemPreencherSenha("028.919.919-80", "Usuário ou senha incorretos");
		
	}
	
	@Test
	public void loginSemCpf() {
		login.loginSemPreencherCpf("123456", "Usuário ou senha incorretos");
		
	}

	@AfterEach
	public void fecharNavegador() {
		Executa.fecharNavegador();
	}
}
