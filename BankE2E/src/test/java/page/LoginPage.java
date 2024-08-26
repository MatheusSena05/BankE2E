package page;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class LoginPage {

	By btnContinuar = By.xpath("//button[@class='form-button']");
	By cpfEmail = By.xpath("//input[@name='username']");
	By senha = By.xpath("//input[@name='password']");
	By msgErrorLogin = By.xpath("//*[text()='Usuário ou senha incorretos']");
	By btnCancelar = By.xpath("//button[@class='form-button secondary-button']");

	String Url = "http://52.2.114.98/";

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void loginValido(String cpf, String senha) {

		metodo.validarUrl(Url);
		metodo.clicar(elemento.btnLogin);
		metodo.escrever(this.cpfEmail, cpf);
		metodo.escrever(this.senha, senha);
		metodo.clicar(btnContinuar);
	}

	public void loginEmBranco(String textoEsperado) {
		metodo.clicar(elemento.btnLogin);
		metodo.clicar(this.btnContinuar);
		metodo.esperarElemento(msgErrorLogin);
		metodo.validarTexto(this.msgErrorLogin, textoEsperado);
	}
	
	public void loginSemPreencherSenha(String cpf, String msgEsperado) {
		metodo.clicar(elemento.btnLogin);
		metodo.escrever(this.cpfEmail, cpf);
		metodo.clicar(btnContinuar);
		metodo.esperarElemento(msgErrorLogin);
		metodo.validarTexto(msgErrorLogin, msgEsperado);
	}
	
	public void CancelarLogin() {
		metodo.clicar(elemento.btnLogin);
		metodo.clicar(btnCancelar);
	}
	
	public void loginSemPreencherCpf(String senha, String msgEsperado) {
		metodo.clicar(elemento.btnLogin);
		metodo.escrever(this.senha, senha);
		metodo.clicar(btnContinuar);
		metodo.esperarElemento(msgErrorLogin);
		metodo.validarTexto(msgErrorLogin, msgEsperado);
	}

}
